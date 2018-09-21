<%@ page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--<%@ page import="com.qianyan.grade.domain.Student" %>--%>

<%
    String path = request.getContextPath();
    String basePath =
            request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
                    + path + "/";
%>

<%

    /*List<Student> allstudent = (List<Student>)request.getAttribute("allstudent");*/
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>登陆</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <link rel="stylesheet" type="text/css" href="css/autocomplete.css">
    <script src="js/jquery-1.7.2.min.js"></script>
    <script src="js/bootstrap-typeahead.js"></script>
</head>

<body>
<div class="logo">
    <a href="student.action" title="南阳理工学院">
        <img border="0" src="images/logosmall.png">
    </a>
</div>

<div class="main">
    <div class="loginpanel">
        <div class="logincontent">
            <form action="loginCheck.action" method="post">
                <div class="inputline">
                    <p>账号：</p>
                    <input name="username" type="text" id="inputAuto" style="placeholder:'用户名'">
                </div>
                <div class="displayinfo">
						<span>
						<c:if test="${error != null && error == 'username' }">
                            用户名不存在！
                        </c:if>
						<c:if test="${error != null && error == 'status' }">
                            用户已被锁定！
                        </c:if>
						</span>
                </div>
                <div class="inputline">
                    <p>密码：</p>
                    <input name="password" type="password" style="placeholder:'密　码'">
                </div>
                <div class="displayinfo">
						<span>
						<c:if test="${error != null && error == 'password' }">
                            用户密码不正确！
                        </c:if>
						 </span>
                </div>
                <div class="inputline">
                    <p>角色：</p>
                    <select name="role">
                        <option value="student">学　生</option>
                        <option value="admin">管理员</option>
                    </select>
                </div>
                <br>
                <div class="inputline">
                    <button class="loginbutton" style="font-weight: bold">
                        登&nbsp;&nbsp;&nbsp;&nbsp;陆
                    </button>
                    <a href="forgetPassword.jsp" class="findpwd">忘记密码？</a>
                </div>

                <div class="divider-content">
                    <span></span>
                </div>

                <div class="announce">
                    <div id="announce1">
                        <span style="color:red;">公告：</span>
                        <span style="font-size:13px;">
								V4.0  更新：大幅提高系统稳定性，用户界面略有调整，安全性进一步提高。如对本系统有建议请点击&nbsp;<a href="#"
                                                                                         style="font-size:14px;">这里</a>
							</span>
                    </div>
                    <div id="announce2" style="display:none">
                        <span style="color:blue; font-size:14px;">我们推荐您使用下列浏览器访问：</span>
                        <img style="padding-top:10px; padding-left:15px;"
                             src="images/goodbrowser.PNG">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<div class="foot">
</div>
<script type="text/javascript">

</script>

</body>

</html>