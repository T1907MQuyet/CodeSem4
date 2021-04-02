
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en" class="h-100">


<!-- Mirrored from omah.dexignzone.com/xhtml/page-register.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:53 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Omah - Property Bootstrap Admin Dashboard</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="images/favicon.png">
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
                                    <a href="index.html"><img src="images/logo-full.png" alt=""></a>
                                </div>
                                <h4 class="text-center mb-4">Sign up your account</h4>
                                <form:form action="registration" method="post" modelAttribute="user">
                                    <div class="form-group">
                                        <label class="control_label" for="firstName">User Name</label>
                                        <spring:bind path="username">
                                            <form:input id="firstName" class="form-control" path="username" autofocus="autofocus"/>
                                            <form:errors path="username" cssClass="colorRed"></form:errors>
                                        </spring:bind>
                                    </div>
                                    <div class="form-group">

                                        <label class="control_label" for="email">Email</label>
                                        <spring:bind path="email">
                                            <form:input id="email" class="form-control" path="email"   autofocus="autofocus"/>
                                            <form:errors path="email" cssClass="colorRed"></form:errors>
                                        </spring:bind>
                                    </div>
                                    <div class="form-group">
                                        <label class="control_label" for="password">Password</label>
                                        <spring:bind path="username">
                                            <form:input id="password" class="form-control" path="password" type="password"  autofocus="autofocus"/>
                                            <form:errors path="password" cssClass="colorRed"></form:errors>
                                        </spring:bind>
                                    </div>
                                    <div class="text-center mt-4">
                                        <button type="submit" class="btn btn-primary btn-block">Register</button>
                                    </div>
                                </form:form>
                                <div class="new-account mt-3">
                                    <p>Already have an account? <a class="text-primary" href="page-login.html">Sign in</a></p>
                                </div>
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
<script src="${contextPath}/assets/js/custom.min.js"></script>
<script src="${contextPath}/assets/js/deznav-init.js"></script>

</body>

<!-- Mirrored from omah.dexignzone.com/xhtml/page-register.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 11 Nov 2020 01:51:53 GMT -->
</html>
