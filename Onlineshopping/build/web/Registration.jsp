<%-- 
    Document   : user_info
    Created on : Jan 9, 2023, 8:17:16 PM
    Author     : Dell
--%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration form</title>
    </head>
    <body>
        <h1>Registration Form</h1>
        <form action="SaveUser">
            <label> User_Id: </label><br>
             <input type="text" name="userid"/><br>
            <label> Username: </label><br>
             <input type="text" name="username"/><br>
             <label> Password: </label><br>
            <input type="password"  name="password"/><br>
            <label> Email_Id: </label><br>
             <input type="text"  name="email"/><br>
             <label> Phone_No: </label><br>
            <input type="text"   name="phone"/><br>
            <label> Address </label><br>
            <input type="text" name="address"/><br>
            <input type="submit" name="submit" value="submit"> <br>
        </form>
    </body>
</html>
