package introduccion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<String> estudiantes = new ArrayList<>();
    static List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al sistema de gestión de estudiantes.");

        while (true) {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Mostrar lista de estudiantes");
            System.out.println("3. Calcular promedio de calificaciones");
            System.out.println("4. Mostrar estudiante con la calificación más alta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = leerEntero(scanner, "Selecciona una opción: "); //Aqui va la validacion con trycatch.
            System.out.println();

            // switch para llamar los métodos.
            switch (opcion) {
            case 1: agregarEstudiante(scanner);
            break;
            case 2: mostrarEstudiantes();  
            break;
            case 3: calcularPromedio();
            break;
            case 4: mostrarEstudianteConMayorNota();
            break;
            case 5: System.out.println("Saliendo del sistema...");
            return;
            default: System.out.println("Opción no válida. Intente de nuevo.");
            break; 
            }
        }
    }
    
  //Metodo de validacion para que unicamente haya numeros enteros  
    public static int leerEntero(Scanner scanner, String mensaje) { 
        int numero;

        while (true) {
            System.out.print(mensaje);
            try {
                numero = scanner.nextInt();
                scanner.nextLine(); 
                return numero;
            } catch (Exception e) {
                System.out.println("Error: debes ingresar un número entero.");
                scanner.nextLine(); 
        }
    }
}
    
    // Método para validar que el nombre solo tenga letras
    public static String leerNombre(Scanner scanner, String mensaje) {
        String nombre;
        while (true) {
            System.out.print(mensaje);
            nombre = scanner.nextLine().trim();
            
            // Esta expresión regular verifica que solo haya letras (incluyendo tildes/ñ) y espacios
            if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
                return nombre;
            } else {
                System.out.println("Error: El nombre solo debe contener letras. Intente de nuevo.");
            }
        }
    }

    // Método para validar la calificación (de 0 a 100)
    public static double leerCalificacion(Scanner scanner, String mensaje) {
        double calificacion;
        while (true) {
            System.out.print(mensaje);
            try {
                calificacion = Double.parseDouble(scanner.nextLine());
                
                if (calificacion >= 0 && calificacion <= 100) {
                    return calificacion;
                } else {
                    System.out.println("Error: La calificación debe estar entre 0 y 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Debes ingresar un número válido (ej. 85.5).");
            }
        }
    }
    
    // Método para la opción 1 del menú.
    public static void agregarEstudiante(Scanner scanner) {
    	String nombre = leerNombre(scanner, "Ingrese el nombre del estudiante: ");
        double calificacion = leerCalificacion(scanner, "Ingrese la calificación del estudiante (0-100): ");
        
        estudiantes.add(nombre);
        calificaciones.add(calificacion);

        System.out.println("Estudiante agregado correctamente.");
    }
    
    // Método para la opción 2 del menú.
    public static void mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de estudiantes:");
            for (int i = 0; i < estudiantes.size(); i++) {
                System.out.println(estudiantes.get(i) +
                        " - Calificación: " + calificaciones.get(i));
            }
        }
    }
    
	// Método para la opción 3
	public static void calcularPromedio() {
	    if (calificaciones.isEmpty()) {
	        System.out.println("No hay calificaciones registradas.");
	    } else {
	        double suma = 0;
	
	        for (double calificacion : calificaciones) {
	            suma += calificacion;
	        }
	        
	        double promedio = suma / calificaciones.size();
	        System.out.println("El promedio de calificaciones es: " + promedio);
	    }
	}
	
	// Método para la opción 4
	public static void mostrarEstudianteConMayorNota() {
	    if (calificaciones.isEmpty()) {
	        System.out.println("No hay calificaciones registradas.");
	    } else {
	
	        double maxCalificacion = calificaciones.get(0);
	        String estudianteMax = estudiantes.get(0);
	
	        for (int i = 1; i < calificaciones.size(); i++) {
	            if (calificaciones.get(i) > maxCalificacion) {
	                maxCalificacion = calificaciones.get(i);
	                estudianteMax = estudiantes.get(i);
	            }
	        }
	
	        System.out.println("El estudiante con la calificación más alta es: "
	                + estudianteMax + " con " + maxCalificacion);
	    	}
		}
	}

