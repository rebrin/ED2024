package unidad.lineales;

public class PilaDoble<T> extends ListaDoble<T>{
    public PilaDoble(){
        super();
    }
    public void push(T el){
        insertarFinal(el);
    }

    public T pop(){
        return eliminarFinal();
    }

    public static void main(String[] args) {
        PilaDoble<Integer> pila=new PilaDoble();
        pila.push(6);
        pila.push(2);
        pila.push(3);
        pila.push(3);
        pila.push(5);
        pila.push(1);
        System.out.println();
        pila.printElementos();
        System.out.println("elemento retirado "+pila.pop());
        System.out.println("elemento retirado "+pila.pop());
        System.out.println("elemento retirado "+pila.pop());
        System.out.println(pila.cuantos);
        pila.printElementos();
    }

    //todo: Hacer ustedes la cola con su clase listaDoble
}
