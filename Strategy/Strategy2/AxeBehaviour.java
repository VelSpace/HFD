package Strategy2;

public class AxeBehaviour implements WeaponBehaviour{

    @Override
    public void useWeapon(String weaponName) {
       System.out.println(weaponName); 
    }
    
}
