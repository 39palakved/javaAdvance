<%
    
    String s1 = request.getParameter("t1");
    String s2 = request.getParameter("t2");
    int a = Integer.parseInt(s1);
    int t = Integer.parseInt(s2);
    int interest = 0;
    if(t>=5){
    interest = a*10/100;
    }
    else{
    interest=a*8/100;
    }
    int total = a + interest;
    %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
    </head>
    <body>
        <h1>interest Calculation</h1>
        <table border="2">
            <tr>
                <td>Amount</td>
                <td><%=a%></td><!-- can also write like this -->
                
            </tr>
            <tr>
                <td>Time</td>
                <td><% out.println(t);%></td>
            </tr>
            <tr>
                <td>Interest</td>
                <td><% out.println(interest);%></td>
            </tr>
            <tr>
                <td>Total</td>
                <td><% out.println(total);%></td>
            </tr>
        </table>
    </body>
</html>
