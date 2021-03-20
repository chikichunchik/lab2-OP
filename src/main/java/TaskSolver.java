import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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

        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println(" <head><title>Servlet NewServlet</title></head>");
            out.println(" <body>");
            switch (request.getParameter("taskNumber")){
                case "7":
                    double result=Math.pow(4*Math.cosh(Math.sqrt(a/b))+3*Math.acos(c),d);
                    out.println(result);
                    break;
                case "8":
                    double result1=5*a/Math.sin(a)+Math.sqrt(Math.tanh(Math.abs(b)*c)/Math.log(d));
                    out.println(result1);
                    break;
                case "9":
                    double result2=(Math.sin(Math.abs(a))+Math.cos(Math.sqrt(b)))/(2*Math.tan(c)+Math.pow(Math.E,d));
                    out.println(result2);
                    break;
            }
            out.println(" </body>");
            out.println("</html>");
        }
    } catch (NumberFormatException e){
        response.sendError(400);
    }


    }
}
