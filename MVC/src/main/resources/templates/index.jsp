<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type", content="text/html" charset="UTF-8">
<title>用户CRUD</title>
<body>
<form action=<%= request.getContextPath()%> "/query.udo" method="post">
    <table style="margin-left: 100px; padding: 50px; border: 1px;#ccc:solid;width: 400px">
        <tr>
            <td style="text-align: right">用户名asdkjsdjks:</td>
            <td style="text-align: left"><input type="text" name="userName"/></td>
        </tr>
        <tr>
            <td style="text-align: right">用户密码:</td>
            <td style="text-align: left"><input type="text" name="aassWd"/></td>
        </tr>
        <tr>
            <td style="text-align: right">用户地址:</td>
            <td style="text-align: left"><input type="text" name="address"/></td>
        </tr>
        <tr>
            <td  style="text-align: right">用户电话:</td>
            <td style="text-align: left"><input type="text" name="phoneNo"/></td>
        </tr>
        <tr>
            <td style="text-align: center"><input type="submit" value="查询用户"/></td>
        </tr>
    </table>
</form>
</body>
</html>
