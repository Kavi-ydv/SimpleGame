/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Player1.entity;

/**
 *
 * @author acer
 */
public class Player1 {
    private String name;
    private String weapon;
    private int health;
    
    public Player1(String name,String weapon,int health){
        this.name=name;
        this.weapon=weapon;
        this.health=health;
    }
    public void damageByGun1(){
        this.health-=30;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("got hit by gun 1 and health is reduced by 30 now new health is"+this.health);
        if(this.health==0)
            System.out.println(getName()+" is dead");
    }
    
    public void damageByGun2(){
        this.health-=50;
        if(this.health<=0){
            this.health=0;
        }
        System.out.println("got hit by gun 2 and health is reduced by 50 now new health is"+this.health);
        if(this.health==0)
            System.out.println(getName()+" is dead");
    }
    
    
    public void heal(){
     if(this.health<=0){
         System.out.println("heal is not possible");
     }
     else{
        this.health=100;
        System.out.println("heal by"+this.health);
         }
     }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

   
    
}
