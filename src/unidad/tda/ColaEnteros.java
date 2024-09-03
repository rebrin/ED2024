package unidad.tda;

public class ColaEnteros{
    //atributos de clase
    private int [] data;
    private int head,tail;
    //constructor de clase
    public ColaEnteros(int tam){
        data=new int[tam];
        head=tail=0;
    }
    //metodo queue
    public void queue(int num){
        data[tail]=num;
        tail=(tail+1)% data.length;
    }
    //metodo dequeue
    public int dequeue(){
        int value=data[head];
        head=(head+1)% data.length;
        return value;
    }
    //vacia
    public boolean isEmpty(){
        return head==tail;
    }
    //size
    public int size(){
        return (tail-head+ data.length)% data.length;
    }

    @Override
    public String toString() {
        String cadena="";
        for (int i = head; i < tail; i++) {
            cadena+=data[i]+" ";
        }
        return cadena;
    }

    public static void main(String[] args) {
        ColaEnteros colaEnteros=new ColaEnteros(5);
        colaEnteros.queue(13);
        colaEnteros.queue(20);
        colaEnteros.queue(11);
        colaEnteros.queue(2);
        colaEnteros.queue(3);
        System.out.println("elementos "+ colaEnteros.size());
        System.out.println(colaEnteros);
        System.out.println(colaEnteros.dequeue());
        System.out.println(colaEnteros);
//        System.out.println(Arrays.toString(colaEnteros.data));
    }
}
