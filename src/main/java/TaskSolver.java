import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.SessionCookieConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpCookie;

@WebServlet(name = "TaskSolver", value = "/TaskSolver")
public class TaskSolver extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Double a = Double.parseDouble(request.getParameter("a"));
            Double b = Double.parseDouble(request.getParameter("b"));
            Double c = Double.parseDouble(request.getParameter("c"));
            Double d = Double.parseDouble(request.getParameter("d"));
            Cookie cookie = new Cookie("a",a.toString());
            Cookie cookie1 = new Cookie("b",b.toString());
            Cookie cookie2 = new Cookie("c",c.toString());
            Cookie cookie3 = new Cookie("d",d.toString());
            cookie.setMaxAge(7000);
            cookie1.setMaxAge(7000);
            cookie2.setMaxAge(7000);
            cookie3.setMaxAge(7000);
            Cookie[] cookies = request.getCookies();
            for(Cookie co : cookies){
                System.out.println(co.getValue());
            }
        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println(" <head><title>Result</title></head>");
            out.println(" <body>");
            out.println("<h1> result = ");
            switch (request.getParameter("taskNumber")){
                case "7":
                    double result=Math.pow(4*Math.cosh(Math.sqrt(Math.abs(a/b)))+3*Math.acos(d),c);
                    out.println(result);
                    break;
                case "8":
                    double result1=(5*a/Math.sin(a)) + Math.sqrt(Math.tanh(Math.abs(b)*c)/Math.log(d));
                    out.println(result1);
                    break;
                case "9":
                    double result2=(Math.sin(Math.abs(a))+Math.cos(Math.sqrt(b)))/(2*Math.tan(c)+Math.pow(Math.E,d));
                    out.println(result2);
                    break;
            }
            out.println("</h1> </body>");
            out.println("</html>");
        }
    } catch (NumberFormatException e){
        response.sendError(400);
    }


    }
}
