package Command;

public class MusicOnCommand implements Command{
    Music music;
    public MusicOnCommand(Music s){
        this.music = s;
        music.setStation(99.1f);
        music.setVolume(9);
    }
    @Override
    public void execute() {
        music.On();
    }

}
