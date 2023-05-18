package com.william.crud.Entity;

import jakarta.persistence.*;

@Entity     //1 con esto decimos que queremos que spring reconnosca esta clase como entidad como tal
@Table(name = "humano")//3tenemos que indicar la tabla de la base de datos
public class Persona {
    //2 tenemos que agregar setear los atributos que tengamos en nuestra base de datos
    //4 necesitamos agregar etiquetas el atributo id le tenemos que decir que lo reconosca como un
    //atributo de tipo id
    @Id //4.1 etiqueta para el atributo id
    @GeneratedValue //5 este atributo nos dice que cada vez que creemos un objeto tendra un nuevo id se v a ir imcrementando de manera automatica (auto_imcrement)
    @Column(name = "id") //6 etiquta column le decimos a spring
    private int id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "email")
    private String email;
    @Column(name = "edad")
    private int edad;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "clave")
    private int clave;

    //7 creamos getters and setters
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    //8 ahora nos vamos al archivo Repository y creamos una interface PersonaRepo.java
}


