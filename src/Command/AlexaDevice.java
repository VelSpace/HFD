package Command;

public class AlexaDevice {
    Command[] onCommands;
    Command[] offCommands;
    int slots = 3;

    public AlexaDevice(){
        onCommands = new Command[3];
        offCommands = new Command[3];

        for(int i=1;i<=slots;i++){
            onCommands[i-1] = new NoOpsCommand();
            offCommands[i-1] = new NoOpsCommand();
        }
    }

    public void setCommand(Command x, Command y, int slot){
        if(slot > 3 || slot < 1){
            System.out.println("slots are out of range [1 to 3] only");
            return;
        }
        if(onCommands == null || offCommands == null){
            throw new IllegalArgumentException("Commands are not initialized");
        }

        this.onCommands[slot] = x;
        this.offCommands[slot] = y;
    }
    public void ActivateSlot(int slot){
        this.onCommands[slot].execute();
    }
    public void DeActivateSlot(int slot){
        this.offCommands[slot].execute();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<slots;i++){
            String temp = "\n"+(i+1) + " slot  => onCommand " + onCommands[i].getClass().getSimpleName() + " offCommand " + offCommands[i].getClass().getSimpleName();
            sb.append(temp);
        }
        return sb.toString();
    }

}
