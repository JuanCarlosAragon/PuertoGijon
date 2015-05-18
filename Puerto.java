import java.util.ArrayList;
import java.util.Iterator;

public class Puerto
{
   private ArrayList<Amarre> amarres;
   
   public Puerto(int numeroDeAmarres){
       amarres = new ArrayList<>();
       for(int i = 0; i<numeroDeAmarres ; i++){
           amarres.add(new Amarre(i+1));
        }
    }
    
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
   
   public void liquidarAmarre(int numeroDeAmarre){
       try{
           System.out.println("Precio del amarre: " + amarres.get(numeroDeAmarre - 1).precioAlquilerActual());
           amarres.get(numeroDeAmarre - 1).desocupar();
        }
       catch(Exception ex){
           System.out.println("El numero de amarre es incorrecto");
        }
    }
    
   public void mostrarEstado(){
       System.out.println("Hay " + amarres.size() + " Amarres");
      
       for(Amarre amarre : amarres){
           System.out.println(amarre.toString());
        }
    }
}
