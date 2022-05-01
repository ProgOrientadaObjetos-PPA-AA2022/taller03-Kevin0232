/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import paquete001.FacturaTelefono;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        // Crear un objeto de tipo FacturaTelefono
        FacturaTelefono telefono = new FacturaTelefono();
        
        telefono.establecerNumeroTelefono(telefono.obtenerNumeroTelefono());
        telefono.establecerMinutosMes(0.20);
        telefono.establecerValorMinuto(telefono.obtenerValorMinuto());
        
        
        telefono.calcularValorFactura();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Factura de Teléfono\n\nNúmero de teléfono: %s\n"
                + "\tMinutos mensuales: %.2f\nValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
}
