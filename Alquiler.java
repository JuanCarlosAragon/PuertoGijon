public class Alquiler
{
   private Barco barco;
   private Cliente cliente;
   private int numeroDeDias;
   private static final int ALQUILER_FIJO = 300;
   private static final int MULTIPLICADOR_ESLORA = 10;
   
   
   /**
    * Constructor de la clase Alquiler, establece un alquiler concreto e inicializa sus atributos
    * 
    * @param cliente El cliente
    * @param barco El barco
    * @param numeroDeDias lo que dura el alquiler
    */
   public Alquiler(Cliente cliente, Barco barco, int numeroDeDias){
       this.cliente = cliente;
       this.barco = barco;
       this.numeroDeDias = numeroDeDias;
    }
    
    /**
     * Devuelve el coste del alquiler establecido
     * 
     * @return el coste en euros
     */
   public float getCoste(){
       return (numeroDeDias * barco.getEslora() * MULTIPLICADOR_ESLORA) + (ALQUILER_FIJO + barco.coeficienteBernua());
   }
   
   @Override
   /**
    * Devuelve una definición del alquiler
    * 
    * @return la definición del alquiler
    */
   public String toString(){
       return "Alquiler de " + numeroDeDias + " dias. \n" + cliente.toString() + "\n" + barco.toString();
    }
}
