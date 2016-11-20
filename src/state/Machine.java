package state;

/**
 * Created by Vladok on 20.11.2016.
 */
public class Machine {
    private State state;

    public Machine(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}