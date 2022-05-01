/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problemacuatro;

/**
 *
 * @author kevin
 */
public class DispositivosElectronicos {
    private String sistemaOperativo,direccionMac,imei;
    private double costoInicial,ivaCosto,costoFinal,tamanioPantalla;
    private int iva;
    
    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    public void establecerCostoFinal(){
        costoFinal = costoInicial + ivaCosto;
    }
    public void establecerIvaCosto(){
        ivaCosto = (costoInicial *iva)/100;
    }
    public void establecerTamanioPantalla(double c){
        tamanioPantalla = c;
    }
    public void establecerIva(int c){
        iva = c;
    }
    public void establecerImei(String c){
        imei = c;
    }
    
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    public double obtenerCostoFinal(){
        return costoFinal ;
    }
    public double obtenerIvaCosto(){
        return ivaCosto ;
    }
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    public int obtenerIva(){
        return iva;
    }
    public String obtenerImei(){
        return imei;
    }
    
}
