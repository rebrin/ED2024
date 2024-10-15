package unidad.lineales;

public class NodoDoble<T> {
    T info;
    NodoDoble<T> next, prev;

    public NodoDoble(T el) {
        info = el;
    }
    public NodoDoble(T el, NodoDoble n, NodoDoble p) {
        info = el;
        next = n;
        prev = p;
    }
}
