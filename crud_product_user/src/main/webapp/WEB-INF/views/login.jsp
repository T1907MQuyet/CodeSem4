
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en" class="h-100">


<!-- Mirrored from omah.dexignzone.com/xhtml/page-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:18 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Omah - Property Bootstrap Admin Dashboard</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="${contextPath}/assets/images/favicon.png">
    <link href="${contextPath}/assets/css/style.css" rel="stylesheet">

</head>

<body class="h-100">
<div class="authincation h-100">
    <div class="container h-100">
        <div class="row justify-content-center h-100 align-items-center">
            <div class="col-md-6">
                <div class="authincation-content">
                    <div class="row no-gutters">
                        <div class="col-xl-12">
                            <div class="auth-form">
                                <div class="text-center mb-3">
                                    <c:if test="${pageContext.request.userPrincipal.name != null}">

                                        <h1>Login Success</h1>
                                        <a class="btn btn-primary" href="${contextPath}/product">Page Product</a>
                                    </c:if>
                                </div>
                                <c:if test="${pageContext.request.userPrincipal.name == null}">
                                    <h4 class="text-center mb-4">Sign in your account</h4>
                                    <form:form action="/login" method="post">
                                        <div class="form-group">
                                            <label class="mb-1"><strong>Email</strong></label>
                                            <input type="email" class="form-control" id="username" name="username" autofocus="autofocus">
                                        </div>
                                        <div class="form-group">
                                            <label class="mb-1"><strong>Password</strong></label>
                                            <input type="password" class="form-control" id="password" name="password"
                                                   autofocus="autofocus">
                                        </div>
                                        <div class="form-row d-flex justify-content-between mt-4 mb-2">
                                            <div class="form-group">
                                            </div>
                                        </div>
                                        <div class="text-center">
                                            <button type="submit" name="login-submit" id="Login-submit"
                                                    class="form-control btn btn-primary" value="Login">Login</button>
                                        </div>
                                    </form:form>
                                    <div class="new-account mt-3">
                                         <a class="text-primary" href="/registration">Register</a></p>
                                    </div>
                                </c:if>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!--**********************************
    Scripts
***********************************-->
<!-- Required vendors -->
<script src="${contextPath}/assets/vendor/global/global.min.js"></script>
<script src="${contextPath}/assets/vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
<script src="${contextPath}/js/custom.min.js"></script>
<script src="${contextPath}/js/deznav-init.js"></script>

</body>


<!-- Mirrored from omah.dexignzone.com/xhtml/page-login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:18 GMT -->
</html>
