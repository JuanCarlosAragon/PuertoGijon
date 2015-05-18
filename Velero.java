public class Velero extends Barco
{
    private int numeroDeMastiles;
    
    /**
     * Crea un nuevo velero
     * 
     * @param eslora Eslora del barco
     * @param matricula Matricula del barco
     * @param anoFabricacion El año de fabricacion del barco
     * @param numeroDeMastiles Numero de mastiles del barco
     */
    public Velero (float eslora, String matricula, int anoFabricacion, int numeroDeMastiles){
        super(eslora, matricula, anoFabricacion);
        this.numeroDeMastiles = numeroDeMastiles;
    }
    
    /**
     * Calcula y devuelve el coeficiente de Bernua del barco
     * 
     * @return Coeficiente de Bernua
     */
    public int coeficienteBernua(){
        return numeroDeMastiles;
    }
    
    /**
     * Representacion textual de los datos del barco
     * 
     * @return Cadena con la informacion del barco
     */
    @Override
    public String toString(){
        return super.toString() + "Mastiles del barco: " + numeroDeMastiles + "\n";
    }
}
