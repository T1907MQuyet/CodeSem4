
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<jsp:include page="../layout/header.jsp"></jsp:include>
<div class="content-body">
    <div class="container-fluid">
        <div class="page-titles">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="javascript:void(0)">Table</a></li>
            </ol>
        </div>
        <!-- row -->

        <div class="row">
            <div class="col-lg-12">
                <div class="card">
                    <div class="card-header">
                        <a class="card-title" href="${contextPath}/employee/create" role="button">Create New Employee</a>
                    </div>
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-responsive-md">
                                <thead>
                                <tr>
                                    <th><strong>Stt</strong></th>
                                    <th><strong>Fullname</strong></th>
                                    <th><strong>Image</strong></th>
                                    <th><strong>Birthday</strong></th>
                                    <th><strong>Salary</strong></th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${list}" var="emp">
                                <tr>
                                    <td><strong>${emp.id}</strong></td>
                                    <td>${emp.fullname}</td>
                                    <td><img src="${contextPath}${pro.image}" width="50px"/></td>
                                    <td>${emp.birthday}</td>
                                    <td>${emp.salary}</td>
                                    <td>
                                        <div class="dropdown">
                                            <button type="button" class="btn btn-success light sharp" data-toggle="dropdown">
                                                <svg width="20px" height="20px" viewBox="0 0 24 24" version="1.1"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><rect x="0" y="0" width="24" height="24"/><circle fill="#000000" cx="5" cy="12" r="2"/><circle fill="#000000" cx="12" cy="12" r="2"/><circle fill="#000000" cx="19" cy="12" r="2"/></g></svg>
                                            </button>
                                            <div class="dropdown-menu">
                                                <a class="dropdown-item" href="${contextPath}/employee/edit?id=${pro.id}">Edit</a>
                                                <a class="dropdown-item" href="${contextPath}/employee/deleteEmp?id=${pro.id}">Delete</a>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<jsp:include page="../layout/footer.jsp"/>