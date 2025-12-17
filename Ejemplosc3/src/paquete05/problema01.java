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

        String[] nombresEstaciones = new String[5];
        String[] encargados = new String[5];
        double[][] produccion = new double[5][12];
        double[] totalProduccion = {1000, 3000, 1200, 1300, 2400};

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de la estacion " + (i + 1) +":");
            nombresEstaciones[i] = entrada.nextLine();

            System.out.println("Ingrese nombre del encargado por favor:");
            encargados[i] = entrada.nextLine();

            for (int j = 0; j < 12; j++) {
                System.out.println("Produccion del mes " + (j + 1) + ":");
                produccion[i][j] = entrada.nextDouble();
            }
            entrada.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            totalProduccion[i] = 0;
            for (int j = 0; j < 12; j++) {
                totalProduccion[i] = totalProduccion[i] + produccion[i][j];
            }
        }
        
        double valor1 = totalProduccion[0];
        int indiceM = 0;

        for (int i = 1; i < 5; i++) {
            if (totalProduccion[i] > valor1) {
                valor1 = totalProduccion[i];
                  i= indiceM;
        

        }
        }
        }
    }
    
            
