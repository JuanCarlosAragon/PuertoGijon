public class Yate extends EmbarcacionAMotor
{
    private int numeroCamarotes;
    
    /**
     * Crea una nueva embarcacion a motor de lujo
     * 
     * @param eslora Eslora del barco
     * @param matricula Matricula del barco
     * @param anoFabricacion El año de fabricacion del barco
     * @param potencia La potencia del motor del barco
     * @param numeroCamarotes El numero de camarotes que tiene el barco
     */
    public Yate(float eslora, String matricula, int anoFabricacion, int potencia, int numeroCamarotes){
        super(eslora, matricula, anoFabricacion, potencia);
        this.numeroCamarotes = numeroCamarotes;
    }
    
    /**
     * Calcula y devuelve el coeficiente de Bernua del barco
     * 
     * @return Coeficiente de Bernua
     */
    public int coeficienteBernua(){
        return super.coeficienteBernua() + numeroCamarotes;
    }
    
    /**
     * Representacion textual de los datos del barco
     * 
     * @return Cadena con la informacion del barco
     */
    @Override
    public String toString(){
        return super.toString() + "Camarotes del barco: " + numeroCamarotes + "\n";
    }
}
