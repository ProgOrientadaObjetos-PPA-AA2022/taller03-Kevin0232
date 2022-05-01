/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problematres;
import institucioneseducativas.InstitucionEducativa;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        
        InstitucionEducativa id = new InstitucionEducativa();
        InstitucionEducativa id2 = new InstitucionEducativa();
        
        // asignación de variables
        String nombre = "Bernardo Valdiviezo";
        String tInstituto = "Publico";
        int e = 600;
        int d = 260;
        int nS = 1;
        double gE= 35;
        //Agregar datos
        id.establecerNombre(nombre);
        id.establecerTipoInstituto(tInstituto);
        id.establecerNumeroDocentes(d);
        id.establecerNumeroSedes(nS);
        id.establecerNumeroAlumnos(e);
        id.establecerGastoEstudiante(gE);
        id.establecerPresupuesto();
        
        System.out.printf("\nNombre de la Institución: %s.\nTipo de Instituto: %s."
                + "\nNúmero de Docentes: %d.\nNúmero de Alumnos: %d.\nNúmero de Sedes: %d.\n"
                + "Gastos proyectados por el estudiante: %.2f.\nPresupuesto: %.2f.\n",
                id.obtenerNombre(),id.obtenerTipoInstituto(),id.obtenerNumeroDocentes()
                ,id.obtenerNumeroAlumnos(),id.obtenerNumeroSedes(),id.obtenerGastoEstudiantes()
                ,id.obtenerPresupuesto());
        
        // Utilizando objeto 2
        System.out.println("-------------------------");
        
        // asignación de variables
        nombre = "La Salle";
        tInstituto = "Privado";
        e = 800;
        d = 340;
        nS = 6;
        gE= 90;
        //Agregar datos
        id2.establecerNombre(nombre);
        id2.establecerTipoInstituto(tInstituto);
        id2.establecerNumeroDocentes(d);
        id2.establecerNumeroSedes(nS);
        id2.establecerNumeroAlumnos(e);
        id2.establecerGastoEstudiante(gE);
        id2.establecerPresupuesto();
        
        System.out.printf("Nombre de la Institución: %s.\nTipo de Instituto: %s."
                + "\nNúmero de Docentes: %d.\nNúmero de Alumnos: %d.\nNúmero de Sedes: %d.\n"
                + "Gastos proyectados por el estudiante: %.2f.\nPresupuesto: %.2f.\n",
                id2.obtenerNombre(),id2.obtenerTipoInstituto(),id2.obtenerNumeroDocentes()
                ,id2.obtenerNumeroAlumnos(),id2.obtenerNumeroSedes(),id2.obtenerGastoEstudiantes()
                ,id2.obtenerPresupuesto());
        
    }
}
