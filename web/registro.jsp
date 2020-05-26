<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
    </head>
    <body id='body'>
        <header>
            <nav>
                <div id="grid_1">
                    <form action="index.jsp">
                        <input type="submit" value="HOME">
                    </form>
                </div>
                <div id="grid_2">
                    <form action="servicios.jsp">
                        <input type="submit" value="Servicios">
                    </form>
                </div>
                <div id="grid_3">
                    <form action="login.jsp">
                        <input type="submit" value="Iniciar sesion">
                    </form>
                    <a href="registro.jsp" style="font-size: 15px">o registrate</a>
                </div>
            </nav>
        </header>
        
        <center>
            <div id='log' style='margin:200px'>
                REGISTRATE <br><br><br>
                <form action='registro' method="post">
                    <table>
                        <tr>
                            <td>Nombre:</td>
                            <td><input type='text' name='nombre' class='text' placeholder='Nombre'></td>
                        </tr>
                        <tr>
                            <td>Apellido Paterno:</td>
                            <td><input type='text' name='paterno' class='text' placeholder='Apellido paterno'></td>
                        </tr>
                        <tr>
                            <td>Apellido Materno:</td>
                            <td><input type='text' name='materno' class='text' placeholder='Apellido materno'></td>
                        </tr>
                        <tr>
                            <td>Email:</td>
                            <td><input type='text' name='correo' class='text' placeholder='Correo electronico'></td>
                        </tr>
                        <tr>
                            <td>Password:</td>
                            <td><input type='text' name='contrasena' class='text' placeholder='Contraseña'></td>
                        </tr>
                        <tr>
                            <td>Fecha de nacimiento:</td>
                            <td><input type='date' name='cumpleanos' class='text' placeholder='CURP'></td>
                        </tr>
                        <tr>
                            <td>Telefono:</td>
                            <td><input type='text' name='telefono' class='text' placeholder='Fecha de nacimiento'></td>
                        </tr>
                        <tr>
                            <td>Celular:</td>
                            <td><input type='text' name='celular' class='text' placeholder='Direccion'></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input type='submit' value='Registrarse' id='boton'></td>
                        </tr>
                    </table>
                </form>
            </div>
        </center>
        
        <footer>
            <div>
                <p>Terminos y condiciones</p>
            </div>
        </footer>
    </body>
</html>
