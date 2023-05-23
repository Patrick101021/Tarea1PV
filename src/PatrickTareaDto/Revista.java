package PatrickTareaDto;

public class Revista {
    private String Autor;
    private int Año_Publicacion;
    private int Paginas;
    private String Editorial;
    private int Codigo;
    private String Categoria;
    
    public void setAutor(String Autor){
        this.Autor = Autor;
    }
    
    public void setAño_Publicacion(int Año_Publicacion){
        this.Año_Publicacion = Año_Publicacion;
    }
    
    public void setPaginas(int Paginas){
        this.Paginas = Paginas;
    }
    
    public void setEditorial(String Editorial){
        this.Editorial = Editorial;
    }
    
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }
    
    public void setCategoria(String Categoria){
        this.Categoria = Categoria;
    }
    
    public String getAutor(){
        return Autor;
    }
    
    public int getAño_Publicacion(){
        return Año_Publicacion;
    }
    
    public int getPaginas(){
        return Paginas;
    }
    
    public String getEditorial(){
        return Editorial;
    }
    
    public int getCodigo(){
        return Codigo;
    }
    
    public String getCategoria(){
        return Categoria;
    }    
}

/**
 * @author Patrick (A.Neuer)
 */ 