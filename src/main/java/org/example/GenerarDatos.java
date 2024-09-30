package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GenerarDatos {
    static Random random = new Random();

    static String[] nombres = {"Juan", "Maria", "Pedro", "Ana", "Luis", "Sofia", "Carlos", "Valentina", "Jose", "Camila",
            "Diego", "Fernanda", "Jorge", "Daniela", "Roberto", "Lucia", "Francisco", "Gabriela", "Miguel", "Paola",
            "Raúl", "Carolina", "Enrique", "Alejandra", "Ricardo", "Patricia", "Javier", "Andrea", "Manuel", "Laura",
            "Arturo", "Adriana", "Eduardo", "Monica", "Antonio", "Veronica", "Felipe", "Rosa", "Sergio", "Julia",
            "Guillermo", "Margarita", "Andres", "Elena", "Fernando", "Natalia", "Alvaro", "Cecilia", "Ivan", "Claudia",
            "Oscar", "Lorena", "Hugo", "Teresa", "Martin", "Isabel", "Julio", "Araceli", "Angel", "Yolanda",
            "Víctor", "Susana", "Salvador", "Esther", "Mario", "Alicia", "Alberto", "Regina", "Cesar", "Olga",
            "Ramon", "Martha", "Fabian", "Beatriz", "Gonzalo", "Lilia", "Mauricio", "Guadalupe", "Esteban", "Lourdes",
            "Hector", "Silvia", "Cristian", "Elvira", "Leonardo", "Carmen", "Rodrigo", "Sara", "Ruben", "Rocío",
            "Tomas", "Aaron", "Alejandro", "Claudia", "Adrian", "Esperanza", "Marcelo", "Gloria", "Ezequiel", "Patricia"};
    static String[] apellidos = {"Perez", "Gonzalez", "Rodriguez", "Hernandez", "Lopez", "García", "Martinez", "Sanchez", "Ramirez", "Flores",
            "Jimenez", "Morales", "Cruz", "Reyes", "Castillo", "Torres", "Gomez", "Rivera", "Diaz", "Mendez",
            "Romero", "Serrano", "Rios", "Medina", "Paredes", "Vargas", "Aguirre", "Ortega", "Navarro", "Salazar",
            "Muñoz", "Suarez", "Montes", "Marquez", "Ponce", "Valenzuela", "Dominguez", "Valencia", "Espinoza", "Estrada",
            "Peña", "Castro", "Soto", "Correa", "Bautista", "Rojas", "Delgado", "Pineda", "Carrillo", "Orozco"};
    static String[] materias = {"Algebra", "Computadoras y Programacion", "Calculo diferencial e integral", "Geometria Analitica", "Introduccion a la Ing. en Comp.", "Algebra Lineal", "Calculo Vectorial",
    "Programacion Orientada a Objetos", "Comunicacon", "Emprendimiento 1", "Taller de Creatividad", "Electricicdad y Magnetismo", "Estructura de Datos", "Metodos Numericos", "Ecuaciones Diferenciales",
    "Emprendimiento 2", "Probabilidad y Estadistica", "Bases de datos 1", "Emprendimiento 3","Matematicas Discretas", "Dispositivos Electronicos", "Lenguajes Formales Automatas", "Diseño y Analisis de Algoritmos",
    "Administracion de Proyectos", "Programacion Web", "Diseño Logico", "Compiladores", "Sistemas Operativos", "Diseño de Sistemas Digitales", "Ingenieria de Software", "Sistemas de Informacion", "Programacion Web 2",
    "Redes y Computadoras 1", "Microprocesadores y Microcontroladores", "Bases de Datos 2", "Programacion Movil 1", "Redes y Computadoras 2", "Habilidades directas", "Inteligencia Artificial", "Seguridad Informatica", "Mineria de Datos"};

    public static Alumno generarAlumno() {
        int numero_cuenta = 300000000 + random.nextInt(450000000);
        String nombre = nombres[random.nextInt(nombres.length)] + " " + apellidos[random.nextInt(apellidos.length)];
        int edad = 18 + random.nextInt(25);
        String correo = nombre.replaceAll(" ", "").toLowerCase() + "@unam.mx";
        int semestre = 1 + random.nextInt(9);
        List<String> materiasCursando = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            materiasCursando.add(materias[random.nextInt(materias.length)]);
        }

        double promedio = 5.0 + random.nextDouble() * 5.0;

        return new Alumno(numero_cuenta, edad, semestre, nombre, correo, materiasCursando, Math.round(promedio * 100.0) / 100.0);
    }

    public static List<Alumno> generarAlumnos(int cantidad) {
        List<Alumno> alumnos = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            alumnos.add(generarAlumno());
        }
        return alumnos;
    }
}
