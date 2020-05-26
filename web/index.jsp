<%-- 
    Document   : index
    Created on : 26/05/2020, 12:33:18 AM
    Author     : PorfirioDamián
--%>

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
                        <li><a href="">Registrarse</a></li>
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
                <form>
                    <!---Usuario--->
                    <label class="titulos" for="username">Usuario</label>
                    <input type="text" placeholder="Ingresa el Usuario">
                    <!---Contraseña--->
                    <label class="titulos" for="password">Contraseña</label>
                    <input type="password" placeholder="Ingresa la contraseña">
        
                    <input type="submit" value="Iniciar">
                    <a class="link-a" href="#">¿Olvidaste tu contraseña?</a><br>
                    <a class="link-a" href="#">¿No te has registrado aun?</a>
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
