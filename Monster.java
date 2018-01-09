import java.io.*;
import java.util.*; 
public class Monster{
    private int xPosMonster;
    private int yPosMonster;
    private int attack;
    private int health;
    private int speed;
    public static int countMonster = 0;
    
    int escape;
    
    public Monster(int xPosMonster, int yPosMonster, int attack, int health, int speed){
        this.xPosMonster = xPosMonster;
        this.yPosMonster = yPosMonster;
        this.attack = attack;
        this.health = health;
        this.speed = speed;
        countMonster++;
        escape = 0;
    }
    
    public void killMonster(){
        Monster.countMonster--;
    }
    
    public void interact(Hero hiro){
        //if(hiro != null && hiro.equals(xPosMonster) && hiro.equals(yPosMonster)){
            System.out.println("You have encountered a monster");
            Scanner kbReader = new Scanner(System.in);
            int preHealth = health;
            int hiroAttack = hiro.getAttack();
            int hiroHealth = hiro.getHealth();
            boolean isTrue = true;
            while(isTrue){

                    System.out.println("attack: " + attack + " / health: " + health + " / speed: " + speed);
                    System.out.println("1. attack \n" + "2. run? \n");
                    String choice = kbReader.nextLine( ); 
                 
                
                if (choice.equals("1")){
                    if(hiro.getArmor() == 0){
                        while(isTrue){
                            System.out.println("you attack the monster and deals " + hiroAttack + " damage to the monster");
                            System.out.println("the monster attacks you and deals " + attack + " " + hiro.getHealth() + "/" + hiroHealth);
                            health = health - hiroAttack;
                            hiro.setHealth(attack);
                            System.out.println("Monster's health: " + health + "/" + preHealth + "\n");
                            
                            if(health <= 0){
                                System.out.println("you have killed the monster");
                                killMonster();
                                isTrue = false;
                            }

                            
                            if(hiro.getHealth() == 0){
                                System.out.println("you have died");
                                isTrue = false;
                            }
                        }
                    }
                    else if(hiro.getArmor() == 1){
                        while(isTrue){
                            System.out.println("you attack the monster and deals " + hiro.getAttack() + " damage to the monster");
                            if(health <= 0){
                                System.out.println("you have killed the monster");
                                isTrue = false;
                            }
                            System.out.println("the monster attacks you and deals " + attack);
                            if(hiro.getHealth() <= 0){
                                System.out.println("you have died");
                                isTrue = false;
                            }
                        }
                    }
                }
                else if(choice.equals("2")){
                    System.out.println(speed);
                    
                    if(speed == 0){
                        if((int) (Math.random() * 100) + 1 <= 75){
                            System.out.println("You have escaped the monster!");
                            escape = 1;
                            isTrue = false;
                        }
                        else{
                            System.out.println("You CANNOT escape!");
                            
                        }
                    }
                    else if(speed == 1){
                        if((int) (Math.random() * 100) + 1 <= 50){
                            System.out.println("You have escaped the monster!");
                            escape = 1;
                            isTrue = false;
                        }
                        else{
                            System.out.println("You CANNOT escape!");
                            
                        }
                    }
                    else if(speed == 2){
                        if((int) (Math.random() * 100) + 1 <= 25){
                            System.out.println("You have escaped the monster!");
                            escape = 1;
                            isTrue = false;
                        }
                        else{
                            System.out.println("You CANNOT escape!");
                            
                        }
                    }
                    else if(speed == 3){
                        System.out.println("You CANNOT escape!");
                        
                    }
                }
                
            }
        //}
        //return true;
    }
    
    public int getEscape(){
        return escape;
    }
    
    public int getxPosMonster()
    {
        return xPosMonster;
    }
    
    public int getyPosMonster()
    {
        return yPosMonster;
    }
    /*public int stats(){
        int attackRange = (30 - 1) + 1;
        int attackRandom = (int)(Math.random() * attackRange) + 1;
        int healthRange = (100 - 1) + 1;
        int healthRandom = (int)(Math.random() * healthRange) + 1;
        int speedRange = (100 - 1) + 1;
        int speedRandom = (int)(Math.random() * speedRange) + 1;
        return 0;
    }*/
    
}