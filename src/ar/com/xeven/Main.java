package ar.com.xeven;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Presupuesto presupuesto = new Presupuesto();
        Scanner sc = new Scanner(System.in);
        int op = 0;
        do{
            System.out.println("\n Menú: \n");
            System.out.println("1) Crear nuevo presupuesto");
            System.out.println("2) Agregar elementos al presupuesto");
            System.out.println("0) Salir");
            System.out.print("Ingrese la opción deseada: ");
            op = sc.nextInt();
            switch (op){
                case 1:
                    crearPresupuesto(presupuesto);
                    break;
                case 2:
                    agregarElementos(presupuesto);
                    break;
            }
        }while(op!=0);
    }

    private static void agregarElementos(Presupuesto presupuesto) {
        Scanner sc = new Scanner(System.in);
        Producto unProducto = new Producto("Banana","bananas",10.0);
        System.out.print("Ingrese la cantidad deseada: ");
        int cantidad = sc.nextInt();
        unProducto.setCantidad(cantidad);
        presupuesto.agregarItem(unProducto);

    }

    private static void crearPresupuesto(Presupuesto presupuesto) {


        List<Item> items = presupuesto.getItems();
        int indice = 0;
        Item unItem = items.get(indice);


        if(unItem instanceof Producto){
            Producto coso = (Producto) unItem;
            //hacer cosas de productos
            // coso.calcularTotal()
            presupuesto.reemplazarItem(indice, coso);
        }else{
            Servicio coso = (Servicio) unItem;
            // hacer cosas de servicios...
            presupuesto.reemplazarItem(indice, coso);
        }




        if(unItem.getClass().getSimpleName().equals("Producto")){
            // tengo un producto
        }else{
            // tengo un servicio
        }

    }
}
