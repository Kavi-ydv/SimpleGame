

package com.Player1.entity;

public class Player2  extends Player1 {
    private boolean armour;
    private int health;

    public Player2(boolean armour, int health, String name, String weapon) {
        super(name, weapon, health);
        this.armour = armour;
        this.health = health;
    }

    @Override
    public void damageByGun1() 
    {
        if(armour)
            {
            this.health-=20;
            if(this.health<=0)
                this.health=0;
                System.out.println("Armour is on.got hit by gun 1.health is reduced by 20 and new health is"+this .health);
            }
        if(!armour)
        {
            this.health-=40;
            if(this.health<=0)
                this.health=0;
                System.out.println("Armour is off.got hit by gun 1.health is reduced by 40 and new health is"+this .health);
         }
         if(this.health==0)
         {
           System.out.println(" player is dead");
         }
                
          
     }

    @Override
    public void damageByGun2() {
        if(armour)
            {
            this.health-=40;
            if(this.health<=0)
                this.health=0;
                System.out.println("Armour is on.got hit by gun 1.health is reduced by 40 and new health is"+this .health);
            }
        if(!armour)
        {
            this.health-=50;
            if(this.health<=0)
                this.health=0;
                System.out.println("Armour is off.got hit by gun 1.health is reduced by 50 and new health is"+this .health);
         }
         if(this.health==0)
         {
           System.out.println(" player is dead");
         }
                
    }
    public void heal(){
        if(this.health<=0){
            System.out.println("can not heal");
        }
        else
            this.health=100;
        System.out.println("heal by"+this.health);
    }
       
      
    

    
    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    
    
    
}
