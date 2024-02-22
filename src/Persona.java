// Clase Persona.java
public class Persona {
    // Atributos
    private int edadActual;

    // Constructor
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    // Método para calcular años hasta la jubilación
    public void calcularAñosHastaJubilacion() {
        int annosRestantes = 67 - edadActual;

        if (annosRestantes < 10) {
            System.out.println("Sólo te quedan " + annosRestantes + " años. ¡Vamos que ya queda poco!");
        } else if (annosRestantes > 20) {
            System.out.println("Te quedan " + annosRestantes + " años. ¡A seguir trabajando gandul!");
        } else {
            System.out.println("Te quedan " + annosRestantes + " años hasta la jubilación.");
        }
    }
}