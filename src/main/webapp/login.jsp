<%--
  Created by IntelliJ IDEA.
  User: jersey
  Date: 4/24/20
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <!-- getContextPath()或得到的是项目的名字，在这里是获得tingyu3+/ -->
    <base href="<%=request.getContextPath()+"/"%>">

    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/demo.css">
    <script type="text/javascript" src="easyui/jquery.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>

    <script type="text/javascript">
        function adminLogin() {
            // 获得表单的内容
            var val = $("form").serialize();

            // 法师部分ajax请求
            $.post("AdminController/adminLogin", val, function (result) {
                if (result){
                    window.location.href="main.jsp"
                }else {
                    $.messager.alert("提示","登录失败","error");
                }
            })
        }

    </script>

    <style type="text/css">
        #divElement{
            position:absolute;
            top: 40%;
            left: 40%;
            margin-top: 0;
            margin-left: 0;
            width: 450px;
            height: 200px;
            background-color: #00bbee;
        }
    </style>

</head>
<body style="background-color: black">
<div id="divElement">
    <div id="p" class="easyui-panel" title="登录" style="width: auto;height: auto;padding: 10px; background-color: #00bbee" data-options="iconCls:'icon-save',collapsible:true">
        <div style="margin-left: 57px;margin-top: 60px">
            <form>
                <div style="margin-bottom:25px">
                    <input name="aname" class="easyui-textbox" required="true" label="用户名:" style="width:75%">
                </div>
                <div style="margin-bottom:35px">
                    <input name="apwd" class="easyui-passwordbox" required="true" label="密&nbsp;&nbsp;&nbsp;码:" style="width:75%">
                </div>

                <div style="text-align: center">
                    <a href="javascript:void(0)" class="easyui-linkbutton c6" iconCls="icon-ok" onclick="adminLogin()" style="width:90px;margin-right: 50px">Login</a>
                    <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-cancel"  style="width:90px">Cancel</a>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
