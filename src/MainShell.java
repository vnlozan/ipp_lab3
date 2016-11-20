import Memento.UserHistory;

import Memento.Visitor;
import chain_of_responsibility.*;
import command.RunCommand;
import command.Server;
import command.User;
import observer.Blogger;
import observer.IObservable;
import observer.Subscriber;
import state.Machine;
import state.StartState;
import state.StopState;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by Vladok on 20.11.2016.
 */
public class MainShell {
    public static void main(String[] args) throws IOException {
        while(true) {
            System.out.println("\tCommands");
            System.out.println(
                    "1.chain_of_responsibility\n" +
                            "2.command\n" +
                            "3.memento\n"+
                            "4.observer\n"+
                            "5.state"
            );
            System.out.println("----------------------------------");
            switch ((new BufferedReader(new InputStreamReader(System.in)).readLine())) {
                case "chain_of_responsibility":
                    //send to GMail receiver
                    Receiver receiver=new Receiver(true,false,false);
                    MailHandler gMail=new GmailHandler();
                    MailHandler yahooMail=new YahooHandler();
                    MailHandler mailRu=new MailRUHandler();
                    mailRu.setSuccesor(yahooMail);
                    yahooMail.setSuccesor(gMail);
                    mailRu.Handle(receiver);
                    break;
                case "command":
                    //run machine
                    User user=new User();
                    Server server=new Server();
                    user.SetCommand(new RunCommand(server));
                    user.PressButton();
                    user.PressUndo();
                    break;
                case "memento":
                    UserHistory userHistory=new UserHistory();
                    Visitor visitor=new Visitor(210);
                    userHistory.pushState(visitor.SaveState());
                    //210 0
                    visitor.buyMachine();
                    userHistory.pushState(visitor.SaveState());
                    //160 1
                    visitor.buyMachine();
                    userHistory.pushState(visitor.SaveState());
                    //110 2
                    visitor.sellMachine();
                    userHistory.pushState(visitor.SaveState());
                    //160 1
                    visitor.RestoreState(userHistory.popState());
                    userHistory.pushState(visitor.SaveState());
                    userHistory.Print();
                    break;
                case "observer":
                    IObservable blogger=new Blogger("Bill");
                    Subscriber subscriber=new Subscriber("David",blogger);
                    Subscriber subscriber1=new Subscriber("Ed",blogger);
                    blogger.activity();
                    break;
                case "state":
                    Machine machine = new Machine();

                    StartState startState = new StartState();
                    startState.doAction(machine);

                    System.out.println(machine.getState().toString());

                    StopState stopState = new StopState();
                    stopState.doAction(machine);

                    System.out.println(machine.getState().toString());
                    break;
                default:
                    System.out.println("No operation solved");
                    break;
            }
            System.out.println("----------------------------------");
        }
    }
}
