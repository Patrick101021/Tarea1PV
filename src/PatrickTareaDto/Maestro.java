package PatrickTareaDto;

public class Maestro {
    private String Materia;
    private int Hora_Trabajo;
    private String Jornada;
    private int Curso;
    private double Valor_Salario;
    private char Estado_Civil;
    
    public void setMateria(String Materia){
        this.Materia = Materia;
    }
    
    public void setHora_Trabajo(int Hora_Trabajo){
        this.Hora_Trabajo = Hora_Trabajo;
    }
    
    public void setJornada(String Jornada){
        this.Jornada = Jornada;
    }
    
    public void setCurso(int Curso){
        this.Curso = Curso;
    }
    
    public void setValor_Salario(double Valor_Salario){
        this.Valor_Salario = Valor_Salario;
    }
    
    public void setEstado_Civil(char Estado_Civil){
        this.Estado_Civil = Estado_Civil;
    }
    
    public String getMateria(){
        return Materia;
    }
    
    public int getHora_Trabajo(){
        return Hora_Trabajo;
    }
    
    public String getJornada(){
        return Jornada;
    }
    
    public int getCurso(){
        return Curso;
    }
    
    public double getValor_Salario(){
        return Valor_Salario;
    }
    
    public char getEstado_Civil(){
        return Estado_Civil;
    }   
}

/**
 * @author Patrick (A.Neuer)
 */ 