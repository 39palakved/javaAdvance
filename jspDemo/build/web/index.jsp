<%-- 
    Document   : index
    Created on : Jan 25, 2023, 1:58:05 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Interest Calculation</h1>
        <form action="interest.jsp">
            <pre>
                Amount <input type ="text" name ="t1"/>
                Time <input type="text" name="t2"/>
                <input type="submit" value="Find-Interest"/>
            </pre>
        </form>
    </body>
</html>
