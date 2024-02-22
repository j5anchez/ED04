/**
 * La clase Persona representa a una persona con una edad actual y proporciona la funcionalidad para calcular los años que le quedan hasta alcanzar la edad de jubilación.
 * <p>
 * La edad de jubilación se ha establecido en 67 años. El método {@code calcularAñosHastaJubilacion} calcula los años restantes hasta alcanzar esta edad y muestra un mensaje adecuado según la cantidad de años restantes.
 * </p>
 * 
 * @author TuNombre
 * @version 1.0
 */
public class Persona {
    /**
     * Edad actual de la persona en años.
     */
    private int edadActual;

    /**
     * Constructor para crear una instancia de Persona con la edad actual especificada.
     * 
     * @param edadActual La edad actual de la persona.
     */
    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    /**
     * Calcula los años que le quedan a la persona hasta jubilarse y muestra un mensaje por consola.
     * <p>
     * Si a la persona le quedan menos de 10 años para jubilarse, muestra un mensaje de aliento.
     * Si le quedan más de 20 años, muestra un mensaje motivacional para continuar trabajando.
     * En otros casos, simplemente informa los años restantes.
     * </p>
     */
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
