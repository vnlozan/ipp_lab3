package command;

/**
 * Created by Vladok on 20.11.2016.
 */
public class User {
    ICommand command;

    public User() {
    }
    public void SetCommand(ICommand com)
    {
        command = com;
    }

    public void PressButton()
    {
        command.Execute();
    }
    public void PressUndo()
    {
        command.Undo();
    }
}
