package observer.publisher;


import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import observer.suscribers.*;


public class EventManager {
    Map<String, List<Follower>> listeners = new HashMap<String, List<Follower>>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Follower listener) {
        List<Follower> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Follower listener) {
        List<Follower> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType) {
        List<Follower> users = listeners.get(eventType);
        for (Follower listener : users) {
            listener.update(eventType);
        }
    }
}
