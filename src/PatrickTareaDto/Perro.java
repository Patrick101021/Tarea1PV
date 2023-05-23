package PatrickTareaDto;

public class Perro {
    private String Tamaño;
    private String Color;
    private double Peso;
    private String Dieta;
    private String Sexo;
    private String Raza;
    
    public void SetTamaño(String Tamaño){
        this.Tamaño = Tamaño;
    }
    
    public void SetColor(String Color){
        this.Color = Color;
    }
    
    public void SetPeso(double Peso){
        this.Peso = Peso;
    }
    
    public void Dieta(String Dieta){
        this.Dieta = Dieta;
    }
    
    public void SetSexo(String Sexo){
        this.Sexo = Sexo;
    }
    
    public void SetRaza(String Raza){
        this.Raza = Raza;
    }
    
    public String getTamaño(){
        return Tamaño;
    }
    
    public String getColor(){
        return Color;
    }
    
    public double getPeso(){
        return Peso;
    }
    
    public String getDieta(){
        return Dieta;
    }
    
    public String getSexo(){
        return Sexo;
    }
    
    public String getRaza(){
        return Raza;
    }
}

/**
 * @author Gabriel (A.Neuer)
 */ 