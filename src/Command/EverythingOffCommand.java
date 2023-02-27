package Command;

public class EverythingOffCommand implements Command {
    KitchenLights kitchenLights;
    Music music;
    public EverythingOffCommand(KitchenLights kitchenLights, Music music){
        this.kitchenLights = kitchenLights;
        this.music = music;
    }
    @Override
    public void execute() {
      System.out.println("party over now get back to your work ");
      kitchenLights.Off();
      music.setVolume(0);
      music.setStation(0);
      music.Off();
     
    }
}
