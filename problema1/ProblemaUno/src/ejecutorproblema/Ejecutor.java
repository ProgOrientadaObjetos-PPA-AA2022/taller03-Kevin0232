/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorproblema;
import problemauno.Terreno;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
    Terreno t = new Terreno();
    Terreno t2 = new Terreno();
    
        System.out.println("Terreno 1");
    t.establecerAncho(30.2);
    t.establecerValorMetroCuadrado(6.54);
    t.establecerLargo(50.56);
    t.establecerArea();
    t.establecerCosto_Terreno();
    
    System.out.printf("\nAncho: %.2f. \nLargo del terreno: %.2f.\nArea: %.2f.\n"
            + "Valor por metro cuadrado: %.2f.\nCosto del Terreno: %.2f.\n",t.obtenerAncho()
            ,t.obtenerLargo(),t.obtenerArea(),t.obtenerValorMetroCuadrado(),t.obtenerCosto_Terreno());
    
        System.out.println("--------------------------------------\nTerreno 2");
    t2.establecerAncho(40.2);
    t2.establecerValorMetroCuadrado(8.54);
    t2.establecerLargo(70.56);
    t2.establecerArea();
    t2.establecerCosto_Terreno();
    
    System.out.printf("\nAncho: %.2f. \nLargo del terreno: %.2f.\nArea: %.2f.\n"
            + "Valor por metro cuadrado: %.2f.\nCosto del Terreno: %.2f.",t.obtenerAncho()
            ,t.obtenerLargo(),t.obtenerArea(),t.obtenerValorMetroCuadrado(),t.obtenerCosto_Terreno());
   
    }
}
