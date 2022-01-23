package com.example.lesson1_21012022;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "acceuil",value = "/acceuil")
public class Acceuil  extends HelloServlet{


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       // super.doGet(request, response);


        try {
            this.getServletContext().getRequestDispatcher("/WEB-INF/acceuil.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void destroy() {
        super.destroy();
    }
}
