package command;

/**
 * Created by Vladok on 20.11.2016.
 */
public class RunCommand implements ICommand{
    private Server server;

    public RunCommand(Server server) {
        this.server = server;
    }

    @Override
    public void Execute() {
        server.runMachine();
    }

    @Override
    public void Undo() {
        server.stopMachine();
    }
}
