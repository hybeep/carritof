package user;




import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserRegister extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
        String nombre, paterno, materno, cumpleanos, telefono, celular, correo, contrasena;
            nombre = request.getParameter("nombre");
            paterno = request.getParameter("paterno");
            materno = request.getParameter("materno");
            contrasena = request.getParameter("contrasena");
            correo = request.getParameter("correo");
            cumpleanos = request.getParameter("cumpleanos");
            telefono = request.getParameter("telefono");
            celular = request.getParameter("celular");
            
            User e = new User();
            e.setNom_mu(nombre);
            e.setPass_mu(contrasena);
            e.setEmail_mu(correo);
            e.setAppat_mu(paterno);
            e.setApmat_mu(materno);
            e.setBirth_mu(cumpleanos);
            e.setTel_mu(telefono);
            e.setCel_mu(celular);
            int estado = UserActions.Registrar(e);
            
            if(estado >0){
                out.println("<h1>Wiiiii se guardo *w*</h1>");
                request.getRequestDispatcher("index.jsp");
            }else{
                out.println("<h1>Solo juguito contigo :P"
                        + "Caldito seas wiiiiii</h1>");
                System.out.println("no puede ser");
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet GuardarEmpleado</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet GuardarEmpleado at </h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}