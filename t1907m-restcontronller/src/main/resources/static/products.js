var products = [];
function findProducts(prodctId) {
    return products[findProduccts()]

}
function findProductKey(productId) {
    for (var key = 0;key <products.length;key ++){
        if (products[key].id == productId){
            return key;
        }
    }


}
var productService = {
    findAll(fn){
        axios
            .get('/api.v1/products')
            .then(response =>fn(response))
            .catch(error =>console.log(error))
    },
    finfById(id,fn){
        axios
            .get('/api.v1/products' +id)
            .then(response =>fn(response))
            .catch(error =>console.log(error))
    },
    create(product, fn){
        axios
            .post('/api.v1/products',product)
            .then(response =>fn(response))
            .catch(error =>console.log(error))
    },
    update(id,product,fn){
        axios
            .put('/api.v1/products' +id, product)
            .then(response =>fn(response))
            .catch(error =>console.log(error))
    },
    deleteProduct(id,fn){
        axios
            .delete('/api.v1/products'+ id)
            .then(response =>fn(response))
            .catch(error =>console.log(error))
    }
};
var List =  vue.extend({
    template :'#product-list',
    data:function () {
        return {products:[],searchKey:''}

    },
    computed :{
        filteredProducts(){
            return this.products.filter(product )  => {
                return product.name.indexOf(this.searchKey) >-1
                || product.description.indexOf(this.searchKey) >-1
                    || product.price.toString().indexOf(this.searchKey) >-1

            }
        }
    },
    mounted(){
        productService.findAll(r => {this.products = r.data; products = r.data()})
    }
});
var  Product = vue.extend({
    template: '#product',
    data: function () {
        return {product :findProducts(thid.$route.params.product_id)}

    }
});
var  ProductEdit = vue.extend({
    template :'#product-edit',
    data:function () {
        return {product :findProducts(thid.$route.params.product_id)}

    },
    methods:{
        updateProduct: function () {
            productService.update(this.product.id,this.product, r => router.push('/'))

        }
    }
});
var  ProductDelete = vue.extend({
    template:'#product-delete',
    data:function () {
        return {product :findProducts(thid.$route.params.product_id)}

    },
    methods:{
        deteleProduct: function () {
            productService.deleteProduct(this.product.id, r => router.push('/'))

        }
    }

});
var AddProduct  = vue.extend({
    template :'#add-product',
    data(){
        return{
            product:{name:'',description:'',prive:0}
        }
    },
    method:{
        createProduct(){
            productService.create(this.product, r =>router.push('/'))
        }
    }

});
var router = new  VueRouter({
    routes:[
        {path:'/',component:List},
        {path: '/product/:product_id',component: Product,name:'product'},
        {path:'/add_product',component:AddProduct},
        {path:'/product/:product_id/edit',component:ProductEdit,name:'product-edit'},
        {path :'/product/:product_id/delete',component:ProductDelete ,name: 'product-delete'}
    ]
});
new  Vue({
    router
}).mounted('#app')