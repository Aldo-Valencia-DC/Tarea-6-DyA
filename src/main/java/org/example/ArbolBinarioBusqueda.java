package org.example;

public class ArbolBinarioBusqueda {
    Nodo raiz;
    public ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertar(Alumno alumno) {
        raiz = insertarRec(raiz, alumno);
    }

    private Nodo insertarRec(Nodo raiz, Alumno alumno) {
        if (raiz == null) {
            raiz = new Nodo(alumno);
            return raiz;
        }

        if (alumno.numero_cuenta < raiz.alumno.numero_cuenta) {
            raiz.izquierdo = insertarRec(raiz.izquierdo, alumno);
        } else if (alumno.numero_cuenta > raiz.alumno.numero_cuenta) {
            raiz.derecho = insertarRec(raiz.derecho, alumno);
        }

        return raiz;
    }

    public Alumno buscar(int numeroCuenta) {
        return buscarRec(raiz, numeroCuenta);
    }

    public void imprimirAlumnos() {
        imprimirAlumnosRec(raiz);
    }

    private void imprimirAlumnosRec(Nodo raiz) {
        if (raiz != null) {
            imprimirAlumnosRec(raiz.izquierdo);  // Visitar subárbol izquierdo
            System.out.println("Nombre: " + raiz.alumno.nombreCompleto + ", Numero de cuenta: "+raiz.alumno.numero_cuenta + ", Correo: " + raiz.alumno.correo + ", Promedio: " + raiz.alumno.promedio);
            imprimirAlumnosRec(raiz.derecho);    // Visitar subárbol derecho
        }
    }


    private Alumno buscarRec(Nodo raiz, int numeroCuenta) {
        if (raiz == null || raiz.alumno.numero_cuenta == numeroCuenta) {
            return raiz != null ? raiz.alumno : null;
        }

        if (numeroCuenta < raiz.alumno.numero_cuenta) {
            return buscarRec(raiz.izquierdo, numeroCuenta);
        } else {
            return buscarRec(raiz.derecho, numeroCuenta);
        }
    }
}
