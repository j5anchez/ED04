import java.util.Scanner;

/**
 * La clase Main es el punto de entrada para el programa que calcula los años que le quedan al usuario para jubilarse.
 * <p>
 * Este programa solicita al usuario su edad actual y, basándose en esa información,
 * calcula cuántos años le quedan hasta la edad de jubilación establecida en 67 años.
 * </p>
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Main {
    /**
     * Constructor predeterminado de la clase Main.
     * No se utiliza en este programa.
     */
    public Main() {
        // Este constructor predeterminado no se utiliza en el programa actual.
    }

    /**
     * Punto de entrada principal del programa.
     * 
     * @param args Argumentos pasados por línea de comandos. No se utiliza en este programa.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad en años: ");
        int edad = scanner.nextInt();

        Persona persona = new Persona(edad);
        persona.calcularAñosHastaJubilacion();
    }
}
