public class main {
    public static void main(String[] args) {
        Duck obj  = new Duck1();
        obj.seteatBehaviour("protein1");
        obj.setflyBehaviour("nowings");
        obj.eatBehaviour.eat();
        obj.flyBehaviour.fly();
        obj.display();
        obj.swim();

    }
    
}
