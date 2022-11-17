
package test;

public class TestArreglos {
    public static void main(String[] args) {
        int [] edades = new int [3];
        //Los arreglos tambien son un objeto
        System.out.println("edades = " + edades); //direccion del objeto
        edades [0] = 55;
        System.out.println("edades 0= " + edades [0]);
        edades [1] = 6;
        System.out.println("edades 1= " + edades [1]);
        edades [2] = 25;
        System.out.println("edades 2= " + edades [2]);
        
        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades elementos " + (i+1) + ": " + edades [i]);
        }
    }
}
