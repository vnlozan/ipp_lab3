package Memento;

/**
 * Created by Vladok on 20.11.2016.
 */
public class Visitor {
    private int cash;
    private int MachinesCount;

    public int getCash() {
        return cash;
    }
    public int getMachinesCount() {
        return MachinesCount;
    }
    public Visitor(int cash) {
        this.cash = cash;
        MachinesCount=0;
    }
    public void buyMachine(){
        if(cash>50)
        {
            MachinesCount++;
            cash-=50;
        }
        else{
            System.out.println("U have to refill ur cash...");
        }
    }
    public void sellMachine(){
        if(MachinesCount>1)
        {
            MachinesCount--;
            cash+=50;
        }
        else{
            System.out.println("U have no machines to sell...");
        }

    }
    public UserMemento SaveState(){
        System.out.println("Saving the cash = "+getCash()+" and machinesCount = "+getMachinesCount());
        return new UserMemento(getCash(),getMachinesCount());
    }
    public void RestoreState(UserMemento userMemento){
        cash=userMemento.getCash();
        MachinesCount=userMemento.getMachinesCount();
        System.out.println("Saving the cash = "+getCash()+" and machinesCount = "+getMachinesCount());
    }
}
