public class Amarre
{
    private Alquiler alquiler;
    private int posicion;
    
    /**
     * Constructor de la clase Amarre, Describe todos sus atributos y los inicializa
     * 
     * @param posicion La posición del amarre
     */
    public Amarre(int posicion){
        this.posicion = posicion;
        alquiler = null;
    }
    
    /**
     * Desocupa el amarre
     */
    public void desocupar(){
        alquiler = null;
    }
    
    /**
     * Indica si el amarre está disponible
     * 
     * @return true si disponible, false si no lo está
     */
    public boolean disponible(){
        return alquiler == null;
    }
    
    /**
     * Ocupa el amarre con un Alquiler pasado como parametro
     * 
     * @param alquiler El alquiler establecido para el amarre.
     */
    public void ocupar(Alquiler alquiler){
        this.alquiler = alquiler;
    }
    
    /**
     * Devuelve el precio en euros (Imagino) que tiene el alquiler del amarre si está ocupado.
     * 
     * @return el coste del amarre
     */
    public float precioAlquilerActual(){
        float precio = 0;
        try{
            precio = alquiler.getCoste();
        }
        catch(Exception ex){
            System.out.println("El amarre esta libre");
        }
        finally{
            return precio;
        }
    }
    
    /**
     * Metodo que te devuelve una descripción del amarre
     * 
     * @return La descripcion del amarre
     */
    @Override
    public String toString(){
        String info = new String();
        
        info += "Amarre " + posicion;
        if(alquiler != null){
            info += "\n" + alquiler.toString();
        }
        else{
            info += "\n\tEste Amarre está libre\n";
        }
        
        return info;
    }

}
