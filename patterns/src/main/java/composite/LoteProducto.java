package composite;

import java.util.ArrayList;
import java.util.List;

public class LoteProducto extends ProductoPadre implements OperacionProducto {
    List<Producto> productos=new ArrayList<Producto>();
    
    

    public LoteProducto() {
        super();
    }



    public LoteProducto(List<Producto> productos) {
        super();
        this.productos = productos;
    }



    @Override
    public void imprimirProducto() {
        productos.stream().forEach(producto->producto.imprimirProducto());
    }
    
    
    
    
}
