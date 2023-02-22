package observer.suscribers;

public class Follower implements EventListener{

    @Override
    public void update(String eventType) {
        System.out.println("Se ha producido el siguiente evento:" + eventType);
        
    }
    
    

}
