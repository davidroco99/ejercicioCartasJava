
package JuegoDeCartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author David Roco
 */
public class MazoDeCartas {
    private ArrayList baraja = new ArrayList();
    private ArrayList monton = new ArrayList();
    
    public MazoDeCartas() {
      
    }
    
    public void crearCartas(){
        for(int j=1;j<5;j++){   
            for(int i=1;i<8;i++){
                //System.out.println(i); 
                switch (j) { 
                    case 1 -> {
                        //System.out.println("El Palo de la carta es espada");
                        Carta carta = new Carta(i,"espadas");                 
                        baraja.add(carta);
                        break;
                    }
                    case 2 -> {
                        //System.out.println("El Palo de la carta es bastos"); 
                        Carta carta1 = new Carta(i,"bastos");
                        this.baraja.add(carta1);
                    }
                    case 3 -> {
                        //System.out.println("El Palo de la carta es oros"); 
                        Carta carta2 = new Carta(i,"oros");
                        this.baraja.add(carta2);
                    }
                     case 4 -> {
                         //System.out.println("El Palo de la carta es copas"); 
                         Carta carta3 = new Carta(i,"copas");
                         this.baraja.add(carta3);
                    }
                      default -> {
                    }
                }
            }
            for(int i=10;i<13;i++){
                //System.out.println(i); 
                switch (j) { 
                    case 1 -> {
                        //System.out.println("El Palo de la carta es espada");
                        Carta carta = new Carta(i,"espadas");                 
                        baraja.add(carta);
                        break;
                    }
                    case 2 -> {
                        //System.out.println("El Palo de la carta es bastos"); 
                        Carta carta1 = new Carta(i,"bastos");
                        this.baraja.add(carta1);
                    }
                    case 3 -> {
                        //System.out.println("El Palo de la carta es oros"); 
                        Carta carta2 = new Carta(i,"oros");
                        this.baraja.add(carta2);
                    }
                     case 4 -> {
                         //System.out.println("El Palo de la carta es copas"); 
                         Carta carta3 = new Carta(i,"copas");
                         this.baraja.add(carta3);
                    }
                      default -> {
                    }
                }
            }
        }
    }
    
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public void barajar(){
        Collections.shuffle(this.baraja); 
    }
    
    public void mostrarBaraja(){
        if (this.baraja.isEmpty()){
            System.out.println("No hay más carta en la baraja");
        }else{
            for (Iterator it = this.baraja.iterator(); it.hasNext();) {
                Carta carta = (Carta) it.next();
                //System.out.println(carta);
                System.out.println("numero: "+carta.getNumero()+", palo: "+carta.getPalo());
            }
        }
        
    }
    public void mostrarMonton(){
        if (this.monton.isEmpty()){
            System.out.println("No hay jugadas cartas jugadas en la Monton");
        }else{
            for (Iterator it = this.monton.iterator(); it.hasNext();) {
                Carta carta = (Carta) it.next();
                //System.out.println(carta);
                System.out.println("numero: "+carta.getNumero()+", palo: "+carta.getPalo());
            }
        }
        
    }
    
    public int cartasDisponibles(){
        return this.baraja.size();
    }
    
    public int cartasJugadas(){
        return this.monton.size();
    }
    
    public Carta sacarCartaBaraja(){
        if (this.baraja.isEmpty()){
            System.out.println("No hay jugadas cartas jugadas en la baraja");
            Carta carta = new Carta(0,"FinHayMasCartas");
            return carta;
        }else{
            Carta carta = new Carta();
            carta = (Carta) this.baraja.get(0);
            System.out.println("numero: "+carta.getNumero()+", palo: "+carta.getPalo());
            this.baraja.remove(carta);
            this.monton.add(carta);
            return carta;
        }        
    }
    
    public ArrayList<Carta> repartirCartaBaraja(int n){
        ArrayList<Carta> listaCartas = new ArrayList();
        if (n>this.baraja.size()){
            System.out.println("No hay esa cantidad de cartas");
        }
        else{            
            for(int i=0;i<n;i++){
                Carta carta = new Carta();
                carta = (Carta) this.baraja.get(0);
                System.out.println("numero: "+carta.getNumero()+", palo: "+carta.getPalo());
                this.baraja.remove(carta);
                this.monton.add(carta);
                listaCartas.add(carta);
                }         
        }   
        return listaCartas;
    }
    
    public void devolverCartaaLaBaraja(Carta carta){
        this.baraja.add(carta);
        this.monton.remove(carta);
    }
    
    public Carta cambiarCartaBaraja(Carta cartaCambio){
        if (this.baraja.isEmpty()){
            System.out.println("No hay jugadas cartas jugadas en la baraja");
            Carta carta = new Carta(0,"FinHayMasCartas");
            return carta;
        }else{
            Carta carta = new Carta();
            carta = (Carta) this.baraja.get(0);
            System.out.println("numero: "+carta.getNumero()+", palo: "+carta.getPalo());
            this.baraja.remove(carta);
            this.monton.add(carta);
            this.baraja.add(cartaCambio);
            return carta;
        }        
    }
    
}
