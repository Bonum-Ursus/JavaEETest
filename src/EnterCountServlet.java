import eve.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "EnterCountServlet")
public class EnterCountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String user = (String) session.getAttribute("current_user");
        if(user == null){
            //Логика для не авторизованного пользователя
            //session.setAttribute("current_user", ID);
        }else {
            //Логика для авторизованного пользователя
        }
//        Cart cart = (Cart) session.getAttribute("cart");
//        String name = request.getParameter("name");
//        Integer qty = Integer.parseInt(request.getParameter("qty"));
//        if(cart == null){
//            cart = new Cart();
//            cart.setName(name);
//            cart.setQty(qty);
//        }
//        session.setAttribute("cart", cart);

//        Integer count = (Integer) session.getAttribute("count");
//        if(count == null) {
//            session.setAttribute("count", 1);
//            count = 1;
//        }
//        else {
//            session.setAttribute("count", count+1);
//        }

//        PrintWriter pw = response.getWriter();
//        pw.println("<html>");
////        pw.println("<h1>Your count is: " + count + "</h1>");
//        pw.println("</html>");
        getServletContext().getRequestDispatcher("/showCart.jsp").forward(request, response);
    }
}
