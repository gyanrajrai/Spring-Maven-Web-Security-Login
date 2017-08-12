<%-- 
    Document   : login
    Created on : Jul 22, 2017, 4:58:16 PM
    Author     : Admin_GYAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRM-LOGIN</title>
    </head>
    <body>
        <h1>CUSTOMER LOGIN</h1>
        <form method="post">
            <div>
                <label>Username:</label>
                <input type="text" name="username"/>
            </div>
             <div>
                <label>password:</label>
                <input type="password" name="password"/>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <button type="submit">Login</button>
        </form>
    </body>
</html>
