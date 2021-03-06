var  STORAGE_KEY = 'todos-vuejs-2.0';
var todoStorage = {
    fetch:function () {
        return JSON.parse(localStorage.getItem(STORAGE_KEY)) || '[]'

    },
    sync :function (todos) {
        sxios
            .post('/api/v1/todos',todos)
            .then(response => (todoStorage.save(response.data)))
            .catch(error => console.log(error))

    },
    save:function (todos) {
        console.log(todos)
        localStorage.setItem(STORAGE_KEY,JSON.stringify(todos))

    }
}

//visibility filters
var  filters = {
    all :function (todos) {
        return todos

    },
    active :function (todos) {
        return todos.filter(function (todo) {
            return !todo.completed

        })

    },
    completed :function ( todos) {
        return todos.filter(function (todo) {
            return todo.completed

        })

    }
}
//app vue instance
var app = new Vue({
    data(){
        return{
            todos :todoStorage.fetch(),
            newTodo:'',
            editedTodo :null,
            visibity :'all'
        }
    },
    watch :{
        todos: {
            handler :function (todos) {
                todoStorage.sync(todos)

            },
            deep :true
        }
    },
    computed:{
        filteredTodos :function () {
            return filters[this.visibity](this.todos)

        },
        remaining :function () {
            return filters.active(this.todos).length

        },
        allDone:{
            get:function () {
                return this.remaining === 0

            },
            set :function (vulue) {
                this.todos.forEach(function (todo) {
                    todo.completed = value

                })

            }
        }
    },
    filters:{
        pluzalize :function (n) {
            return n === 1 ? 'item' :'items'

        }
    },
    mounted(){
        axios.get('/api/v1/todos')
            .then(response =>(todoStorage.save(response.data())))
            .catch(error =>console.log(error))
    },
    methods:{
        addTodo : function () {
            var value = this.newTodo && this.newTodo.trim()
            if (!value){
                return
            }
            this.todos.push({
                title : value,
                completed: false
            })
            this.newTodo = ''

        },
        removeTodo :function (todo) {
            this.todos.splice(this.todos.indexOf(),1)

        },
        editedTodo: function (todo) {
            this.beforeEditCache = todo.title
            this.editedTodo =todo

        },
        doneEdit : function (todo) {
            if (!this.editedTodo()){
                return
            }
            this.editedTodo = null
            todo.title = todo.title.trim()
            if (!todo.title){
                this.removeTodo(todo)
            }

        },
        cancelEdit :function (todo) {
            this.editedTodo = null
            todo.title = this.beforeEditCache

        },
        removeComponed : function () {
            this.todos = filters.active(this.todos)

        }
    },
    directives :{
        'todo-focus' :function (el,binding) {
            if (binding.value){
                el.focus()
            }

        }
    }

    
})
function onHashChange() {
    var  visibility = window.location.hash.replace(/#\/?/,'')
    if (filters[visibility]){
        app.visibility = visibility
    }else {
        window.location.hash = ''
        app.visibility = 'all'
    }

}
window.addEventListener('hashchange',onHashChange)
onHashChange()
app.$moun('todoapp')