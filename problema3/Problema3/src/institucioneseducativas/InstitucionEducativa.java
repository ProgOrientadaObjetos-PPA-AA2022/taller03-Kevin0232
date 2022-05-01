/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institucioneseducativas;

/**
 *
 * @author kevin
 */
public class InstitucionEducativa {
    
    private String nombre, tipoInstituto;
    private int numeroAlumnos,numeroDocentes, numeroSedes;
    private double gastosEstudiantes, presupuesto;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerTipoInstituto(String c){
        tipoInstituto = c;
    }
    public void establecerNumeroAlumnos(int c){
        numeroAlumnos = c;
    }
    public void establecerNumeroDocentes(int c){
        numeroDocentes = c;
    }
    public void establecerNumeroSedes(int c){
        numeroSedes = c;
    }
    public void establecerGastoEstudiante(double c){
        gastosEstudiantes = c;
    }
    public void establecerPresupuesto(){
        presupuesto = numeroAlumnos * gastosEstudiantes;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerTipoInstituto(){
        return tipoInstituto;
    }
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    public double obtenerGastoEstudiantes(){
        return gastosEstudiantes;
    }
    public double obtenerPresupuesto(){
        return presupuesto;
    }
    
}
