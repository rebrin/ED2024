package unidad.recursividad;

import java.util.Scanner;

public class EuclidesMCD {
    public EuclidesMCD(){
        Scanner s=new Scanner(System.in);
        System.out.println("introduce a:");
        int a=s.nextInt();
        System.out.println("introduce b");
        int b=s.nextInt();
        System.out.println(mcd(a,b));
    }

    private int mcd(int a, int b) {
        if(b==0)
            return a;
        else return mcd(b,a%b);
    }

    public static void main(String[] args) {
        new EuclidesMCD();
    }

    //todo recibir un arreglo y van a regresar el min de manera recursiva
    //todo y el maximo tambien recursivo
}
