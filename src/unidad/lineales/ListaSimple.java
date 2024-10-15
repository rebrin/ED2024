package unidad.lineales;

public class ListaSimple {
    NodoSimple Head, Tail;
    int cuantos;

    public ListaSimple() {
        Head = Tail = null;
        cuantos = 0;
    }

    //identifica si la lista esta vacia
    public boolean isEmpty() {
        return Head == null;
    }

    //insertar al final
    public void insertarFrente(int el) {
        if (isEmpty()) {
            Head = Tail = new NodoSimple(el);
        } else {
            Head = new NodoSimple(el, Head);
        }
        cuantos++;
    }

    public void insertarFinal(int el) {
        NodoSimple nvo = new NodoSimple(el);
        if (isEmpty()) {
            Head = Tail = nvo;
        } else {
            Tail.next = nvo;
            Tail = nvo;
        }
        cuantos++;
    }

    public void printElementos() {
        System.out.print("[ ");
        for (NodoSimple tmp = Head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
        System.out.println("]");
    }

    public int eliminarFrente() {
        if (Head != null) {
            int el = Head.info;
            if (Head == Tail)
                Head = Tail = null; //es el unico en la lista
            else Head = Head.next;//hay mas de uno y avanza
            cuantos--;
            return el;
        }
        return Integer.MIN_VALUE;
    }

    public int eliminarFinal() {
        if (Head != null) {//no esta vacia
            int el = Tail.info;
            if (Head == Tail)//solo hay un valor
                Head = Tail = null;
            else {// hay mas de un elemento
                NodoSimple tmp;
                for (tmp = Head; tmp.next != Tail; tmp = tmp.next) ;
                Tail = tmp;
                tmp.next = null;
            }
            cuantos--;
            return el;
        }
        return Integer.MIN_VALUE;
    }

    public void elimina(int el) {
        if (!isEmpty()) {
            if (Head == Tail && el == Head.info)//el unico
                Head = Tail = null;
            else if (el == Head.info) {// el primero de muchos
                Head = Head.next;
            } else { //eliminar de en medio o del fin
                NodoSimple tmp, pred;
                for (pred = Head, tmp = Head.next;
                     tmp != null && el != tmp.info;
                     pred = pred.next, tmp = tmp.next) ;
                if(tmp!=null){// si encontro en la lista al el
                    pred.next=tmp.next;
                    if(tmp==Tail){ //si el es la cola de la lista
                        Tail=pred;
                    }
                }
                cuantos--;
            }//fin del else en medio
        }//fin de si no vacia
    }

    public boolean inList(int el) {
        NodoSimple tmp;
        for (tmp = Head; tmp != null && tmp.info != el; tmp = tmp.next) ;
        return tmp != null;
    }

    public int indexOf(int el) {
        int indice = 0;
        NodoSimple tmp;
        for (tmp = Head; tmp != null && tmp.info != el; tmp = tmp.next, indice++) ;
        return tmp != null ? indice : -1;
    }

    public static void main(String[] args) {
        ListaSimple ls = new ListaSimple();//creamos nuestra lista
        ls.insertarFrente(2);
        ls.insertarFrente(1);
        ls.insertarFrente(0);
        ls.insertarFinal(3);
        ls.insertarFinal(4);
        System.out.println("elementos:" + ls.cuantos);
        ls.printElementos();
        //probamos eliminar frente
//        System.out.println("eliminado:"+ls.eliminarFrente());
//        System.out.println("eliminado:"+ls.eliminarFrente());
//        System.out.println("eliminado:"+ls.eliminarFrente());
//        System.out.println("eliminado:"+ls.eliminarFrente());
//        System.out.println("eliminado:"+ls.eliminarFrente());
//        ls.printElementos();
//        System.out.println("eliminado:" + ls.eliminarFinal());
//        System.out.println("eliminado:" + ls.eliminarFinal());
//        ls.printElementos();
//        System.out.println(ls.inList(1));
//        System.out.println(ls.indexOf(1));
            ls.elimina(5);
            ls.printElementos();
    }
}
