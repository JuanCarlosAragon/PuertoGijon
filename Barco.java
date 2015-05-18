public abstract class Barco
{
    private int anoFabricacion;
    private float eslora;
    private String matricula;
    
    /**
     * Constructor de la clase Barco, inicializa sus atributos
     * 
     * @param eslora Eslora del barco
     * @param matricula Matricula del barco
     * @param anoFabricacion El año de Fabricacion del barco
     */
    public Barco(float eslora, String matricula, int anoFabricacion){
        this.anoFabricacion = anoFabricacion;
        this.eslora = eslora;
        this.matricula = matricula;
    }
    
    /**
     * Calcula y devuelve el coeficiente de Bernua del barco
     * 
     * @return Coeficiente de Bernua
     */
    public abstract int coeficienteBernua();
    
    /**
     * Indica el tamaño de la eslora del barco
     * 
     * @return Eslora del barco
     */
    public float getEslora(){
        return eslora;
    }
    
    /**
     * Representacion textual de los datos del barco
     * 
     * @return Cadena con la informacion del barco
     */
    @Override
    public String toString(){
        String lineaUno = "Barco fabricado en " + anoFabricacion + "\n";
        String lineaDos = "Eslora de " + eslora + " metros\n";
        String lineaTres = "Su matricula es " + matricula + "\n";
        return lineaUno + lineaDos + lineaTres;
    }
}
