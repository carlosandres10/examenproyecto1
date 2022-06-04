package com.upchiapas.taxis.models;

public class Chofer {
    private String nombre;
    private int edad;
    private char genero;

    public Chofer(){
        nombre="";
        edad = 0;
        genero =' ';
    }
    public Chofer(String n,int e, char g ){
        nombre=n;
        edad = e;
        genero =g;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {

        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
