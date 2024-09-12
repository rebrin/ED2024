package unidad.tda;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class PruebaPilasColas {
    public static void main(String[] args) {
        Stack<Integer> pila=new Stack<>();
        Queue<Integer> cola=new LinkedList<>();

        Random r= new Random();
        for (int i=0;i<10;i++){
            int num=r.nextInt(100);
            pila.push(num);
            cola.add(num);
        }
        System.out.println(pila.toString());
        System.out.println(cola.toString());
        System.out.println(pila.pop());
        System.out.println(cola.poll());
        Stack<String>uwu=new Stack<>();
        uwu.push("hola mundo");
        uwu.push("helo word");
        uwu.push("hola rebri");
        System.out.println(uwu.toString());

    }
}
