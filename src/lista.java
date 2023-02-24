package JUANDIEGO;

public class lista {

    nodo inicio;

    /*public lista() {
        inicio = null;
    }*/

    public void insertarInicio(byte dato) {
        nodo nuevo = new nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            return;
        }
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    public void insertarFin(byte dato) {
        nodo nuevo = new nodo(dato);
        if (inicio == null) {
            inicio = nuevo;
            return;
        }
        nodo aux = inicio;
        while (aux.siguiente != null) {
            aux = aux.siguiente;
        }
        aux.siguiente = nuevo;
    }

    public void eliminar(byte dato) {
        if (inicio == null) {
            System.out.println("No existe dato para eliminar");
            return;
        }

        if (inicio.dato == dato) {
            System.out.println("Dato eliminado de la lista.\n\n");
            inicio = inicio.siguiente;
            return;
        }

        nodo anteriorNodo = inicio;
        nodo actualNodo = inicio.siguiente;

        while (actualNodo != null && actualNodo.dato != dato) {
            anteriorNodo = actualNodo;
            actualNodo = actualNodo.siguiente;
            System.out.println("Dato eliminado de la lista.\n\n");
        }

        if (actualNodo == null) {
            System.out.println("No hay nada\n\n");
            return;
        }

        // Actualizar los punteros para saltar el nodo que se va a eliminar.
        anteriorNodo.siguiente = actualNodo.siguiente;
    }

    public void eliminarInicio() {
        if (inicio != null) {
            inicio = inicio.siguiente;
            System.out.println("Dato eliminado del inicio de la lista.\n\n");
        } else {
            System.out.println("No hay nada que eliminar");
            return;
        }
    }

    public void eliminarFin() {
        if (inicio == null) {
            System.out.println("No hay que eliminar");
            return;
        }

        if (inicio.siguiente == null) {
            System.out.println("Dato eliminado del final de la lista.\n\n");
            inicio = null;
            return;
        }

        // Recorremos la lista hasta el penúltimo nodo.
        nodo aux = inicio;
        while (aux.siguiente.siguiente != null) {
            aux = aux.siguiente;
        }

        // Actualizo el puntero el penultimo nodo en nulo
        aux.siguiente = null;
    }

    public nodo buscarDato(byte datoBuscado) {
        nodo actual = inicio;
        byte posicion = 1;

        while (actual != null) {
            if (actual.dato == datoBuscado) {
                System.out.println("El dato " + datoBuscado + " se encuentra en el nodo " + posicion + " de la lista.");
                return actual;
            }
            actual = actual.siguiente;
            posicion++;
        }

        System.out.println("El dato " + datoBuscado + " no se encuentra en la lista.");
        return null;
    }

    public void imprimirLista() {
        nodo actual = inicio;
        if (actual!=null) {
            System.out.println("Imprimiendo lista....");
            while (actual != null) {
                System.out.print(actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println();
        }else {
            System.out.println("No hay lista para imprimir");
        }
    }


}
