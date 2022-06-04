package com.upchiapas.taxis;
import com.upchiapas.taxis.models.Chofer;
import com.upchiapas.taxis.models.Vehiculo;
// integrantes del equipo
// 221249 carlos andres martinez morales
// 213537 pedro josafat ruiz robles

import java.util.Scanner;

public class Main {
    public static Vehiculo[] listaVehiculo= new Vehiculo[5];
    public static String[] asignacion = new String[5];
    public static Chofer c[]=new Chofer[5];


    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        byte opcion;

        System.out.println("1.- Alta de Vehiculos");
        System.out.println("2.- Alta de Choferes");
        System.out.println("selecciona una opcion");
        opcion=teclado.nextByte();

        switch (opcion){
            case 1: listaVehiculo();
            break;
            case 2 : listaChofer();
            break;

        }

    }

    public static void listaVehiculo(){
        listaVehiculo[0] = new Vehiculo("H93040","tsuru");
        listaVehiculo[1] = new Vehiculo("T72536","ferrari");
        listaVehiculo[2] = new Vehiculo("W467583","lamborghini");
        listaVehiculo[3] = new Vehiculo("N26363","Rolls Royce");
        listaVehiculo[4] = new Vehiculo("E873040","Corvette");
        for (int i =0; i<5;i++){
            System.out.println(listaVehiculo[i]);
        }


    }
    public static void listaChofer(){
        Scanner leer = new Scanner(System.in);



        String nombre = " ";
        int edad = 0;
        char genero =' ';

        for (int i=0;i<c.length;i++){
            System.out.println("ingrese el Nombre del conductor");
            nombre = leer.nextLine();
            System.out.println("ingrese la edad del conductor");
            edad = leer.nextInt();
            System.out.println("ingrese el genero del conductor");
            genero = leer.next().charAt(0);

            leer.nextLine();

            c[i]= new Chofer(nombre,edad,genero);
        }
        for (int i=0;i<c.length;i++){
            System.out.println(c[i].getNombre() + "" + c[i].getEdad() + "" + c[i].getGenero());
        }


    }
    public void asignacion(){

    }


}
