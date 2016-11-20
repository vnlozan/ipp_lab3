package command;

/**
 * Created by Vladok on 20.11.2016.
 */
public interface ICommand {
    public void Execute();
    public void Undo();
}
