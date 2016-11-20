package observer;

/**
 * Created by Vladok on 20.11.2016.
 */
public interface IObservable
{
    public String getName();
    public void RegisterObserver(IObserver o);
    public void RemoveObserver(IObserver o);
    public void NotifyObservers();
    public void activity();
}