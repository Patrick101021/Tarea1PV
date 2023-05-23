package PatrickTareaDto;

public class Teatro {
    private int Num_Boleto;
    private int Num_Sala;
    private String Clasificacion;
    private String Nom_Pelicula;
    private double Precio_Entrada;
    private String Procedencia;
    
    public void setNum_Boletos(int Num_Boletos){
        this.Num_Boleto = Num_Boleto;
    }
    
    public void setNum_Sala(int Num_Sala){
        this.Num_Sala = Num_Sala;
    }
    
    public void setClasificacion(String Clasificacion){
        this.Clasificacion = Clasificacion;
    }
    
    public void setNom_Pelicula(String Nom_Pelicula){
        this.Nom_Pelicula = Nom_Pelicula;
    }
    
    public void setPrecio_Entrada(double Precio_Entrada){
        this.Precio_Entrada = Precio_Entrada;
    }
    
    public void setProcedencia(String Procedencia){
        this.Procedencia = Procedencia;
    }
    
    public int getNum_Boleto(){
        return Num_Boleto;
    }
    
    public int getNum_Sala(){
        return Num_Sala;
    }
    
    public String getClasificacion(){
        return Clasificacion;
    }
    
    public String getNom_Pelicula(){
        return Nom_Pelicula;
    }
    
    public double getPrecio_Entrada(){
        return Precio_Entrada;
    }
    
    public String getProcedencia(){
        return Procedencia;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 