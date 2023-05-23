package PatrickTareaDto;

public class Smartphone {
    private String Marca;
    private int Capacidad;
    private String Modelo;
    private String Calidad;
    private String SO;
    private String Resolucion;
    
    public void setMarca(String Marca){
        this.Marca = Marca;
    }
    
    public void setCapacidad(int Capacidad){
        this.Capacidad = Capacidad;
    }
    
    public void setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    
    public void setCalidad(String Calidad){
        this.Calidad = Calidad;
    }
    
    public void setSO(String SO){
        this.SO = SO;
    }
    
    public void setResolucion(String Resolucion){
        this.Resolucion = Resolucion;
    }
    
    public String getMarca(){
        return Marca;
    }
    
    public int getCapacidad(){
        return Capacidad;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public String getCalidad(){
        return Calidad;
    }
    
    public String getSO(){
        return SO;
    }
    
    public String getResolucion(){
        return Resolucion;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 