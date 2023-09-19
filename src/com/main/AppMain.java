/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;
import com.Player1.entity.Player1;
import com.Player1.entity.Player2;
/**
 *
 * @author acer
 */
public class AppMain {
    public static void main(String args[]){
      Player1 p=new Player1("kavi","sword",100);
       p.damageByGun1();
       p.damageByGun2();
       p.heal();
        
//        Player2 p1=new Player2(true,10,"kavi","sword");
//        p1.damageByGun1();
//        p1.damageByGun2();
//        p1.heal();
    }
    
}
