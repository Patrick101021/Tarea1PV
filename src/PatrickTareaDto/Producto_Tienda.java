package PatrickTareaDto;

public class Producto_Tienda {
    private String Calidad;
    private int Stock;
    private String Descripcion;
    private String Proveedor;
    private double Peso;
    private double Precio;
    
    public void setCalidad(String Calidad){
        this.Calidad = Calidad;
    }
    
    public void setStock(int Stock){
        this.Stock = Stock;
    }
    
    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }
    
    public void setProveedor(String Proveedor){
        this.Proveedor = Proveedor;
    }
    
    public void setPeso(double Peso){
        this.Peso = Peso;
    }
    
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }
    
    public String getCalidad(){
        return Calidad;
    }
    
    public int getStock(){
        return Stock;
    }
    
    public String getDescripcion(){
        return Descripcion;
    }
    
    public String getProveedor(){
        return Proveedor;
    }
    
    public double getPeso(){
        return Peso;
    }
    
    public double getPrecio(){
        return Precio;
    }
}

/**
 * @author Patrick (A.Neuer)
 */ 