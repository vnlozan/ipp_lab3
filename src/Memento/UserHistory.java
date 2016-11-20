package Memento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Vladok on 20.11.2016.
 */
public class UserHistory {
    private LinkedList<UserMemento>historyList;

    public void pushState(UserMemento userMemento){
        historyList.addLast(userMemento);
    }
    public UserMemento popState(){
        UserMemento state = historyList.get(historyList.size() - 2);
        return state;
    }
    public UserHistory()
    {
        historyList = new LinkedList<>();
    }
    public void Print(){
        historyList.forEach(h-> System.out.println("Cash = "+h.getCash()+" and countMachines = "+h.getMachinesCount()) );
    }
}
