package Command;

public class NoOpsCommand implements Command{

    @Override
    public void execute() {
        throw new UnsupportedOperationException("Unimplemented method 'execute'");
    }
    
}
