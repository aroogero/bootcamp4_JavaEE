package bitlab.bootcamp.chapter5.servlets.workwithClient;

import bitlab.bootcamp.chapter5.db.model.Account;
import bitlab.bootcamp.chapter5.db.mySql.DBManager_Sprint2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(value="/sign_in")
public class Sign_in_sprint2Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/sign_in_sprint2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        String redirect = "/sign_in?usererror";

        String email = request.getParameter("user_email");
        Account account = DBManager_Sprint2.getUser(email);
        if (account!=null) {
            redirect = "/sign_in?passworderror";
            String password = request.getParameter("user_password");
            if(account.getPassword().equals(password)) {
                HttpSession session = request.getSession();
                session.setAttribute("currentAuthor", account);
                redirect = "userProfile_Sprint2.jsp";
            }
        }
        response.sendRedirect(redirect);
    }
}
