package unidad.lineales;

public class ListaSimple {
    NodoSimple Head,Tail;
    int cuantos;

    public ListaSimple(){
        Head=Tail=null;
        cuantos=0;
    }
    //identifica si la lista esta vacia
    public boolean isEmpty(){
        return Head==null;
    }
    //insertar al final
    public void insertarFrente(int el){
        if (isEmpty()){
            Head=Tail=new NodoSimple(el);
        }else{
            Head=new NodoSimple(el,Head);
        }
        cuantos++;
    }

    public void insertarFinal(int el){
        NodoSimple nvo=new NodoSimple(el);
        if(isEmpty()){
            Head=Tail=nvo;
        }else {
            Tail.next=nvo;
            Tail=nvo;
        }
        cuantos++;
    }

    public static void main(String[] args) {
        ListaSimple ls=new ListaSimple();//creamos nuestra lista
        ls.insertarFrente(2);
        ls.insertarFrente(1);
        ls.insertarFrente(0);
        ls.insertarFinal(3);
        ls.insertarFinal(4);
        System.out.println("elementos:"+ls.cuantos);
    }
}
