/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorproblemadoss;
import problemados.EquivalenteHora;
/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora eq = new EquivalenteHora();
        EquivalenteHora eq2 = new EquivalenteHora();
        double h = 32;
        eq.establecerHora(h);
        if (h>=24) {
            eq.establecerDia();
            eq.establecerMinuto();
            eq.establecerSegundo();
        }else if(h>=1){
           eq.establecerMinuto(); 
           eq.establecerSegundo();
        }else if(h >= 0.1){
           eq.establecerSegundo();
        }
        
        
        
       
        System.out.printf("Numero de Horas Registradas: %.2f.\nNumero de Dias: %.2f.\n"
                + "Numero de Minutos: %.2f.\nNumero de Segundos: %.2f.",eq.obtenerHora()
                ,eq.obtenerDia(),eq.obtenerMinuto(),eq.obtenerSegundos());
        
        System.out.println("\n--------------------------\n");
        h = 8;
        eq2.establecerHora(h);
        if (h>=24) {
            eq2.establecerDia();
            eq2.establecerMinuto();
            eq2.establecerSegundo();
        }else if(h>=1){
           eq2.establecerMinuto(); 
           eq2.establecerSegundo();
        }else if(h >= 0.1){
           eq2.establecerSegundo();
        }
        
        
        
       
        System.out.printf("Numero de Horas Registradas: %.2f.\nNumero de Dias: %.2f.\n"
                + "Numero de Minutos: %.2f.\nNumero de Segundos: %.2f.",eq2.obtenerHora()
                ,eq2.obtenerDia(),eq2.obtenerMinuto(),eq2.obtenerSegundos());
    }
}
