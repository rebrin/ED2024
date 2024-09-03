package unidad.tda;

import java.util.Arrays;
import java.util.Random;

public class SumMatrix {
    double [][] m1;
    double [][] m2;
    double [][] mres;
    public SumMatrix(int n){
         m1=new double[n][n];
         m2=new double[n][n];
         mres=new double[n][n];
        //inicializar aleatorio
        Random r=new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                m1[i][j]=r.nextDouble();
                m2[i][j]=r.nextDouble();
            }
        }
    }

    public double[][] sumar(){
        for (int i = 0; i < m1.length ; i++) {
            for (int j = 0; j < m1.length; j++) {
                mres[i][j]=m1[i][j]+m2[i][j];
            }
        }
        return mres;
    }

    public static void main(String[] args) {
        SumMatrix sm=new SumMatrix(4);
        System.out.println(Arrays.deepToString(sm.sumar()));
    }

    //todo realizar la suma de matrices -- prácticas

}
