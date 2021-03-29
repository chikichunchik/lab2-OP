<%@ page import="java.io.PrintWriter" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Main page</title>
    </head>
    <body>
    <%
        Cookie [] cookies = request.getCookies();
    %>
        <img src="multimedia\task7.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="7">
            a = <input type="text" name="a" list="lista"/> <br>
            <datalist id = "lista">
               <% if(cookies!=null){
                   for(Cookie co: cookies){
                   if(co.getName().substring(0,1).equals("a")){
               %>
                <option><%=co.getValue()%></option>
                <% }
                }
                }
                %>
            </datalist>
            b = <input type="text" name="b" list="listb"/> <br>
            <datalist id = "listb">
                <% if(cookies!=null){
                    for(Cookie co: cookies){
                        if(co.getName().substring(0,1).equals("b")){
                %>
                <option><%=co.getValue()%></option>
                <% }
                }
                }
                %>
            </datalist>
            c = <input type="text" name="c" list="listc"/> <br>
            <datalist id = "listc">
                <% if(cookies!=null){
                    for(Cookie co: cookies){
                        if(co.getName().substring(0,1).equals("c")){
                %>
                <option><%=co.getValue()%></option>
                <% }
                }
                }
                %>
            </datalist>
            d = <input type="text" name="d" list="listd"/> <br>
            <datalist id = "listd">
                <% if(cookies!=null){
                    for(Cookie co: cookies){
                        if(co.getName().substring(0,1).equals("d")){
                %>
                <option><%=co.getValue()%></option>
                <% }
                }
                }
                %>
            </datalist>
            <input type="submit" value="Solve task 7"/>
        </form>

        <br> <br>

        <img src="multimedia\task8.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="8">
            a = <input type="text" name="a" list="lista"/> <br>
            b = <input type="text" name="b" list="listb"/> <br>
            c = <input type="text" name="c" list="listc"/> <br>
            d = <input type="text" name="d" list="listd"/> <br>
            <input type="submit" value="Solve task 8"/>
        </form>

        <br> <br>

        <img src="multimedia\task9.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="9">
            a = <input type="text" name="a" list="lista"/> <br>
            b = <input type="text" name="b" list="listb"/> <br>
            c = <input type="text" name="c" list="listc"/> <br>
            d = <input type="text" name="d" list="listd"/> <br>
            <input type="submit" value="Solve task 9" />
        </form>
    </body>
</html>