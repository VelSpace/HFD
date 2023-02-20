package Factory;

public class OperatingSystemFactory {

    public OS getOS(String s){
        if(s.equals("Windows")){
            return new Windows();
        }
        else if(s.equals("Android")){
            return new Android();
        }
        else if(s.equals("MAC")){
            return new IOS();
        }
        return null;
    }
    
}
