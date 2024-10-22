package unidad.no.lineales;

public class BTNodo {
    int key;//informacion
    BTNodo left,right;//hijos
    BTNodo(int elemento){
        this(elemento,null,null);
    }
    BTNodo(int elemento,BTNodo l,BTNodo r){
        key=elemento;
        left=l;
        right=r;
    }
}
