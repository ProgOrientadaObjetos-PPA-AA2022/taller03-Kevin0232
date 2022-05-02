/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemados;

/**
 *
 * @author SALA I
 */
public class EquivalenteHora {
    private double hora;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerDia(){
        dias = (hora/24);
    }
    public void establecerHora(double c){
        hora = c;
    }
    public void establecerSegundo(){
        segundos = minutos *60;
    }
    public void establecerMinuto(){
        minutos = hora*60;
    }
    
    
    public double obtenerHora(){
        return hora;
    }
    public double obtenerDia(){
        return dias;
    }
    public double obtenerMinuto(){
        return minutos;
    }
    public double obtenerSegundos(){
        return segundos;
    }
}
