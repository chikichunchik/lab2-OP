<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Main page</title>
    </head>
    <body>
    <%
        Object a = session.getAttribute("a");
    %>
        <img src="multimedia\task7.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="7">
            a = <input type="text" name="a"/> <br>
            b = <input type="text" name="b"/> <br>
            c = <input type="text" name="c"/> <br>
            d = <input type="text" name="d"/> <br>
            <input type="submit" value="Solve task"/>
        </form>

        <br> <br>

        <img src="multimedia\task8.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="8">
            a = <input type="text" name="a"/> <br>
            b = <input type="text" name="b"/> <br>
            c = <input type="text" name="c"/> <br>
            d = <input type="text" name="d"/> <br>
            <input type="submit" value="Solve task"/>
        </form>

        <br> <br>

        <img src="multimedia\task9.png">
        <form action="TaskSolver" method="get">
            <input type="hidden" name="taskNumber" value="9">
            a = <input type="text" name="a"/> <br>
            b = <input type="text" name="b"/> <br>
            c = <input type="text" name="c"/> <br>
            d = <input type="text" name="d"/> <br>
            <input type="submit" value="Solve task"/>
        </form>
    </body>
</html>