package Memento;

/**
 * Created by Vladok on 20.11.2016.
 */
public class UserMemento {
    private int cash;
    private int machinesCount;

    public UserMemento(int cash, int machinesCount) {
        this.cash = cash;
        this.machinesCount = machinesCount;
    }

    public int getCash() {
        return cash;
    }

    public int getMachinesCount() {
        return machinesCount;
    }
}
