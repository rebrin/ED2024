package unidad.tda;

import java.util.Arrays;
import java.util.Random;

public class PruebaReferencias {

    public static void main(String[] args) {
        int arrA[]={1,2,3,5,8,7,9,11,13,18};
        int arrB[]=arrA.clone();
        System.out.println(arrB[2]);
        Random r=new Random();
        for (int i = 0; i < arrB.length; i++) {
            arrB[i]=r.nextInt(100);
        }
        System.out.println(Arrays.toString(arrA));
    }
}
