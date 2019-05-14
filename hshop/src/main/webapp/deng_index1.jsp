<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page isELIgnored="false" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" type="text/css" href="css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/themes/icon.css">
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="js/jquery.easyui.min.js"></script>
    <link rel="shortcut icon" href="#" />
    <style type="text/css">
        *{
            margin: 0 auto;
            padding: 0;
            /*border: 1px solid #444;*/
        }
        html,body{
            height: 100%;
            width: 100%;
        }
        body{
            background: url('img/010.png') repeat;/*这是启动页面的路径*/
            background-size: 100% 100%;
        }
        td{
            padding:10px 0px 10px 0px ;
        }
    </style>
</head>
<body>
<div style="height:12%"></div>
<div style="text-align: center;transform:scale(1.5);"><img src="img/brand/big_logo.png"></div>
<div style="height:12%"></div>
<div style="height:45%;">
    <form id="ffindex" method="post" action="loginAction" style="margin:0 auto;width:35%;height:90%;padding:30px;background-color: white;border-radius:10px;">
        <div id="token" hidden></div>
        <jsp:include page="token.jsp"></jsp:include>
        <table id="indextable" style="font:normal 24px/32px 微软雅黑;">
            <tr class="">
                <td>用户名:</td>
                <td><input type="text" id="username" style="font:normal 20px/50px 微软雅黑;width:500px;border:1px solid #CCCCCC;border-radius:6px;" name="username" placeholder="请输入用户名"  required="required"></td>
            </tr>
            <tr class="">
                <td>密码:</td>
                <td><input type="password" id="password" style="font:normal 20px/50px 微软雅黑;width:500px;border:1px solid #CCCCCC;border-radius:6px;" name="password" placeholder="请输入密码" required="required"></td>
            </tr>
            <tr class="">
                <td>验证码:</td>
                <td style="">
                    <input type="text" class="veryCode" style="font:normal 20px/50px 微软雅黑;width:360px;border:1px solid #CCCCCC;border-radius:6px;vertical-align:middle"  name="veryCode" placeholder="验证码" required="required">
                    &nbsp;<img id="veryCode" src="ImageAction" style="vertical-align:middle"/>
                </td>
            </tr>
            <tr>
                <td></td>
                <td style="height:36px"><span id="error" style="color: red"></span></td>
            </tr>
            <tr class="" style="text-align:center;">
                <td colspan="2" style="padding:0;">
                    <button type="submit" style="background-color:#DBDBDB;border: 1px solid #929292;border-radius:4px;font:normal 22px/36px 微软雅黑;width:120px;text-align:center;box-shadow:inset -10px -10px 3px #EAE5E1;" onclick="submitForm()">登陆</button>
                    <!--&nbsp;&nbsp;&nbsp;<a href="javascript:void(0)" class="btn btn-primary" onclick="clearForm()">重置</a>-->
                </td>
            </tr>
        </table>
    </form>
</div>
<script type="text/javascript">
    function submitForm(){
        $('#ffindex').submit(function () {
            var content = $("#error").html();
            if(content!=''){
                alert("验证码错误");
                return false;
            }
        });
    }
    //  重置订单
    function clearForm(){
        $('#ffindex').form('clear');
    }
    $(document).ready(function(){
//      点击更新验证码
        $("#veryCode").click(function(){
            var vs = "ImageAction?times="+new Date();
            $(this).attr("src",vs);
            $("#error").html("");/*清空错误提示*/
        })
        $(".veryCode").focus(function () {
            $("#error").html("");
        });
//      失去光标验证验证码，如果有错误提示信息，不能提交表单
        $(".veryCode").blur(function(){
            var val = $('.veryCode').val();
            $.post("CheckCodeAction",{"value":val},function(data){
                if(data=="true"){
                    $("#error").html("");
                }
                else{
                    $(".veryCode").val("");
                    $("#error").html("验证码错误");
                }
            },"text");
        })
    });
</script>
</body>
</html>