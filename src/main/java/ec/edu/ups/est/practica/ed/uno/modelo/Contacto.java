/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.practica.ed.uno.modelo;

import java.util.Objects;

/**
 *
 * @author ESTUDIANTE
 */
public class Contacto<T> {
   T telefono;
   T nombre;
   Contacto<T> siguiente; 

    public Contacto(T telefono, T nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public T getTelefono() {
        return telefono;
    }

    public void setTelefono(T telefono) {
        this.telefono = telefono;
    }

    public T getNombre() {
        return nombre;
    }

    public void setNombre(T nombre) {
        this.nombre = nombre;
    }

    public Contacto<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Contacto<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.telefono);
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.siguiente);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto<?> other = (Contacto<?>) obj;
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.siguiente, other.siguiente);
    }

    @Override
    public String toString() {
        return "Contacto{" + "telefono=" + telefono + ", nombre=" + nombre + '}';
    }

    

       
}
