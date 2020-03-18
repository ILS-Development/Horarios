<%-- 
    Document   : IgresoDocentes
    Created on : 13/01/2020, 04:20:18 PM
    Author     : Ivan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario Docentes</title>
        <link href="CSS/I_Docentes.css" rel="stylesheet" type="text/css">
            <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
     
     
            <script>
            $(function () {
                $("#datepicker").datepicker();
            });
        </script>
    </head>
    <body>
      
        
        
        <div class="container">  
            <form id="contact" action="Docente" method="post">
                
                <img src="Imagen/LogoHorario.png" style="width: 110px;height: 110px; float: left;">
                
                <h1 style="padding-top: 40px;"><b>INSERTAR NUEVO DOCENTE:</b></h1>
              
                <fieldset>
                    Nombres:
                    <input placeholder="Nombres" type="text" tabindex="2" name="NOMBRE" required autofocus>
                </fieldset>
                <fieldset>
                    Apellidos:
                    <input placeholder="Apellidos" type="text" tabindex="3"  name="APELLIDO"  required autofocus>
                </fieldset>
                <fieldset>
                    DNI:
                    <input placeholder="DNI" type="text" tabindex="4"   name="DNI" required autofocus>
                </fieldset>
                <fieldset>
                    Teléfono:
                    <input placeholder="Teléfono" type="tel" tabindex="5"  name="TELEFONO"  required>
                </fieldset>
                <fieldset>
                   
                     <label for="datepicker"> Fecha de Nacimiento:</label>
                    <input type="text" tabindex="6"  name="FECHA" id="datepicker" >
                </fieldset>
                <fieldset>
                    Dirección:
                    <input placeholder="Dirección (Opcional)" type="text" tabindex="7"  NAME="DIRECCION" >
                </fieldset>
                <fieldset>
                    Correo Personal:
                    <input placeholder="Correo Personal" type="email" tabindex="8"  name="CORREOP"  required>
                </fieldset>
                <fieldset>
                    Correo Corporativo:
                    <input placeholder="Correo Corporativo" type="email" tabindex="9"  name="CORREOC"  required>
                </fieldset>
                <fieldset>
                    <button  type="submit" id="contact-submit" name="Docente" >INSERTAR</button>
                </fieldset>
            </form>
        </div>
                       
    </body>
</html>
