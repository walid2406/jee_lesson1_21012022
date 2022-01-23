package com.example.lesson1_21012022;

import mesbeans.Auteur;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "test",value = "/Test")
public class Test extends HelloServlet {

    private String message1;
    public Test() {
        super();
    }
    public void init() {
         message1 = "yeah World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
       //super.doGet(request, response);

        //manipulation bd mysql


        //contruction de bean
        Auteur auteur=new Auteur("unNom","unPrenom",true);
        //send to vue
        request.setAttribute("auteur",auteur);




        String name=request.getParameter("name");
        request.setAttribute("name",name);

        PrintWriter out=response.getWriter();

        String message="see you later";
        request.setAttribute("variable",message);

        try {
            this.getServletContext().getRequestDispatcher("/WEB-INF/bonjour.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }




        /*response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        //recuperation objet de la sortie
        PrintWriter out=response.getWriter();
        out.println("<h2> Bonjour servelet 2 test </h2>");*/










    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
