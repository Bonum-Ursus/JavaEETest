import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyFirstServlet")
public class MyFirstServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String nick  = request.getParameter("nick");

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1><p>Hi, " + name +"!</p> Your nickname will be: "+ nick +"</h1>");
        pw.println("</html>");
    }
}
