public class EmbarcacionAMotor extends Barco
{
    private int potencia;
    
    /**
     * Crea una nueva embarcacion a motor
     * 
     * @param eslora Eslora del barco
     * @param matricula Matricula del barco
     * @param anoFabricacion El año de fabricacion del barco
     * @param potencia La potencia del motor del barco
     */
    public EmbarcacionAMotor(float eslora, String matricula, int anoFabricacion, int potencia){
        super(eslora, matricula, anoFabricacion);
        this.potencia = potencia;
    }
    
    /**
     * Calcula y devuelve el coeficiente de Bernua del barco
     * 
     * @return Coeficiente de Bernua
     */
    public int coeficienteBernua(){
        return potencia;
    }
    
    /**
     * Representacion textual de los datos del barco
     * 
     * @return Cadena con la informacion del barco
     */
    @Override
    public String toString(){
        return super.toString() + "Potencia de la embarcacion: " + potencia + " CV\n";
    }
}
