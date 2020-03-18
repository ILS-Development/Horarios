/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak.Controlador;

import Pak.Services.ServicesDocentes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ivan
 */
@WebServlet(name = "DocenteCont", urlPatterns = {"/Docente"})
public class DocenteCont extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            ServicesDocentes regis = new ServicesDocentes();

            String nombre = request.getParameter("NOMBRE");
            String apellido = request.getParameter("APELLIDO");
            String DNI = request.getParameter("DNI");
            String TELEFONO = request.getParameter("TELEFONO");
            String FECHA = request.getParameter("FECHA");
            String DIRECCION = request.getParameter("DIRECCION");
            String CORREOP = request.getParameter("CORREOP");
            String CORREOC = request.getParameter("CORREOC");

            regis.IncertDocente(nombre, apellido, DNI, TELEFONO, FECHA, DIRECCION, CORREOP, CORREOC);

            response.sendRedirect("IgresoDocentes.jsp");

        }
    }

}
