/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.ed.uno.controlador;

import ec.edu.ups.est.practica.ed.uno.modelo.Agenda;
import ec.edu.ups.est.practica.ed.uno.modelo.Contacto;
import ec.edu.ups.est.practica.ed.uno.vista.VistaContacto;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorContacto {
    
    private VistaContacto vistaContacto;
    private Contacto contacto;
    private Agenda agenda;

    public ControladorContacto(VistaContacto vistaContacto, Agenda agenda) {
        this.vistaContacto = vistaContacto;
        this.agenda = agenda;
    }
    
    

    public ControladorContacto(VistaContacto vistaContacto, Contacto contacto, Agenda agenda) {
        this.vistaContacto = vistaContacto;
        this.contacto = contacto;
        this.agenda = agenda;
    }
    
    public void registrarContacto(){
        contacto = vistaContacto.ingresarContacto();
        agenda.agregar(contacto);
    }
    
    public void verContacto(){
        String nombre = vistaContacto.pedirNombre();
        contacto = agenda.getElementByNombre(nombre);
        System.out.println("El contacto con el nombre ingresado es: " + contacto);
    }
    
    public void eliminarContacto(){
        String nombre = vistaContacto.pedirNombre();
        contacto = agenda.getElementByNombre(nombre);
        agenda.eliminarContacto(contacto);
        System.out.println("El contacto ha sido eliminado");
    }
}
