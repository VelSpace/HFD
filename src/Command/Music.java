package Command;

public class Music {

    private int volume;
    private float station;
    
    public void On(){
        System.out.println("kitchen lights are turned on");
    }
    

    public void Off(){
        System.out.println("kitchen lights are turned off");
    }

    public void setVolume(int volume){
        System.out.println("Volumes are set to "+volume);
        this.volume = volume;
    }

    public void setStation(float station){
        System.out.println("Station set to "+station);
        this.station = station;
    }
}
