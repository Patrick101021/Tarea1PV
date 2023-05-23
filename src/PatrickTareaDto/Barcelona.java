package PatrickTareaDto;

public class Barcelona  {
    private double Deuda;
    private int Titulos;
    private int Numero_Jugadores;
    private int Capacidad_Estadio;
    private String Patrocinador;
    private String Division;
    
    public void setDeuda(double Deuda){
        this.Deuda = Deuda;
    }
    
    public void setTitulos(int Titulos){
        this.Titulos = Titulos;
    }
    
    public void setNumero_Jugadores(int Numero_Jugadores){
        this.Numero_Jugadores = Numero_Jugadores;
    }
    
    public void setCapacidad_Estadio(int Capacidad_Estadio){
        this.Capacidad_Estadio = Capacidad_Estadio;
    }
    
    public void setPatrocinador(String Patrocinador){
        this.Patrocinador = Patrocinador;
    }
    
    public void setDivision(String Division){
        this.Division = Division;
    }
    
    public double getDeuda(){
        return Deuda;
    }
    
    public int getTitulos(){
        return Titulos;
    }
    
    public int getNumero_Jugadores(){
        return Numero_Jugadores;
    }
    
    public int getCapacidad_Estadio(){
        return Capacidad_Estadio;
    }
    
    public String getPatrocinadores(){
        return Patrocinador;
    }
       
    public String getDivision_Actual(){
        return Division;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 