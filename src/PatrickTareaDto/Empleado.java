
package PatrickTareaDto;

public class Empleado {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private int Cedula;
    private String Correo;
    private int Telefono;
    
    public void setNombres(String Nombres){
        this.Nombres = Nombres;
    }
    
    public void setApellidos(String Apellidos){
        this.Apellidos = Apellidos;
    }
    
    public void setEdad(int Edad){
        this.Edad = Edad;
    }
  
    public void setCedula(int Cedula){
        this.Cedula = Cedula;
    }
    
    public void setCorreo(String Correo){
        this.Correo = Correo;
    }
    public void setTelefono(int Telefono){
        this.Telefono = Telefono;
    }
    
    public String getNombres(){
        return Nombres;
    }
    
    public String getApellidos(){
        return Apellidos;
    }
    
    public int getEdad(){
        return Edad;
    }
    
    public int getCedula(){
        return Cedula;
    }
    
    public String getCorreo(){
        return Correo;
    }
    
    public int getTelefono(){
        return Telefono;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 