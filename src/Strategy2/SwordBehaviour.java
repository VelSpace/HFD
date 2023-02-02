package Strategy2;

public class SwordBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon(String weaponName) {
        System.out.println(weaponName);
    }
    
}
