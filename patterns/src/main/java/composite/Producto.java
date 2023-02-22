package composite;

public class Producto extends ProductoPadre implements OperacionProducto{
    
    private String name;
    private int stock;
    private double precio;
    private String codigo;
    

    public Producto(String name, int stock, double precio,String codigo) {
        super();
        this.name = name;
        this.stock = stock;
        this.precio = precio;
        this.codigo= codigo;
    }

    public Producto() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    @Override
    public void imprimirProducto() {
      System.out.println( this.toString());
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return    "nombre producto: "+this.name+"\n"
                + "stock: "+this.stock+"\n"
                + "precio: "+this.precio+"\n"
                + "codigo: "+this.codigo+"\n";
                
    }
    
    

}
