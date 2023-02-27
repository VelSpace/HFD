package Command;

public class KitchenLightsOnCommand implements Command{

    KitchenLights kitchenLights;

    public KitchenLightsOnCommand(KitchenLights x){
        this.kitchenLights = x;
    }
    @Override
    public void execute() {
        kitchenLights.On();
    }
    
}
