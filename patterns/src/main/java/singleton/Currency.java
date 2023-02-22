package singleton;

public class Currency {
    
    private final String name;
    private static Currency instance;
    
    
    private Currency() {
        super();
        this.name = "ARS";
    }



    public static Currency getInstance() {
        if(instance == null) {
            instance = new Currency();
            return instance;
        }
        return instance;
    }


    public String getName() {
        return name;
    }
    
    

}
