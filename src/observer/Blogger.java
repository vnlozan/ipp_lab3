package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladok on 20.11.2016.
 */
public class Blogger implements IObservable {
    private List<String>blogs;
    private String name;
    private List<IObserver> observers;

    public String getName() {
        return name;
    }

    public Blogger(String name) {
        blogs=new ArrayList<>();
        observers=new ArrayList<>();
        this.name=name;
    }

    @Override
    public void RegisterObserver(IObserver o) {
        observers.add(o);
    }

    @Override
    public void RemoveObserver(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void NotifyObservers() {
        for (IObserver o: observers) {
            o.Update(blogs);
        }
    }
    public void activity(){
        blogs.add("Android development Ch.1");
        blogs.add("IOS development Ch.3");
        NotifyObservers();
    }
}
