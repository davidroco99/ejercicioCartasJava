
package JuegoDeCartas;
import java.util.ArrayList;
/**
 *
 * @author David Roco
 */
public class JuegoDeCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El mazo de cartas es:");
        MazoDeCartas cartasEspañolas = new MazoDeCartas();
        cartasEspañolas.crearCartas();
        //cartasEspañolas.getBaraja().forEach((baraja)->{System.out.println("numero: "+baraja.getNumero()+", palo: "+baraja.getPalo());});
        cartasEspañolas.mostrarBaraja();
        System.out.println("=========================================================");
        cartasEspañolas.barajar();
        cartasEspañolas.mostrarBaraja();
        //cartasEspañolas.getBaraja().forEach((baraja)->{System.out.println("numero: "+baraja.getNumero()+", palo: "+baraja.getPalo());});
        System.out.println("=========================================================");
        Carta cartaJugada = new Carta();
        cartaJugada = cartasEspañolas.sacarCartaBaraja();
        System.out.println("La carta sacada de la Baraja es: "+cartaJugada.getNumero()+", "+cartaJugada.getPalo());
        System.out.println("=========================================================");
            
        System.out.println("Las cartas del monton son: ");
        cartasEspañolas.mostrarMonton();
        System.out.println("=========================================================");
        
        System.out.println("-----------------------------------------");
        System.out.println("Las cartas de la baraja son: ");
        cartasEspañolas.mostrarBaraja();
        System.out.println("-----------------------------------------");
        System.out.println("=========================================================");
        System.out.println("La cantidad de cartas en la baraja son: "+cartasEspañolas.cartasDisponibles());
        System.out.println("La cantidad de cartas jugadas son: "+cartasEspañolas.cartasJugadas());
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("-----------------------------------------");
        System.out.println("=========================================================");
        cartasEspañolas.repartirCartaBaraja(10);
        
        System.out.println("Las cartas del monton son: ");
        cartasEspañolas.mostrarMonton();
        System.out.println("-----------------------------------------");
        System.out.println("Las cartas de la baraja son: ");
        cartasEspañolas.mostrarBaraja();
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de cartas en la baraja son: "+cartasEspañolas.cartasDisponibles());
        System.out.println("La cantidad de cartas jugadas son: "+cartasEspañolas.cartasJugadas());
        System.out.println("=========================================================");
        System.out.println("=========================================================");
        
        System.out.println("Sacamos más de los cartas de la baraja");
        cartasEspañolas.repartirCartaBaraja(29);
        System.out.println("=========================================================");
        System.out.println("Las cartas del monton son: ");
        cartasEspañolas.mostrarMonton();
        System.out.println("-----------------------------------------");
        System.out.println("Las cartas de la baraja son: ");
        cartasEspañolas.mostrarBaraja();
        System.out.println("-----------------------------------------");
        System.out.println("La cantidad de cartas en la baraja son: "+cartasEspañolas.cartasDisponibles());
        System.out.println("La cantidad de cartas jugadas son: "+cartasEspañolas.cartasJugadas());
        
    }
    
}
