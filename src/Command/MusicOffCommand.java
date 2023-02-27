package Command;

public class MusicOffCommand implements Command{
    Music music;
    public MusicOffCommand(Music s){
        this.music = s;
        
    }
    @Override
    public void execute() {
       music.setStation(0);
       music.setVolume(0);
       music.Off();
    }

}
