package singleton;

public class Order {
    private Currency divisa;
    private int count;
    private String description;
    private Product producto;
    
    public Order(Currency currency, int count, String description) {
        super();
        this.divisa = currency;
        this.count = count;
        this.description = description;
    }
    public Order(Currency currency, int count, String description,Product producto) {
        super();
        this.divisa = currency;
        this.count = count;
        this.description = description;
        this.producto= producto;
    }


    public Currency getDivisa() {
        return divisa;
    }


    public void setDivisa(Currency divisa) {
        this.divisa = divisa;
    }


    public int getCount() {
        return count;
    }


    public void setCount(int count) {
        this.count = count;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }
    public Product getProducto() {
        return producto;
    }
    public void setProducto(Product producto) {
        this.producto = producto;
    }
    
    
    
}
