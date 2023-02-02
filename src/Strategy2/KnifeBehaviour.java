package Strategy2;

public class KnifeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon(String weaponName) {
        
        System.out.println(weaponName);
    }
    
}
