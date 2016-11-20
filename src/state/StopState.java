package state;

/**
 * Created by Vladok on 20.11.2016.
 */
public class StopState implements State {

    public void doAction(Machine machine) {
        System.out.println("Machine is in stop state");
        machine.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}