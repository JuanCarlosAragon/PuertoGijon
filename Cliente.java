public class Cliente
{
   private String dni;
   private String nombre;
   
   /**
    * Constructor de la clase Cliente, inicializa todos los parametros.
    * 
    * @param nombre El nombre del cliente
    * @param dni El dni del cliente.
    */
   public Cliente(String nombre, String dni){
       this.dni = dni;
       this.nombre = nombre;
    }
   
    @Override
    /**
     * Devuelve una cadena con la descripción del cliente
     * 
     * return la cadena que describe al cliente
     */
   public String toString(){
       return "Nombre: " + nombre +"\nDNI: " + dni;
    }
    
}
