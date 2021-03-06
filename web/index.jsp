<%-- 
    Document   : index
    Created on : 26/05/2020, 12:33:18 AM
    Author     : PorfirioDamián
--%>

<%@page import="user.User"%>
<%@page import="user.UserActions"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="css/master.css">
    <script></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
    <body>
        <section class="fondo" id="fondo">
            <header class="cabecera" id="cabecera">
                <h1>TACO MASTER®</h1>
            </header>
                <nav class="navegacion" id="navegacion">
                    <ul>
                        <li><a href="">Logo</a></li>
                        <li><a href="registro.jsp">Registrarse</a></li>
                    </ul>
                </nav>
        </section> 
        <section class="log" id="log">
            <label for="" class="tacos">
                <p>La historia del taco</p>
            </label>
            <label for="" class="log_in">
                <img class="logo" src="IMG/logo_e.jpg">
                <h1>Iniciar Sesion</h1>
                <form action="index.jsp">
                    <!---Usuario--->
                    <label class="titulos" for="email">Correo</label>
                    <input type="text" name="correo" placeholder="Ingresa el Correo">
                    <!---Contraseña--->
                    <label class="titulos" for="contra">Contraseña</label>
                    <input type="password" name="password" placeholder="Ingresa la contraseña">
        
                    <input type="submit" value="Iniciar">
                    <a class="link-a" href="#">¿Olvidaste tu contraseña?</a><br>
                    <a class="link-a" href="#">¿No te has registrado aun?</a>
                    
                    <%
                            String email,password;
                            password = request.getParameter("password");
                            email = request.getParameter("correo");
                            System.out.println(email + password);

                            User e = new User();
                            e.setEmail_mu(email);
                            e.setPass_mu(password);

                            int status = UserActions.Loguear(e);

                            if (status > 0) {
                                int id = UserActions.getIdByEmail(email); 
                                session.setAttribute("id",id);
                                session.setAttribute("email", email);
                                System.out.println("datos sesion login"+session.getAttribute("email")+" "+session.getAttribute("id"));
                                response.sendRedirect("main.jsp");
                            }else{
                            }
                    %>
                    
                </form>
                
            </label>
        </section>
        <footer class="pie_de_pagina" id="pie_de_pagina">
            <h4>Contactanos en</h4>
            <h5>facebook</h5> 
            <h5>twiter</h5>
            <h5>instagram</h5>
        </footer>
    </body>
</html>
