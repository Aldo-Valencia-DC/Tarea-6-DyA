package org.example;

import java.util.List;

public class Alumno {
    int numero_cuenta;
    int edad;
    int semestre;
    double promedio;
    String nombreCompleto;
    String correo;
    List<String> materias;

    public Alumno(int numero_cuenta, int edad, int semestre, String nombreCompleto, String correo, List<String> materias, double promedio) {
        this.numero_cuenta = numero_cuenta;
        this.edad = edad;
        this.semestre = semestre;
        this.nombreCompleto = nombreCompleto;
        this.correo = correo;
        this.materias = materias;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                ", nombre='" + nombreCompleto + '\'' +
                ", materias=" + materias +
                ", promedio=" + promedio +
                '}';
    }
}
