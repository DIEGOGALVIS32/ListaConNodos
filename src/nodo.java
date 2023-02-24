package JUANDIEGO;

public class nodo {

    byte dato;
    nodo siguiente;


    /* no recibe nada y estable la variable en 0*/

    public nodo() {
        dato = 0;
        siguiente = null;
    }

    /* recibe un argumento en byte y inicial el dato en la variable que recibe*/
    public nodo(byte d) {
        dato = d;
        siguiente = null;
    }

    /* recibe dos datos de tipo byte y otro tipo nodo y establece el dato en byte que recibe y el valor de siguiente con el nodo dado*/
    public nodo(byte d, nodo s) {

        dato = d;
        siguiente = s;
    }
}
