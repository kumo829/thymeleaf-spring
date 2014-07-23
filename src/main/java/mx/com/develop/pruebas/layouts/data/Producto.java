/*
 * Producto.java
 *
 * Creada el 19-jul-2014, 12:45:46
 *
 * Clase Java desarrollada por Alex Montoya para la empresa Develop el día 19-jul-2014
 *
 * Para informacion sobre el uso de esta clase, asi como bugs, actualizaciones, o mejoras enviar un mail a
 * amontoya@7i.com.mx
 *
 */
package mx.com.develop.pruebas.layouts.data;

import java.io.Serializable;

/**
 *
 * @author Alex Montoya
 * @version 1.0
 * @author-mail amontoya@7i.com.mx
 * @creation-date 19-jul-2014
 */
public class Producto implements Serializable {

    private int id;
    private String nombre;
    private String descripcion;
    private String upc;
    private String gramaje;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, String upc, String gramaje) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.upc = upc;
        this.gramaje = gramaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getGramaje() {
        return gramaje;
    }

    public void setGramaje(String gramaje) {
        this.gramaje = gramaje;
    }

}
