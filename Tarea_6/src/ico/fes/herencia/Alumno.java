/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.herencia;

/**
 *
 * @author Ninja
 */
public class Alumno extends Persona{
    private String numeroCuenta;
    private String Carrera;
    private int semestre;

    public Alumno() {
    }

    public Alumno(String numeroCuenta, String Carrera, int semestre, String nombre, int edad, int genero, float altura) {
        super(nombre, edad, genero, altura);
        this.numeroCuenta = numeroCuenta;
        this.Carrera = Carrera;
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "numeroCuenta=" + numeroCuenta + ", Carrera=" + Carrera + ", semestre=" + semestre + '}';
    }
    
    
}
