/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;



import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;

import java.util.Scanner;
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
                    ejercicio3();
                    break;
                case 4:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Respuesta no valida,introduce una del 1 al 4");
            }
        }

    }

    private static void ejercicio3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ejercicio2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        List<Double> preciosFinales = new ArrayList<>();
        boolean seguir = true;

        try {
            System.out.println("Ingrese el porcentaje de IVA a aplicar:");
            double iva = sc.nextDouble();

            while (seguir) {
                System.out.println("Ingrese el número de paquetes:");
                int nPaquetes = sc.nextInt();

                System.out.println("Ingrese la tarifa básica para el envío:");
                double tarifaBasica = sc.nextDouble();

                System.out.println("Ingrese el tipo de envío (0, 1, 2, otros para 0€):");
                int tipoEnvio = sc.nextInt();

                System.out.println("Ingrese el día de la semana (lunes a domingo):");
                String diaSemana = sc.next().toLowerCase();

                double precioFinal = calcularPrecioFinal(tarifaBasica, tipoEnvio, diaSemana, iva) * nPaquetes;
                preciosFinales.add(precioFinal);

                System.out.println("Precio final para este envío: " + precioFinal + "€");
                System.out.println("¿Desea agregar otro envío? (s/n)");
                String respuesta = sc.next().toLowerCase();
                if (!respuesta.equals("s")) {
                    seguir = false;
                }
            }

            Collections.sort(preciosFinales, Collections.reverseOrder());
            System.out.println("Precios finales de los envíos (en orden descendente):");
            for (double precio : preciosFinales) {
                System.out.println(precio + "€");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ha introducido datos sin el formato adecuado o fuera de rango.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
    }

    private static double calcularPrecioFinal(double tarifaBasica, int tipoEnvio, String diaSemana, double iva) {
        double recargoEnvio = 0;

        switch (tipoEnvio) {
            case 0:
                recargoEnvio = 1.85;
                break;
            case 1:
                recargoEnvio = 3.05;
                break;
            case 2:
                recargoEnvio = 6.01;
                break;
            default:
                recargoEnvio = 0;
        }

        double recargoDia = obtenerRecargoPorDia(diaSemana, tarifaBasica);
        double precioSinIva = tarifaBasica + recargoEnvio + recargoDia;
        double precioFinalConIva = precioSinIva + (precioSinIva * (iva / 100));

        return Math.round(precioFinalConIva * 100.0) / 100.0;
    }

    private static double obtenerRecargoPorDia(String diaSemana, double tarifaBasica) {
        switch (diaSemana) {
            case "viernes":
                return tarifaBasica * 0.10;
            case "sabado":
                return tarifaBasica * 0.15;
            case "domingo":
                return tarifaBasica * 0.20;
            default:
                return 0;
        }
    }

    }

