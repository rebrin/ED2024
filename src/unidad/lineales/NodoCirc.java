package unidad.lineales;

public class NodoCirc<T> {
    T info;
    NodoCirc<T> next;
    NodoCirc(T el){
        info=el;
        next=this;
    }

    NodoCirc(T el, NodoCirc n){
        info=el;
        next=n;
    }
}
