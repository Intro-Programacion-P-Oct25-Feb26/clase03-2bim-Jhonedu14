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
public class problema01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] nombresEstaciones = new String[5];
        String[] encargados = new String[5];
        double[][] produccion = new double[5][12];
        double[] totalProduccion = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese nombre de la estación");
            nombresEstaciones[i] = entrada.nextLine();

            System.out.println("Ingrese nombre del encargado:");
            encargados[i] = entrada.nextLine();

            for (int j = 0; j < 12; j++) {
                System.out.println("Producción del mes");
                produccion[i][j] = entrada.nextDouble();
                
            }
            }
        }
    }
    
            
