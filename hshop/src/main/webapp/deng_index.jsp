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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>登陆</title>
    <meta charset="UTF-8">
    <meta name="keywords" content="帐号,账号,密码,竞拍,拍卖,估价,收藏,信用,二手,捐赠,password,哲学,f8xn"><!--网站关键字-->
    <meta name="description" content="提供在线帐号密码服务"><!--网站内容描述-->
    <meta name="Robots" Content="all"><!--默认all，文件将被检索，且页面上的链接可以被查询；其它none|index|noindex|follow|nofollow-->
    <meta name="expires" content="Mon,14 Oct 2020 00:20:00 GMT"><!--设定网页的到期时间，一旦过期则必须到服务器上重新调用。必须使用GMT时间格式-->
    <meta name="author" content="jiance520"><!--网站作者-->
    <meta name="generator" content="javascript,html,jsp"><!--网站使用的工具-->
    <meta name="coryright" content="未经许可，不得转载">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"><!--设置移动端自适应-->
    <meta http-equiv="content-type" content="text/html;charset=utf-8"><!--网站显示语言编码-->
    <meta http-equiv="refresh" content="3600;url=http://www.f8xn.top"><!--定时网站3600秒后，跳转到http://www.f8xn.top，达到更新-->
    <link rel="stylesheet" href="css/bootstrap.css"/>
    <script type="text/javascript" src="js/jquery-1.12.4.js"></script>
    <script type="text/javascript" src="js/bootstrap.js"></script>
    <!--vue引用的css、js文件-->
    <script type="text/javascript" src="js/vue.js"></script>
    <!--去除html页面中GET http://localhost:8080/favicon.ico 404 (Not Found)-->
    <link rel="shortcut icon" href="#"/>
    <style type="text/css">
        @media screen and (max-width: 600px) {
            .form-horizontal{
                padding:8% 1% 0 0;
            }
            .control-label{
                font:normal 20px "微软雅黑 Light";
            }
            .form-control{
                font:normal 20px "微软雅黑 Light";
                height: 28px;
            }
            .log-button{
                font:normal 20px "微软雅黑 Light";
                margin-left: 20%;
            }
            .reg-button{
                font:normal 20px "微软雅黑 Light";
                margin-left: 10%;
            }
            .div-a{
                font:normal 20px "微软雅黑 Light";
            }
            .footer{
                margin-top:55px;
            }
            #veryCode{
                transform:scale(0.6);
                position: relative;
                top:-6px;
            }
            #vc_div{
                height: 31px;
            }
        }
        @media screen and (min-width: 600px) {
            .form-horizontal{
                padding:3% 1% 0 0;
            }
            .control-label{
                font:normal 30px "微软雅黑 Light";
            }
            .form-control{
                font:normal 30px "微软雅黑 Light";
                height: 40px;
            }
            .log-button{
                font:normal 30px "微软雅黑 Light";
                margin-left: 20%;
            }
            .reg-button{
                font:normal 30px "微软雅黑 Light";
                margin-left: 10%;
            }
            .div-a{
                font:normal 30px "微软雅黑 Light";
            }
            .footer{
                position: absolute;bottom:0;left:0;right:0;
            }
        }
        * {
            margin: 0 auto;
            padding: 0;
            /*font:normal 30px "微软雅黑 Light";*//*不要在这里设置样式，权值太低，无效*/
        }
        html,body {
            width: 100%;
            height: 100%;
            /*background-color:#202121;*/
            /*background-color:#2C143F;*/
            background-color: rgba(91, 255, 0, 0);
        }
        .footer *{
            font:normal 20px 微软雅黑;
        }
    </style>
