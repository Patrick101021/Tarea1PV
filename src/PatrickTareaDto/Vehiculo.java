package PatrickTareaDto;

public class Vehiculo {
    private String Tipo;
    private double Valor;
    private String Velocidad;
    private String Peso_Vehiculo;
    private int Cantidad_Motores;
    private String Num_Matricula;
    
    public void setTipo(String Tipo){
        this.Tipo = Tipo;
    }
    
    public void setPasaje(double Valor){
        this.Valor = Valor;
    }
    
    public void setVelocidad(String Velocidad){
        this.Velocidad = Velocidad;
    }
    
    public void setPeso_Vehiculo(String Peso_Vehiculo){
        this.Peso_Vehiculo = Peso_Vehiculo;
    }
    
    public void setCantidad_Motores(int Cantidad_Motores){
        this.Cantidad_Motores = Cantidad_Motores;
    }
    
    public void setNum_Matricula(String Num_Matricula){
        this.Num_Matricula = Num_Matricula;
    }
    
    public String getTipo(){
        return Tipo;
    }
    
    public double getValor(){
        return Valor;
    }
    
    public String getVelocidad(){
        return Velocidad;
    }
    
    public String   Peso_Vehiculo(){
        return Peso_Vehiculo;
    }
    
    public int getCantidad_Motores(){
        return Cantidad_Motores;
    }
    
    public String getNum_Matricula(){
        return Num_Matricula;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 