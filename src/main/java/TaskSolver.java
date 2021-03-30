import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TaskSolver", value = "/TaskSolver")
public class TaskSolver extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Double a = Double.parseDouble(request.getParameter("a"));
            Double b = Double.parseDouble(request.getParameter("b"));
            Double c = Double.parseDouble(request.getParameter("c"));
            Double d = Double.parseDouble(request.getParameter("d"));
            String taskN = request.getParameter("taskNumber");

            Cookie[] cookies = request.getCookies();
            Integer count=0;
            for(Cookie co : cookies){
                if(co.getName().equals("num")){
                    if(Integer.parseInt(co.getValue())>count) {
                        count = Integer.parseInt(co.getValue());
                    }
                }
            }
            count++;
            Cookie cookieNum = new Cookie("num", count.toString());
            Cookie cookieA = new Cookie("a" + count, a.toString());
            Cookie cookieB = new Cookie("b" + count, b.toString());
            Cookie cookieC = new Cookie("c" + count, c.toString());
            Cookie cookieD = new Cookie("d" + count, d.toString());
            cookieNum.setMaxAge(172800);                                    // 2 days
            cookieA.setMaxAge(172800);
            cookieB.setMaxAge(172800);
            cookieC.setMaxAge(172800);
            cookieD.setMaxAge(172800);
            response.addCookie(cookieNum);
            response.addCookie(cookieA);
            response.addCookie(cookieB);
            response.addCookie(cookieC);
            response.addCookie(cookieD);
            try(PrintWriter out = response.getWriter()){
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println(" <head><title>Task " + taskN + "</title></head>");
                out.println(" <body>");
                double result = 0;
                switch (taskN){
                    case "7":
                        result=Math.pow(4*Math.cosh(Math.sqrt(a/b))+3*Math.acos(d),c);
                        break;
                    case "8":
                        result=5*a/Math.sin(a)+Math.sqrt(Math.tanh(Math.abs(b)*c)/Math.log(d));
                        break;
                    case "9":
                        result=(Math.sin(Math.abs(a))+Math.cos(Math.sqrt(b)))/(2*Math.tan(c)+Math.pow(Math.E,d));
                        break;
                }
                out.println("<h3>Task " + taskN + "</h3><br>");
                out.println("Result = " + result);
                out.println("</body>");
                out.println("</html>");
            }
        } catch (NumberFormatException e){
            response.sendError(400);
        }
    }
}