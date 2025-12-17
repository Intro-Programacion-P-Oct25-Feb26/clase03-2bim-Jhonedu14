/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[][] estaciones = new int[5][12];
        String[] nombres = new String[5];
        int[] produ = new int[5];

        int valor1 = 0;
        int mayor;
        String report = "";

        for (int fila = 0; fila < estaciones.length; fila++) {

            System.out.printf("Ingrese el nombre de la estacion %s:\n", fila + 1);
            nombres[fila] = entrada.nextLine();

            int suma = 0;

            for (int col = 0; col < estaciones[fila].length; col++) {
                System.out.printf("Ingrese la produccion del mes %s:\n", col + 1);
                estaciones[fila][col] = entrada.nextInt();
                suma = suma + estaciones[fila][col];
            }
            entrada.nextLine();
            produ[fila] = suma;
        }

        mayor = produ[0];
        valor1 = 0;

        for (int fila = 1; fila < produ.length; fila++) {
            if (produ[fila] > mayor) {
                mayor = produ[fila];
                valor1 = fila;
            }
        }

        double valorprodu = produ.length;
        for (int fila = 0; fila < valorprodu; fila++) {
            report = String.format(
                    "%s%sEstacion   - Total Produccion: $%s\n",
                    report,
                    nombres[fila],
                    produ[fila]
            );
        }

        report = String.format(
                "%sEstacion mas productiva: Estacion %s\n"
                + "Encargado de la estacion: %s\n"
                + "Cantidad de la estacion mas productiva: $%s\n",
                report,
                valor1 + 1,
                nombres[valor1],
                produ[valor1]
        );
        System.out.println(report);
    }
}
