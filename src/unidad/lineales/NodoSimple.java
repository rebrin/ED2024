package unidad.lineales;

public class NodoSimple {
    int info;
    NodoSimple next;

    public NodoSimple(int el){
        info=el;
        next=null;
    }
    public NodoSimple(int el, NodoSimple next){
        info=el;
        this.next=next;
    }
}
