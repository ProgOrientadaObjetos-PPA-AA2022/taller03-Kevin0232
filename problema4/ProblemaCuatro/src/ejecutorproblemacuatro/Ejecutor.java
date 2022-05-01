/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutorproblemacuatro;
import problemacuatro.DispositivosElectronicos;
/**
 *
 * @author kevin
 */
public class Ejecutor {
    public static void main(String[] args) {
        DispositivosElectronicos de = new DispositivosElectronicos();
        DispositivosElectronicos de2 = new DispositivosElectronicos();
        
        de.establecerSistemaOperativo("Android");
        de.establecerTamanioPantalla(4.3);
        de.establecerCostoInicial(600.37);
        de.establecerIva(12);
        de.establecerIvaCosto();
        de.establecerCostoFinal();
        de.establecerDireccionMac("01:3A:1D:54:6B:32");
        de.establecerImei("583958603859235");
        
        System.out.printf("Sistema Operativo: %s.\nTamaño de la Pantalla: %.2f pulgadas.\n"
                + "Costo Inicial: %.2f.\nIva: %d.\nIva del Costo Inicial: %.2f.\n"
                + "CostoFinal:%.2f.\nDirección Mac: %s.\nInformación Imei: %s\n",
                de.obtenerSistemaOperativo(),de.obtenerTamanioPantalla(),de.obtenerCostoInicial(),
                de.obtenerIva(),de.obtenerIvaCosto(),de.obtenerCostoFinal(),
                de.obtenerDireccionMac(),de.obtenerImei());
        
        // Equipo 2
        System.out.println("------------------------");
        de2.establecerSistemaOperativo("MIUI");
        de2.establecerTamanioPantalla(5.6);
        de2.establecerCostoInicial(835.49);
        de2.establecerIva(14);
        de2.establecerIvaCosto();
        de2.establecerCostoFinal();
        de2.establecerDireccionMac("42:A4:3D:61:3D:43");
        de2.establecerImei("284757265094256");
        
        System.out.printf("\nSistema Operativo: %s.\nTamaño de la Pantalla: %.2f pulgadas.\n"
                + "Costo Inicial: %.2f.\nIva: %d.\nIva del Costo Inicial: %.2f.\n"
                + "CostoFinal:%.2f.\nDirección Mac: %s.\nInformación Imei: %s\n",
                de2.obtenerSistemaOperativo(),de2.obtenerTamanioPantalla(),de2.obtenerCostoInicial(),
                de2.obtenerIva(),de2.obtenerIvaCosto(),de2.obtenerCostoFinal(),
                de2.obtenerDireccionMac(),de2.obtenerImei());
        
    }
}
