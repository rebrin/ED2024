package unidad.tda;

import java.util.Arrays;
import java.util.Random;

public class PruebaArrays {
    //inicializacion rapida
    //int [] arreglo={1,2,3,6,8,9,43,65,9};

    int arreglo[];
    PruebaArrays(int n){
        arreglo=new int[n];
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i]= r.nextInt(100);
        }
    }

    public double promedio(){
        double suma=0;
        for (int i = 0; i < arreglo.length; i++) {
            suma+=arreglo[i];
        }
        return suma/arreglo.length;
    }

    public static void main(String[] args) {
        PruebaArrays prueba=new PruebaArrays(10);
        System.out.println(Arrays.toString(prueba.arreglo));
        System.out.println(prueba.promedio());
    }
}
