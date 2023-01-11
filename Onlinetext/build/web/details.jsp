
<html>
    
    <body>
        <h1>Detail Submission Form</h1>
        <form action="TextProcessor" method="GET"> <%--here Textprocessor is servlet --%>
            <pre>
                Income <input type ="text" name="t1"/>
                Age    <input type="text" name="t2"/>
                Occupation,  Service<input type="radio" name="r1" value="Service" checked="checked"/>Business<input type="radio" name="r1" value="Business"/>
                NRI  <input type="checkbox" name="c1">
                Assets   <select name ="t3"   size="3" multiple="multiple">
                         <option>Gold</option>
                         <option>Car</option>
                         <option>Plot</option>
                         <option>Flat</option>
                         <option>Share</option>
                         </select>

                  <input type="submit"  value="Find-Tax"/>
             
            </pre>
        </form>    
    </body>
</html>
