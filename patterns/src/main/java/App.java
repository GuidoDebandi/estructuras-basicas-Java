import java.util.ArrayList;
import java.util.List;

import composite.LoteProducto;
import composite.Producto;
import composite.ProductoPadre;
import dependecy_injection.Game;
import dependecy_injection.Playstation;
import factoria.CaballeroFactoria;
import factoria.Cisne;
import factoria.Fenix;
import factoria.Pegaso;



public class App {
    public static void main(String[] args) {
        final String patron="DEPENDENCY";
        
        switch (patron){
            case "FACTORIA":

                List<CaballeroFactoria> caballeros = new ArrayList<CaballeroFactoria>();
                Cisne caballero1=new Cisne();
                Pegaso caballero2=new Pegaso(); 
                Fenix caballero3=new Fenix();
                
                caballeros.add(caballero1); caballeros.add(caballero2);
                caballeros.add(caballero3); for(CaballeroFactoria caballero: caballeros) {
                caballero.animal(); }
            break;
            
            case "COMPOSITE":
                
                List<ProductoPadre> deposito=new ArrayList<ProductoPadre>();
                List<Producto> loteCafe=new ArrayList<Producto>();
                               
                Producto cafe1=new Producto("Cafe La Morenita",100,200.25,"CM001"); 
                Producto cafe2=new Producto("Cafe La Morenita",100,200.25,"CM002"); 
                Producto cafe3=new Producto("Cafe La Morenita",100,200.25,"CM003"); 
                Producto cafe4=new Producto("Cafe La Morenita",100,200.25,"CM004");
                Producto cafe5=new Producto("Cafe La Morenita",100,200.25,"CM005");
                
                loteCafe.add(cafe1); loteCafe.add(cafe2); loteCafe.add(cafe3);
                loteCafe.add(cafe4); loteCafe.add(cafe5);
                
                LoteProducto cafe=new LoteProducto(loteCafe);                
                Producto leche1=new Producto("Leche la Serenisima", 500,250.35,"LS005");
                
                deposito.add(leche1); deposito.add(cafe);
                
                deposito.stream().forEach(producto -> producto.imprimirProducto());
            break;
           
            case "DEPENDENCY":
                
                Playstation play= new Playstation(new Game("Resident Evil"));
                System.out.println(play.askMyGame());
                
                play.setVideogame(new Game("Brawhalla"));
                System.out.println(play.askMyGame());
                
                play.setVideogame(null);
                System.out.println(play.askMyGame());
                
        }

          
         
        
 
          
          
         
          
        
        
          
          
         
 
    }

}
