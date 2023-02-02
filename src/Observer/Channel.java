package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

    private List<Subscriber> Subscribers = new ArrayList<Subscriber>();
    private String title;

    public void subscribe(Subscriber subscriber) {
        Subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        Subscribers.remove(subscriber);
    }

    public void notifySubscribers() {
        for(Subscriber subscriber: Subscribers) subscriber.update(this.title);
    }

    public void upload(String title){
        this.title = title;
        notifySubscribers();
    }

}
