import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Registration extends HttpServlet {
    List<User> users= new ArrayList<>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h1>Registration Page");
        if(users.isEmpty()){
            out.println("<h3>No users registered yet...");
        }
        else{
            out.println("<ul>");
            for(User user:users){
                out.println("<li>"+user.getName()+" - "+user.getEmail()+"</li>");
            }
            out.println("</ul>");
        }
        out.println("<a href='index.html'>Back To Registration</a>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");

        users.add(new User(name,email));
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Registration Successful");
        out.println("<h3>Name= "+name+"</h3>");
        out.println("<h3>Email= "+email+"</h3>");
        out.println("<a href='register'>View all users</a><br><br>");
        out.println("<a href='index.html'>Back to registration</a>");
    }
}

class User{
    String name;
    String email;
    User(String name,String email){
        this.name=name;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}