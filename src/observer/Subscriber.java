package observer;

import java.util.List;

/**
 * Created by Vladok on 20.11.2016.
 */
public class Subscriber implements IObserver {
    private String name;
    IObservable blogger;

    public Subscriber(String name, IObservable blogger) {
        this.name = name;
        this.blogger = blogger;
        blogger.RegisterObserver(this);
    }

    @Override
    public void Update(Object ob) {
        List<String> blogs=(List<String>)ob;
        System.out.println("Subscriber"+name+"read the last blog of blogger "+blogger.getName()+" which is :\n"+blogs.get(blogs.size()-1));
    }
}
