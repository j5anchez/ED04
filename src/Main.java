// Clase Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Pedir la edad al usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad en años: ");
        int edad = scanner.nextInt();

        // Crear una instancia de Persona
        Persona persona = new Persona(edad);

        // Calcular y mostrar años hasta la jubilación
        persona.calcularAñosHastaJubilacion();
    }
}