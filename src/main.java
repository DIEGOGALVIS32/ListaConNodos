
import JUANDIEGO.lista;
import JUANDIEGO.nodo;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        lista miLista = new lista();
        Scanner sc = new Scanner(System.in);
        byte opcion;
        byte dato;

        do {
            System.out.println("============= MENU PRINCIPAL ============="
                    + "\nInsertar nodos: \n"
                    + "\s1.Al inicio\n"
                    + "\s2.Al final\n"
                    + "Elminar nodos:\n"
                    + "\s3.Al inicio\n"
                    + "\s4.Al final\n"
                    + "\s5.Dato especifico\n"
                    + "6.Buscar dato\n"
                    + "7.Imprimir lista\n"
                    + "Ingrese la opcion:\n");
            opcion = sc.nextByte();
            System.out.println("Has ingresado la opcion: "+opcion);
            System.out.println("==========================================");



            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el dato a insertar: ");
                    dato = sc.nextByte();
                    miLista.insertarInicio(dato);
                    System.out.println("Dato insertado al inicio de la lista.\n\n");
                    break;
                case 2:
                    System.out.print("Ingrese el dato a insertar: ");
                    dato = sc.nextByte();
                    miLista.insertarFin(dato);
                    System.out.println("Dato insertado al final de la lista.\n\n");
                    break;
                case 3:
                    miLista.eliminarInicio();

                    break;
                case 4:
                    miLista.eliminarFin();

                    break;
                case 5:
                    System.out.print("Ingrese el dato a eliminar: ");
                    dato = sc.nextByte();
                    miLista.eliminar(dato);
                    break;
                case 6:
                    System.out.print("Ingrese el dato a buscar: ");
                    dato = sc.nextByte();
                    nodo resultado = miLista.buscarDato(dato);
                    if (resultado == null) {
                        System.out.println("El dato no se encontró en la lista.\n\n");
                    } else {
                        System.out.println("El dato se encontró en la lista.\n\n");
                    }
                    break;

                case 7:
                    miLista.imprimirLista();

                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 8);
    }
}
