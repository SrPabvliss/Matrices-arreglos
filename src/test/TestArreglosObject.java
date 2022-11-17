package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona[] personas = new Persona[2];
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Micaela");

        System.out.println("personas1 = " + personas[0]);
        System.out.println("personas2 = " + personas[1]);

        personas[0].setNombre("Pablo");
        System.out.println("personas1 = " + personas[0]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }
        
        String [] frutas = {"Pera", "Manzana", "Naranja"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta = " + frutas [i]);
        }

    }
}
