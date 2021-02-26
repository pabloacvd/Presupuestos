package ar.com.xeven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do {
            System.out.print("Ingrese el nombre de usuario: ");
            String nombre = sc.nextLine();
            System.out.println("");
            Usuario usuario = new Usuario(nombre);
            usuario.armarPresupuesto();
            System.out.print("¿Desea continuar? 1=SI, 0=NO");
            op = sc.nextInt();
        }while(op!=0);
        // mostrar todos los presupuestos
    }
}
