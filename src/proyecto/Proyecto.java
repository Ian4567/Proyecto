/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import objetos.Chic;
import objetos.Prendas;

/**
 *
 * @author DAW-11
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 4) {

            System.out.println("MENU DE OPERACIONES EN JAVA");
            System.out.println("1- Ejercicio 1");
            System.out.println("2- Ejercicio 2");
            System.out.println("3- Ejercicio 3");
            System.out.println("4- Salir");
            System.out.println("Elija una opción:……………");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3(sc);
                    break;
                case 4:
                    System.out.println("FIN DEL PROCESO");
                    break;
                default:
                    System.out.println("Respuesta no valida,introduce una del 1 al 4");
            }
        }

    }

    private static void ejercicio3(Scanner sc) {

        List<Prendas> prendas = new ArrayList<>();

        System.out.print("Introduce el numero de prendas a introducir: ");
        int numeroPrendas = sc.nextInt();

        for (int i = 0; i < numeroPrendas; i++) {

            System.out.print("Introduce el tipo de la prenda: ");
            String tipoPrenda = sc.next();
            System.out.print("Introduce la temporada de uso de la prenda: ");
            String temporada = sc.next();
            System.out.print("Introduce la referencia: ");
            String referencia = sc.next();
            System.out.print("Introduce el color: ");
            String color = sc.next();
            System.out.print("Introduce el PVP: ");
            double pvp = sc.nextDouble();

            Prendas prenda = new Prendas(tipoPrenda, temporada, referencia, color, pvp);
            prendas.add(prenda);

            System.out.println("Prenda creada correctamente.");
            prenda.mostrarPrendas();

            System.out.print("Introduce la cantidad para modificar el PVP: ");
            double cantidad = sc.nextDouble();
            System.out.print("¿Quieres incrementar o decrementar PVP? (incrementar/decrementar): ");
            String respuesta = sc.next();

            prenda.modificarPvp(cantidad, respuesta);
            System.out.println("PVP actualizado: " + prenda.getPvp());

            System.out.print("Introduce el tejido: ");
            String tejido = sc.next();
            System.out.print("Introduce la largura: ");
            double largura = sc.nextDouble();

            Chic chics = new Chic(tejido, largura, tipoPrenda, temporada, referencia, color, pvp);
            prendas.add(chics);

            chics.mostrarDatos();
            chics.modelo();

            System.out.print("Introduce la largura a modificar: ");
            double larguraModificar = sc.nextDouble();
            chics.setLargura(larguraModificar);
            System.out.print("Introduce el color a modificar: ");
            String colorModificar = sc.next();
            chics.setColor(colorModificar);

            chics.mostrarDatos();
            chics.modelo();
        }

    }

    private static void ejercicio2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ejercicio1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
