package Command;

public class KitchenLightsOffCommand implements Command{

    KitchenLights kitchenLights;

    public KitchenLightsOffCommand(KitchenLights kitchenLights){
        this.kitchenLights = kitchenLights;
    }
    @Override
    public void execute() {
        kitchenLights.Off();
    }
    
}
