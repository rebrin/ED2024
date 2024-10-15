package unidad.lineales;

public class ListaDoble<T> {
    NodoDoble<T> Head, Tail;
    int cuantos;

    public ListaDoble() {
        Head = Tail = null;
        cuantos = 0;
    }

    public boolean isVacia() {
        return Head == null;
    }

    public void printElementos() {
        System.out.print("[ ");
        for (NodoDoble<T> tmp = Head; tmp != null; tmp = tmp.next)
            System.out.print(tmp.info + " ");
        System.out.println("]");
    }

    public void insertarFrente(T el) {
        NodoDoble<T> nvo = new NodoDoble<T>(el, Head, null);
        if (isVacia()) {
            Head = Tail = nvo;
        } else {
            Head.prev = nvo;
            Head = nvo;
        }//else
        cuantos++;
    }

    public boolean encuentra(T el) {
        NodoDoble<T> tmp;
        for ( tmp= Head; tmp != null && el != tmp.info;
             tmp = tmp.next);
        return tmp!=null;
    }

    public void insertarFinal(T el) {
        NodoDoble<T> nvo = new NodoDoble<T>(el, null, Tail);
        if (isVacia())
            Head = Tail = nvo;
        else {
            Tail.next = nvo;
            Tail = nvo;
        }//fin else
        cuantos++;
    }


    public T eliminarFrente(){
        NodoDoble<T> tmp=Head;
        if(!isVacia()){
            if(Head==Tail){
            Head=Tail=null;
            }//fin if unico
            else {
                Head=Head.next;
                Head.prev=null;
            }
            cuantos--;
            return tmp.info;
        }//fin de if vacia
        return null;
    }

    public T eliminarFinal(){
        NodoDoble<T> tmp=Tail;
        if(!isVacia()){
            if(Head==Tail)
                Head=Tail=null;
            else {
                Tail=Tail.prev;
                Tail.next=null;
            }
            cuantos--;
            return tmp.info;
        }//fin vacia
        return null;
    }

    public void remover(T el){
        if(!isVacia()){
            cuantos--;
            if(Head==Tail && el==Head.info)
                Head=Tail=null;
            else{
                NodoDoble<T> tmp;
                //buscar el nodo dentro
                for(tmp=Head;tmp!=null && el!=tmp.info;tmp=tmp.next);
                if(tmp==Head){
                    Head=Head.next;
                    Head.prev=null;
                } else if (tmp==Tail) {
                    Tail=Tail.prev;
                    Tail.next=null;
                }else if (tmp!=null){
                    tmp.prev.next=tmp.next;
                    tmp.next.prev=tmp.prev;
                }else System.out.println("elemento no existe");
            }
        }
    }

    public static void main(String[] args) {
        ListaDoble<Integer> ld = new ListaDoble<>();
        ld.insertarFrente(3);
        ld.insertarFrente(2);
        ld.insertarFrente(1);
        ld.insertarFinal(4);
        ld.insertarFinal(5);
        ld.printElementos();
//        System.out.println(ld.cuantos);
//        System.out.println(ld.encuentra(6));
//        System.out.println(ld.eliminarFrente());
//        System.out.println(ld.cuantos);
//        ld.printElementos();
        System.out.println("-----");
//        System.out.println(ld.eliminarFinal());
//        System.out.println(ld.cuantos);
//        ld.printElementos();
        ld.remover(6);
        ld.printElementos();

    }
}
