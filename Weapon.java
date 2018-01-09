public class Weapon
{
    private String nameWeapon;
    private int minDamage;
    private int maxDamage;
    
    public Weapon(String nameWeapon, int minDamage, int maxDamage)
    {
        this.nameWeapon = nameWeapon;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
    /*public void interact(Hero hiro){
        System.out.println("A farmer gives you a weapon");
        System.out.println("You got a" + nameWeapon);
        System.out.println(nameWeapon + " does " + minDamage +
        "-" + maxDamage + "damage");
        
    }*/
    
    public int attackMonster(){
        int weaponDamage = ((int) (Math.random() * maxDamage) + minDamage);
        return weaponDamage;
    }
    
    public String getNameWeapon(){
        return nameWeapon;
    }
}