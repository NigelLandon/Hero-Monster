public class Hero
{
    private int xPos;
    private int yPos;
    private int health;
    private Weapon heroWeapon;
    private Armor heroArmor;
    private int healthPotion;
    public Hero(int XPos, int yPos, int health,Weapon heroWeapon,Armor heroArmor )
    {
        this.xPos = xPos;
        this.yPos = yPos;
        this.health = health;
        this.heroWeapon = heroWeapon; //new Weapon("dagger", 10, 30);
        this.heroArmor = heroArmor; //new Armor("no armor", 0);
        this.healthPotion = 0;
    } 
    
    public boolean validMove(String input){
        if(input.equals("a") && xPos == 0){
            return false;
        }
        else if(input.equals("d") && xPos == 9){
            return false;
        }
        else if(input.equals("w") && yPos == 0){
            return false;
        }
        else if(input.equals("s") && yPos == 9){
            return false;
        }
        else{
            return true;
        }
    }
    
    public int getArmor(){
        return heroArmor.getDamageReduct();
    }
    
    public int getAttack(){
        return heroWeapon.attackMonster();
    }
    
    public int getHealth()
    {
        return health;
    }
    
    public int getHealthPotion()
    {
        return healthPotion;
    }
    
    public void setHealthPotion(int p){
        healthPotion = healthPotion + p;
    }
    
    public int getxPos()
    {
        return xPos;
    }
    
    public int getyPos()
    {
        return yPos;
    } 
    
    public void setX(int xIncrement){
        xPos = xPos + xIncrement;
        if(xPos < 0){
            xPos = 0;
            System.out.println("you cannot move left");
        }
    }
    
    public void setY(int yIncrement){
        
        yPos = yPos + yIncrement;
        if(yPos < 0){
            yPos = 0;
            System.out.println("you cannot move down");
        }
    }
    
    public void setWeapon(Weapon sword){
        heroWeapon = sword;
    }
    
    public void setHealth(int damage){
         health = health - damage;
    }
    
    public void setFullHealth(int restoreHealth){
        health = restoreHealth;
    }
    
    public void setArmor(Armor armor){
         heroArmor = armor;
    }
    /*public boolean moveHero(String input){
        if(input == "a")
                {
                    
                    xPos = 0;
                    yPos = 0;
                    xPos = setX(-1);//left
                    
                }
                else if(direction == "w")
                {
                    x = 0;
                    y = 0;
                    hiro.setY(1);//up
                    
                }
                else if(direction == "d")
                {
                    x = 0;
                    y = 0;
                    hiro.setX(1);//right
                        
                }
                else if(direction == "s")
                {
                    x = 0;
                    y = 0;
                    hiro.setY(-1);//down
                    
              } 
        
    } */ 
}