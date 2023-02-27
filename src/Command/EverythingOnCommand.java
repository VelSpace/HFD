package Command;

public class EverythingOnCommand implements Command{
    KitchenLights kitchenLights;
    Music music;
    public EverythingOnCommand(KitchenLights kitchenLights, Music music){
        this.kitchenLights = kitchenLights;
        this.music = music;
    }
    @Override
    public void execute() {
      System.out.println("It's party time :) ");
      kitchenLights.On();
      music.On();
      music.setVolume(9);
      music.setStation(99.1f);
    }


}
