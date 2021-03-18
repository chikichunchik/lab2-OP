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
        } catch (NullPointerException e){
            response.sendError(400);
        }

        try(PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println(" <head><title>Servlet NewServlet</title></head>");
            out.println(" <body>");
            switch (request.getParameter("taskNumber")){
                case "7":
                    out.println("дарова1");
                    break;
                case "8":
                    out.println("дарова2");
                    break;
                case "9":
                    out.println("дарова3");
                    break;
            }
            out.println(" </body>");
            out.println("</html>");
        }


    }
}
