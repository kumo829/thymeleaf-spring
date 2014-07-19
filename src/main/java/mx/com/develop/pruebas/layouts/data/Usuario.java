/*
 * Usuario.java
 *
 * Creada el 13-jul-2014, 10:09:22
 *
 * Clase Java desarrollada por Alex Montoya para la empresa Develop el día 13-jul-2014
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
 * @creation-date 13-jul-2014
 */
public class Usuario implements Serializable {

    private int id;
    private String name;
    private String lastname;
    private String nationallity;

    public Usuario() {
    }

    public Usuario(String name, String lastname, String nationallity) {
        this.name = name;
        this.lastname = lastname;
        this.nationallity = nationallity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getNationallity() {
        return nationallity;
    }

    public void setNationallity(String nationallity) {
        this.nationallity = nationallity;
    }

}
