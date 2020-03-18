/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pak.Modelo;

/**
 *
 * @author Ivan
 */
public class DocentesModel {
private String   ID_Docente ;
private String  Nombre ;
private String Apellido ;
private String DNI ;
private String TELEFONO ;
private String echa_Nacimiento ;
private String Direccion ;
private String  Correo_PERSONAL ;
private String Correo_CORPORATIVO ;
    
    
    public DocentesModel() {
    }

    public DocentesModel(String ID_Docente, String Nombre, String Apellido, String DNI, String TELEFONO, String echa_Nacimiento, String Direccion, String Correo_PERSONAL, String Correo_CORPORATIVO) {
        this.ID_Docente = ID_Docente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DNI = DNI;
        this.TELEFONO = TELEFONO;
        this.echa_Nacimiento = echa_Nacimiento;
        this.Direccion = Direccion;
        this.Correo_PERSONAL = Correo_PERSONAL;
        this.Correo_CORPORATIVO = Correo_CORPORATIVO;
    }

    public String getID_Docente() {
        return ID_Docente;
    }

    public void setID_Docente(String ID_Docente) {
        this.ID_Docente = ID_Docente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

    public String getEcha_Nacimiento() {
        return echa_Nacimiento;
    }

    public void setEcha_Nacimiento(String echa_Nacimiento) {
        this.echa_Nacimiento = echa_Nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo_PERSONAL() {
        return Correo_PERSONAL;
    }

    public void setCorreo_PERSONAL(String Correo_PERSONAL) {
        this.Correo_PERSONAL = Correo_PERSONAL;
    }

    public String getCorreo_CORPORATIVO() {
        return Correo_CORPORATIVO;
    }

    public void setCorreo_CORPORATIVO(String Correo_CORPORATIVO) {
        this.Correo_CORPORATIVO = Correo_CORPORATIVO;
    }
    
    
}
