package Strategy2;

public class Character1 {
    public static void main(String[] args) {
        Character queen = new Queen();
        queen.setWeaponBehaviour(new SwordBehaviour());
        queen.fight("I fight with sword");
    }
    
}
