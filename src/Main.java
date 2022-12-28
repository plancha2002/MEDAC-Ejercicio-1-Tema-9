import sun.security.krb5.internal.crypto.Des;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        char opcion=' ';
        String cliente;
        String Descripcion;
        double importeSinIVA;

        System.out.println("¿Desea crear una factura?");
        System.out.print("y/n:");
        opcion=input.next().charAt(0);
        System.out.println();

        System.out.print("Introduzca el nombre del cliente:");
        input.nextLine();
        cliente=input.nextLine();
        System.out.println();
        System.out.print("Descripcion del producto: ");
        Descripcion=input.nextLine();
        System.out.println();
        System.out.print("Introduzca el importe sin IVA en formato 0,00: ");
        importeSinIVA=input.nextDouble();

        Factura fact = new Factura(cliente, Descripcion, importeSinIVA);

        System.out.println(fact.imprimirPresupuesto());



    }
}