package unidad.recursividad;

import java.util.Scanner;

public class FibREcursivo {
    public FibREcursivo() {
        Scanner s = new Scanner(System.in);
        System.out.println("introduce el numero fibonacci que quieres");
        long n = s.nextLong();
        System.out.println(fib(n));
    }

    public long fib(long n) {
        //cond parada
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        new FibREcursivo();
    }


    //todo Programacion Dinamica agregar
    // el guardar las soluciones anteriores en alguna TDA
}
