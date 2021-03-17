<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 3/4/2021
  Time: 9:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Date,java.text.*" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <title>Sprint our Date</title>
</head>
<body>
//Scriptlets
<%
    Date nowDate = new Date();
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yy:SSS");
%>
<h2>Current Date</h2>
<%=dateFormat.format(nowDate)%>
</body>
</html>
