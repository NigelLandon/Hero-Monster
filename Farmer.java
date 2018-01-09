public class Farmer
{
    private String name;
    private int xPosFarmer;
    private int yPosFarmer;
    private int quest;
    private Weapon weapon;
    private Armor armor;
    
    public Farmer(String name, int xPosFarmer, int yPosFarmer, int quest, Weapon weapon, Armor armor)
    {
        this.name = name;
        this.xPosFarmer = xPosFarmer;
        this.yPosFarmer = yPosFarmer;
        this.quest = quest;
        this.weapon = weapon;
        this.armor = armor;
    }
    
    public void interact(Hero hiro){
       
       if(Monster.countMonster == 4 || Monster.countMonster <= 4){//youve killed 2 monsters
           if(quest == 2){//quest 2 will get you sword
               hiro.setWeapon(weapon);//sword
               quest = 0;
               System.out.println("the farmer has given you a " + weapon.getNameWeapon() + " for killing 2 monster");
            }
       }
       else if(Monster.countMonster == 2 || Monster.countMonster <= 2){
           if(quest == 4){
               hiro.setArmor(armor);
               quest = 0;
               System.out.println("the farmer has given you a " + armor.getArmorName() + " for killing 4 monster");
            }
       }
       else{
           System.out.println("monster alive; " + Monster.countMonster);
           System.out.println("you need to kill more monsters");
       }
    }
    
    public int getQuest(){
        return quest;
    }
    
    public int getyPosFarmer(){
        return yPosFarmer;
    }
    
    public int getxPosFarmer(){
        return xPosFarmer;
    }
}