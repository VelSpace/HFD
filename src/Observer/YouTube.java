package Observer;

public class YouTube {
    public static void main(String[] args) {
        
        Channel telusko = new Channel();

        Subscriber s1 = new Subscriber("Mani",telusko);
        Subscriber s2 = new Subscriber("Vijay",telusko);
        Subscriber s3 = new Subscriber("Nachu",telusko);
        Subscriber s4 = new Subscriber("Uday",telusko);
        Subscriber s5 = new Subscriber("Rohit",telusko);

        telusko.subscribe(s1);
        telusko.subscribe(s2);
        telusko.subscribe(s3);
        telusko.subscribe(s4);
        telusko.subscribe(s5);

        telusko.upload("learn programming video out from telusko :)");
    }
}
