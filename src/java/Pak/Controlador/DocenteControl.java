package Pak.Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Pak.Services.ServicesDocentes;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc20
 */
@WebServlet(urlPatterns = {"/ingreso"})
public class DocenteControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void sercice(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            ServicesDocentes regis = new ServicesDocentes();

            String nombre = request.getParameter("NOMBRE").toUpperCase();
            String apellido = request.getParameter("APELLIDO").toUpperCase();
            String DNI = request.getParameter("DNI").toUpperCase();
            String TELEFONO = request.getParameter("TELEFONO").toUpperCase();
            String FECHA = request.getParameter("FECHA").toUpperCase();
            String DIRECCION = request.getParameter("DIRECCION").toUpperCase();
            String CORREOP = request.getParameter("CORREOP").toUpperCase();
            String CORREOC = request.getParameter("CORREOC").toUpperCase();

            regis.IncertDocente(nombre, apellido, DNI, TELEFONO, FECHA, DIRECCION, CORREOP, CORREOC);

            response.sendRedirect("IgresoDocentes.jsp");

        } finally {

            out.close();
        }
    }

}
