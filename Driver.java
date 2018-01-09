import java.io.*;
import java.util.*; 
public class Driver
{
    public static void moveHero(Hero hiro, int xPosIncrement, int yPosIncrement){
        hiro.setX(xPosIncrement);//left or right
        hiro.setY(yPosIncrement);//up or down
    }
    public static void main(String args[])
    {
        Weapon dagger = new Weapon("dagger", 10 ,30);
        Armor skin = new Armor("no armor", 0);
        
        Weapon sword = new Weapon("sword", 20, 50);
        Armor bronzeArmor = new Armor("Bronze Armor", 1);
        
        Hero hiro = new Hero(0, 9, 100, dagger, skin);
        Object[][] map = new Object[10][10];
        map[hiro.getyPos()][hiro.getxPos()] = hiro;
        
        
        int xPosPotionHealthPotion1 = (int) (Math.random() * 9);
        int yPosPotionHealthPotion1 = (int) (Math.random() * 9);
        
        while(map[yPosPotionHealthPotion1][xPosPotionHealthPotion1] != null){
            xPosPotionHealthPotion1 = ((int) (Math.random() * 9));
            yPosPotionHealthPotion1 = ((int) (Math.random() * 9));
        }
        Potion healthPotion1 = new Potion("Health Potion", xPosPotionHealthPotion1, yPosPotionHealthPotion1);
        
        map[healthPotion1.getyPosPotion()][healthPotion1.getxPosPotion()] = healthPotion1;
        
        
        int xPosPotionHealthPotion2 = (int) (Math.random() * 9);
        int yPosPotionHealthPotion2 = (int) (Math.random() * 9);
        
        while(map[yPosPotionHealthPotion2][xPosPotionHealthPotion2] != null){
            xPosPotionHealthPotion2 = ((int) (Math.random() * 9));
            yPosPotionHealthPotion2 = ((int) (Math.random() * 9));
        }
        Potion healthPotion2 = new Potion("Health Potion", xPosPotionHealthPotion2, yPosPotionHealthPotion2);
        
        map[healthPotion2.getyPosPotion()][healthPotion2.getxPosPotion()] = healthPotion2;
        
        
        int xPosfarmer1 = (int) (Math.random() * 9);
        int yPosfarmer1 = (int) (Math.random() * 9);
        
        while(map[yPosfarmer1][xPosfarmer1] != null){
            xPosfarmer1 = ((int) (Math.random() * 9));
            yPosfarmer1 = ((int) (Math.random() * 9));
        }
        Farmer farmer1 = new Farmer("Farmer 1", xPosfarmer1, yPosfarmer1, 2, sword, null);
        
        map[farmer1.getyPosFarmer()][farmer1.getxPosFarmer()] = farmer1;
        
        
        int xPosfarmer2 = (int) (Math.random() * 9);
        int yPosfarmer2 = (int) (Math.random() * 9);
        
        while(map[yPosfarmer2][xPosfarmer2] != null){
            xPosfarmer2 = ((int) (Math.random() * 9));
            yPosfarmer2 = ((int) (Math.random() * 9));
        }
        Farmer farmer2 = new Farmer("Farmer 1", xPosfarmer2, yPosfarmer2, 4, null, bronzeArmor);
        
        map[farmer2.getyPosFarmer()][farmer2.getxPosFarmer()] = farmer2;
        
        
        int xPosMonster1 = (int) (Math.random() * 9);
        int yPosMonster1 = (int) (Math.random() * 9);
        
        while(map[yPosMonster1][xPosMonster1] != null){
            xPosMonster1 = ((int) (Math.random() * 9));
            yPosMonster1 = ((int) (Math.random() * 9));
        }
        Monster m1 = new Monster(xPosMonster1, yPosMonster1,
        ((int) (Math.random() * 30) + 1), ((int) (Math.random() * 100) + 1), ((int) (Math.random() * 3) + 0));
        
        map[m1.getyPosMonster()][m1.getxPosMonster()] = m1;
        
        
        int xPosMonster2 = ((int) (Math.random() * 9));
        int yPosMonster2 = ((int) (Math.random() * 9));
        
        while(map[yPosMonster2][xPosMonster2] != null){
            xPosMonster2 = ((int) (Math.random() * 9));
            yPosMonster2 = ((int) (Math.random() * 9));
        }
        Monster m2 = new Monster(xPosMonster2, yPosMonster2,
        ((int) (Math.random() * 30) + 1), (int) (Math.random() * 100) + 1, (int) (Math.random() * 3) + 0);
        
        map[m2.getyPosMonster()][m2.getxPosMonster()] = m2;
        
        
        int xPosMonster3 = ((int) (Math.random() * 9));
        int yPosMonster3 = ((int) (Math.random() * 9));
        
        while(map[yPosMonster3][xPosMonster3] != null){
            xPosMonster3 = ((int) (Math.random() * 9));
            yPosMonster3 = ((int) (Math.random() * 9));
        }
        Monster m3 = new Monster(xPosMonster3, yPosMonster3,
        ((int) (Math.random() * 30) + 1), (int) (Math.random() * 100) + 1, (int) (Math.random() * 3) + 0);
        
        map[m3.getyPosMonster()][m3.getxPosMonster()] = m3;
        
        
        int xPosMonster4 = ((int) (Math.random() * 9));
        int yPosMonster4 = ((int) (Math.random() * 9));
        
        while(map[yPosMonster4][xPosMonster4] != null){
            xPosMonster4 = ((int) (Math.random() * 9));
            yPosMonster4 = ((int) (Math.random() * 9));
        }
        Monster m4 = new Monster(xPosMonster4, yPosMonster4,
        ((int) (Math.random() * 30) + 1), (int) (Math.random() * 100) + 1, (int) (Math.random() * 3) + 0);
        
        map[m4.getyPosMonster()][m4.getxPosMonster()] = m4;
        
        
        int xPosMonster5 = ((int) (Math.random() * 9));
        int yPosMonster5 = ((int) (Math.random() * 9));
        
        while(map[yPosMonster5][xPosMonster5] != null){
            xPosMonster5 = ((int) (Math.random() * 9));
            yPosMonster5 = ((int) (Math.random() * 9));
        }
        Monster m5 = new Monster(xPosMonster5, yPosMonster5,
        ((int) (Math.random() * 30) + 1), (int) (Math.random() * 100) + 1, (int) (Math.random() * 3) + 0);
        
        map[m5.getyPosMonster()][m5.getxPosMonster()] = m5;
        
        
        int xPosMonster6 = ((int) (Math.random() * 9));
        int yPosMonster6 = ((int) (Math.random() * 9));
        
        while(map[yPosMonster6][xPosMonster6] != null){
            xPosMonster6 = ((int) (Math.random() * 9));
            yPosMonster6 = ((int) (Math.random() * 9));
        }
        Monster m6 = new Monster(xPosMonster6, yPosMonster6,
        ((int) (Math.random() * 30) + 1), (int) (Math.random() * 100) + 1, (int) (Math.random() * 3) + 0);
        
        map[m6.getyPosMonster()][m6.getxPosMonster()] = m6;
        
        boolean winStatement = true;
        while(winStatement)
        {
            if(Monster.countMonster == 0){
                System.out.println("U WON!!!!");       
                winStatement = false;
                    }
                    else
                    {
                        winStatement = true;
                    }
            printMap(map);
            //System.out.println(hiro.getxPos() + ", " + hiro.getyPos());
            Scanner kbReader = new Scanner(System.in);
            String direction = kbReader.nextLine( ); 
            if(hiro.validMove(direction)){
                if(direction.equals("p"))
                {
                    if(hiro.getHealthPotion() != 0){
                        Potion.usePotion();
                        hiro.setHealthPotion(-1);
                        System.out.println("your health is now 100 hp");
                        hiro.setFullHealth(100);
                    }
                    else if(hiro.getHealthPotion() == 0){
                        System.out.println("YOU HAVENT GOT ANY HEALTH POTIONS YET!");
                    }
                }
                else if(direction.equals("a"))
                {
                    
                    Object o = map[hiro.getyPos()][hiro.getxPos() - 1];// pull object from map right hiro\
                    
                    if(o == null){ 
                        moveHero(hiro, -1, 0); 
                        map[hiro.getyPos()][hiro.getxPos() + 1] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Potion)
                    {
                        /*Potion p = (Potion) o;
                        p.interact(hiro);*/
                        hiro.setHealthPotion(1);
                        System.out.println("health potion: " + hiro.getHealthPotion());
                        moveHero(hiro, -1, 0); 
                        map[hiro.getyPos()][hiro.getxPos() + 1] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Farmer)
                    {
                        Farmer f = (Farmer) o;
                       
                           f.interact(hiro);
                       if(f.getQuest() == 0){
                           moveHero(hiro, -1, 0); 
                           map[hiro.getyPos()][hiro.getxPos() + 1] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                       }
                    }
                    else if(o instanceof Monster)
                    {
                        Monster m = (Monster) o;
                        m.interact(hiro);
                        if(m.getEscape() != 1){
                            moveHero(hiro, -1, 0); 
                            map[hiro.getyPos()][hiro.getxPos() + 1] = null;
                            map[hiro.getyPos()][hiro.getxPos()] = hiro;
                        }
                    }
                }
                else if(direction.equals("w"))
                {
                   
                   Object o = map[hiro.getyPos() - 1][hiro.getxPos()];// pull object from map above hiro  
                   if(o == null){ 
                        moveHero(hiro, 0, -1); 
                        map[hiro.getyPos() + 1][hiro.getxPos()] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                   }
                   else if(o instanceof Potion)
                   {
                       /*Potion p = (Potion) o;
                       p.interact(hiro);*/
                       hiro.setHealthPotion(1);
                       System.out.println("health potion: " + hiro.getHealthPotion());
                       moveHero(hiro, 0, -1); 
                       map[hiro.getyPos() + 1][hiro.getxPos()] = null;
                       map[hiro.getyPos()][hiro.getxPos()] = hiro;
                   }
                   else if(o instanceof Farmer)
                   {
                       Farmer f = (Farmer) o;
                       
                           f.interact(hiro);
                       if(f.getQuest() == 0){
                           moveHero(hiro, 0, -1); 
                           map[hiro.getyPos() + 1][hiro.getxPos()] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                       }
                   }
                   else if(o instanceof Monster)
                   {
                       Monster m = (Monster) o;
                       m.interact(hiro);
                       
                       if(m.getEscape() != 1){
                            moveHero(hiro, 0, -1); 
                            map[hiro.getyPos() + 1][hiro.getxPos()] = null;
                            map[hiro.getyPos()][hiro.getxPos()] = hiro;
                       }
                   }
                }
                else if(direction.equals("d"))
                {
                    Object o = map[hiro.getyPos()][hiro.getxPos() + 1];// pull object from map right hiro
                    if(o == null){ 
                        
                        moveHero(hiro, 1, 0); 
                        map[hiro.getyPos() ][hiro.getxPos()- 1] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Potion)
                    {
                        /*Potion p = (Potion) o;
                        p.interact(hiro);*/
                        hiro.setHealthPotion(1);
                        System.out.println("health potion: " + hiro.getHealthPotion());
                        moveHero(hiro, 1, 0); 
                        map[hiro.getyPos()][hiro.getxPos() - 1] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Farmer)
                    {
                        Farmer f = (Farmer) o;
                       
                           f.interact(hiro);
                       if(f.getQuest() == 0){
                           moveHero(hiro, 0, -1); 
                           map[hiro.getyPos() + 1][hiro.getxPos()] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                       }
                    }
                    else if(o instanceof Monster)
                    {
                        Monster m = (Monster) o;
                        m.interact(hiro);
                        
                        if(m.getEscape() != 1){
                           moveHero(hiro, 1, 0); 
                           map[hiro.getyPos()][hiro.getxPos() - 1] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                        }
                    }
                }
                else if(direction.equals("s"))
                {
                    Object o = map[hiro.getyPos()+1][hiro.getxPos()];// pull object from map below hiro
                    if(o == null){ 
                        moveHero(hiro, 0, 1); 
                        map[hiro.getyPos() - 1][hiro.getxPos()] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Potion)
                    {
                        /*Potion p = (Potion) o;
                        p.interact(hiro);*/
                        hiro.setHealthPotion(1);
                        moveHero(hiro, 0, 1); 
                        map[hiro.getyPos() - 1][hiro.getxPos()] = null;
                        map[hiro.getyPos()][hiro.getxPos()] = hiro;
                    }
                    else if(o instanceof Farmer)
                    {
                        Farmer f = (Farmer) o;
                       
                           f.interact(hiro);
                       if(f.getQuest() == 0){
                           moveHero(hiro, 0, 1); 
                           map[hiro.getyPos() - 1][hiro.getxPos()] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                       }
                    }
                    else if(o instanceof Monster)
                    {
                        Monster m = (Monster) o;
                        m.interact(hiro);
                        
                        if(m.getEscape() != 1){
                           moveHero(hiro, 0, 1); 
                           map[hiro.getyPos() - 1][hiro.getxPos()] = null;
                           map[hiro.getyPos()][hiro.getxPos()] = hiro;
                        }
                    }
                }
            }
            else
            {
                System.out.println("ERROR MESSAGE");
            }
        }
    }
    
    public static void printMap(Object[][] map){
        
        for(int i = 0; i < map.length; ++i)
        {
            for(int j = 0; j < map[0].length; ++j)
            {
                String s = new String();
                if(map[i][j] == null){
                    s = "X";
                }
                 else if(map[i][j] instanceof Monster){
                    s = "M";
                }
                else if(map[i][j] instanceof Farmer){
                    s = "F";
                }
                else if(map[i][j] instanceof Potion){
                    s = "P";
                } 
                else if(map[i][j] instanceof Hero){
                    s = "H";
                }
                System.out.print(s + ", ");
            }
            System.out.println();
        }
    }
    
}