package org.example;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        List<Alumno> alumnos = GenerarDatos.generarAlumnos(100);

        for (Alumno alumno : alumnos) {
            arbol.insertar(alumno);
        }

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Insertar nuevo alumno");
            System.out.println("2. Consultar alumno por número de cuenta");
            System.out.println("3. Imprimir nombres, numero de cuenta, correos y promedios de los alumnos");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Solicitar datos para nuevo alumno
                    System.out.println("Ingrese el número de cuenta:");
                    int numeroCuenta = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea

                    System.out.println("Ingrese el nombre completo:");
                    String nombreCompleto = scanner.nextLine();

                    System.out.println("Ingrese la edad:");
                    int edad = scanner.nextInt();

                    System.out.println("Ingrese el correo electrónico:");
                    String correo = scanner.next();

                    System.out.println("Ingrese el semestre:");
                    int semestre = scanner.nextInt();

                    System.out.println("Ingrese las cinco materias (separadas por comas):");
                    scanner.nextLine(); // Consumir la nueva línea
                    String materiasInput = scanner.nextLine();
                    List<String> materias = Arrays.asList(materiasInput.split(","));

                    System.out.println("Ingrese el promedio general:");
                    double promedio = scanner.nextDouble();

                    Alumno nuevoAlumno = new Alumno(numeroCuenta, edad, semestre,nombreCompleto, correo,materias, promedio);
                    arbol.insertar(nuevoAlumno);
                    System.out.println("Alumno insertado con éxito.");
                    break;

                case 2:
                    // Buscar alumno por número de cuenta
                    System.out.println("Ingrese el número de cuenta:");
                    int cuenta = scanner.nextInt();
                    Alumno alumnoEncontrado = arbol.buscar(cuenta);

                    if (alumnoEncontrado != null) {
                        System.out.println(alumnoEncontrado);
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("\nLista de alumnos:");
                    arbol.imprimirAlumnos();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);


    }
}