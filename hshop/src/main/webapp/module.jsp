<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'add.jsp' starting page</title>
    <script type="text/javascript" href="../js/jquery-1.12.4.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="ueditor/ueditor.all.min.js"> </script>
    <link href="ueditor/themes/default/css/ueditor.css" rel="stylesheet"><!--非必须 导入js或者css的顺序一定不要互换，-->
    <script type="text/javascript" charset="utf-8" src="ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<body>
1111<img src="img/product/831472741319052.jpg">
<input type="text" value="12" onchange="this.value"/>
<script type="text/javascript">
    var obj = (1);
    var ob = /2/;
    alert(obj);
    alert(ob);
</script>

</body>
</html>
