<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <script rel="stylesheet" href="bootstrap/js/bootstrap.js"></script>
    <script rel="stylesheet" href="bootstrap/js/jquery-1.12.4.js"></script>
</head>
<style>
    body {
        overflow: hidden;
    }
</style>
<body>
<div style="height: 100px;background-color: red">
    <h1>OA办公</h1>
</div>
<div class="row" style="height: 100%">
    <div class="col-md-2" style="background-color: #5bc0de">
        <ul style="line-height: 60px;font-size: 20px;list-style-type: none;">
            <li>
                <a href="role/list" target="main">
                    <span>查询角色列表</span>
                </a>
            </li>
            <li>
                <a href="role/tolist" target="main">
                    <span>查询用户列表</span>
                </a>
            </li>
        </ul>
    </div>
    <div class="col-md-10" style="height: 100%;">
        <iframe name="main" height="500px" width="100%" frameborder="0" style="margin-top: 1%;">

        </iframe>
    </div>
</div>
<br/>

</body>
</html>
