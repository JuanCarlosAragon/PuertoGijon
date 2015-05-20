import java.util.ArrayList;
import java.util.Iterator;

public class Puerto
{
   private ArrayList<Amarre> amarres;
   
   /**
    * Constructor de la clase Puerto, inicializa sus atributos generando los amarres que debe tener el puerto según su parametro de entrada
    * 
    * @param numeroDeAmarres La cantidad de amarres que tiene el puerto
    */
   public Puerto(int numeroDeAmarres){
       amarres = new ArrayList<>();
       for(int i = 0; i<numeroDeAmarres ; i++){
           amarres.add(new Amarre(i+1));
        }
    }
    
    /**
     * Alquila un ammarre
     * 
     * @param cliente el cliente que lo alquila
     * @param barco el Barco que va a amarrar
     * @param numeroDeDias La cantidad de dias que va a estar el barco amarrado
     */
   public void alquilar(Cliente cliente, Barco barco, int numeroDeDias){
       Iterator<Amarre> it = amarres.iterator();
       
       boolean continuar = true;
       while(it.hasNext() && continuar){
           Amarre search = it.next();
           if(search.disponible()){
               continuar = false;
               search.ocupar(new Alquiler(cliente, barco, numeroDeDias));
            }
        }
       if (continuar){
           System.out.println("No hay amarres libres");
        }
    }
    
    /**
     * Comprueba si hay Amarres libres
     * 
     * @return true si los hay, false si no los hay
     */
   public boolean hayAmarresLibres(){
       Iterator<Amarre> it = amarres.iterator();
       boolean haberlosHaylos = false;
       while(it.hasNext() && !haberlosHaylos){
           if(it.next().disponible()){
               haberlosHaylos = true;
            }
        }
       return haberlosHaylos;
    }
   
    /**
     * Muestra el dinero recaudado por un amarre y lo deja disponible para volverlo a alquilar
     * 
     * @param numeroDeAmarre el número de amarre que se va a liquidar
     */
   public void liquidarAmarre(int numeroDeAmarre){
       try{
           System.out.println("Precio del amarre: " + amarres.get(numeroDeAmarre - 1).precioAlquilerActual());
           amarres.get(numeroDeAmarre - 1).desocupar();
        }
       catch(Exception ex){
           System.out.println("El numero de amarre es incorrecto");
        }
    }
    
    /**
     * Muestra cuantos amarres disponibles hay en el puerto y la información de cada uno de los amarres
     */
   public void mostrarEstado(){
       System.out.println("Hay " + amarres.size() + " Amarres");
      
       for(Amarre amarre : amarres){
           System.out.println(amarre.toString());
        }
    }
}
