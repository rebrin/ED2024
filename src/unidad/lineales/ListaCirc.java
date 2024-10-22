package unidad.lineales;

public class ListaCirc <T>{
    NodoCirc<T>Head;
    NodoCirc<T>Tail;

    ListaCirc(){
        Head=Tail=null;
    }
    public boolean isVacia(){
        return Head==null && Tail==null;
    }

    public void insertarInicio(T el){
        NodoCirc<T> nuevo=new NodoCirc<T>(el);
        if(isVacia()){
            Tail=nuevo;
        }else{
            nuevo.next=Head;}
        Head=nuevo;
        Tail.next=Head;
    }
    //todo hacer insertar al final en la lista

    public void prinElementos(){
        System.out.print("[ ");
        if(isVacia()){
            return;
        } else {
            NodoCirc<T> tmp=Head;
            System.out.print(tmp.info+" ");
            for (tmp=Head.next;tmp!=Head;tmp=tmp.next){
                System.out.print(tmp.info+" ");
            }
        }
        System.out.println( "]");
    }

    public static void main(String[] args) {
        ListaCirc<Integer> CircularInt=new ListaCirc<>();
        System.out.println(CircularInt.isVacia());
        CircularInt.insertarInicio(3);
        CircularInt.insertarInicio(2);
        CircularInt.insertarInicio(1);
        CircularInt.prinElementos();
        System.out.println();
    }


}
