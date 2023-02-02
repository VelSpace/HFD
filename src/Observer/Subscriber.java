package Observer;

public class Subscriber implements Observer{

    private String name;
    private Channel channel ;


    public Subscriber(String name, Channel channel){
        this.name = name;
        this.channel = channel;
    }

    @Override
    public void update(String s) {
        System.out.println(s+" "+name +" "+channel);
    }

}
