package org.example;

public class Nodo {
    Alumno alumno;
    Nodo izquierdo, derecho;

    public Nodo(Alumno alumno) {
        this.alumno = alumno;
        izquierdo = derecho = null;
    }
}
