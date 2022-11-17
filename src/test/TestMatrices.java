package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        int[][] edades = new int[3][2];

        edades[0][0] = 25;
        edades[0][1] = 5;
        edades[1][0] = 45;
        edades[1][1] = 35;

        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Valor: " + edades[i][j]);
            }
        }

        String[][] frutas = {{"Naranja", "Limon"}, {"Fresa", "Banana"}};

        imprimir(frutas);

        Persona[][] personas = new Persona[2][3];
        personas[0][0] = new Persona("Carlos");
        personas[0][1] = new Persona("Jose");

        imprimir(personas);

    }

    public static void imprimir(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Fruta: " + matriz[i][j]);
            }
        }
    }
}