</head>
<body>
<header style="height:20%;"></header>
<section class="container" style="display:flex;text-align:center;">
    <!--margin-right:0;margin-left:0;padding-right:0;padding-left:0;-->
    <!--col-lg-offset-1 col-md-offset-1 col-sm-offset-1 col-xs-offset-1-->
    <!--col-lg-pull-1 col-md-pull-1 col-sm-pull-1 col-xs-pull-1-->
    <!--col-lg-push-1 col-md-push-1 col-sm-push-1 col-xs-push-1-->
    <form id="ffindex" method="post" action="loginAction" class="form-horizontal" style="background-color: rgba(45,255,146,0.04);border: 1px solid #000000;border-radius:5px"><!--class="form-horizontal"-->
        <div id="token" hidden></div>
        <jsp:include page="token.jsp"></jsp:include>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align: right">
            <label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label" style="padding:0;" for="admin">用户名:</label>
            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9" style="margin-right:0;margin-left:0;">
                <input type="text" style="" class="form-control" name="username" placeholder="admin" id="admin" required autofocus autocomplete="on"/>
            </div>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align: right">
            <label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label" style="padding:0;" for="password">密码:</label>
            <div class="col-lg-9 col-md-9 col-sm-9 col-xs-9" style="margin-right:0;margin-left:0;">
                <input type="password" style="" class="form-control" name="password" placeholder="123" id="password" required/>
            </div>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align:center">
            <span class="div-a text-center" id="fail" style="color: red">${fail}</span>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align: right">
            <label class="col-lg-3 col-md-3 col-sm-3 col-xs-3 control-label" style="padding:0;" for="v-code">验证码:</label>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5" style="margin-right:0;margin-left:0;padding-right:0;">
                <input type="text" style="padding-right:0;" class="form-control veryCode" id="v-code" required autofocus/>
            </div>
            <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4" id="vc_div" style="margin-right:0;margin-left:0;padding-left:0;text-align: center;">
                <img id="veryCode" src="ImageAction" style="padding-right:0;" alt=""/>
            </div>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align:center">
            <span class="div-a text-center" id="error" style="color: red"></span>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align: right">
            <button type="button" class="log-button col-lg-3 col-md-3 col-sm-3 col-xs-3 btn btn-primary" onclick="submitForm()">登陆</button>
            <button type="button" class="reg-button col-lg-3 col-md-3 col-sm-3 col-xs-3 btn btn-primary">注册</button>
        </div>
        <div class="form-group" style="margin-right:0;margin-left:0;text-align:center">
            <a class="div-a text-center" href="javascript:void(0)">忘记密码</a>
        </div>
    </form>
</section>
<footer class="footer" style="">
    <div class="container">
        <div class="row">
            <a class="col-md-offset-2 col-lg-4 col-md-4 col-sm-6 col-xs-12" style="display:inline-block;text-align: center" target="_blank" href="http://www.beian.gov.cn/portal/registerSystemInfo?recordcode=43050302000163">
                <img style="vertical-align: middle;display: inline-block" src="img/beian.png" alt=""/>
                <span style="vertical-align: middle;display: inline-block;color:#939393;">湘公网安备 43050302000163号</span>
            </a>
            <a  class="col-lg-4 col-md-4 col-sm-6 col-xs-12" style="display: inline-block;text-align:center" target="_blank" href="http://www.miitbeian.gov.cn/">
                <span style="vertical-align: middle;display: inline-block;color:#939393;">湘ICP备18023926号-1</span>
            </a>
        </div>
    </div>
</footer>
<script type="text/javascript">
    function submitForm(){
        $('#ffindex').submit();
        // $('#ffindex').submit(function () {
        //     alert(1);
        //     var content = $("#error").html();
        //     if(content!=''){
        //         alert("验证码错误");
        //         return false;
        //     }
        // });
    }
    //  重置
    function clearForm(){
        $('#ffindex').form('clear');
    }
    window.onload=function(){
//      点击更新验证码
        let veryCodeImg = $("#veryCode");
        let veryCodeInput = $(".veryCode");
        veryCodeImg.click(function(){
            var vs = "ImageAction?times="+new Date();
            $(this).attr("src",vs);
            $("#error").html("");/*清空错误提示*/
        });
        veryCodeInput.focus(function () {
            $("#error").html("");
        });

//      失去光标验证验证码，如果有错误提示信息，不能提交表单
        veryCodeInput.blur(function(){
            var val = veryCodeInput.val();
            $.post("CheckCodeAction",{"value":val},function(data){
                if(data==="true"){
                    $("#error").html("");
                }
                else{
                    veryCodeInput.val("");
                    $("#error").html("验证码错误");
                }
            },"text");
        });
        //帐号或密码错误时
        var fail = '${fail}';
        var failNode = $("#fail");
        if(fail!=null&&fail!=false){
            failNode.html(fail);
        }
        $("#password").focus(function () {
            failNode.html("");
        });
    };
</script>
</body>
</html>