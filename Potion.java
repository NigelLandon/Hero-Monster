import java.io.*;
import java.util.*; 
public class Potion{
    private String potionName;
    private int xPosPotion;
    private int yPosPotion;
    public static int countPotion = 0;
    //private int potionEffect;
    
    
    public Potion(String potionName, int xPosPotion ,int yPosPotion){
        this.potionName = potionName;
        this.xPosPotion = xPosPotion;
        this.yPosPotion = yPosPotion;
        countPotion++;
        //this.potionEffect = potionEffect;
    }
    
    public static void usePotion(){
        Potion.countPotion--;
    }
    
    public void interact(Hero hiro){
        
        
        /*System.out.println("A farmer gives you a Potion");
        System.out.println("You have aquired the" + potionName);
        Scanner kbReader = new Scanner(System.in);   
        hiro.setHealth();*/
    }
    
    public String getpotionName(){
        return potionName;
    }
    
    public int getxPosPotion()
    {
        return xPosPotion;
    }
    
    public int getyPosPotion()
    {
        return yPosPotion;
    }
    
    
}