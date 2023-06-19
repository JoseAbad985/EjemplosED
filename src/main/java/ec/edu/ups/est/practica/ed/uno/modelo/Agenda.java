/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.ed.uno.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class Agenda<T> {

    private Contacto<T> cabeza;
    private int tamaño;
    private List<Contacto> listaContactos;

    public Agenda() {
        listaContactos = new ArrayList<>();
    }

    //Agregar
    public void agregar(Contacto contacto) {
        listaContactos.add(contacto);
        Contacto<T> nuevo = contacto;
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Contacto<T> ultimoNodo = obtenerUltimo();
            ultimoNodo.setSiguiente(nuevo);
        }
        tamaño++;
    }

    //Obtener Ultimo
    public Contacto<T> obtenerUltimo() {
        Contacto<T> actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();

        }
        return actual;
    }

    //Obtener por nombre
    public Contacto getElementByNombre(Object nombre) {
        for (Contacto contacto : listaContactos) {
            if (contacto.getNombre().equals(nombre)) {
                    return contacto;
            } else {
                System.out.println("No existe el contacto");
            }
        }
        return null;
    }
    
    
    public void eliminarContacto(Contacto contacto){
        Iterator<Contacto> it = listaContactos.iterator();
        while (it.hasNext()) {
            Contacto c = it.next();
            if (c.getNombre().equals(contacto.getNombre())){
                it.remove();
                break;
            }
        }
    }
}

