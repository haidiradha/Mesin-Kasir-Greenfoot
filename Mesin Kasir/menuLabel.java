import greenfoot.*; 
import java.awt.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menuLabel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menuLabel extends Actor
{
    GreenfootImage tampilHar = new GreenfootImage(300,400);
    int total = 0;
    
    public void act() 
    {
        tampilHarga();
    }   
    
    public void tampilHarga(){
        tampilHar.drawRect(0, 0, 300, 350);
        tampilHar.setColor(java.awt.Color.RED);
        tampilHar.fillRect(0, 0, 300, 350);
        tampilHar.setFont(new Font("Calibri",Font.BOLD,20));
        tampilHar.setColor(java.awt.Color.WHITE);
        tampilHar.drawString("Shusi Spread : ",30, 30);
        tampilHar.drawString("Rp."+Menu1.NamaI,50, 50);
        tampilHar.drawString("Lumpiah : ",30, 80);
        tampilHar.drawString("Rp."+Menu2.NamaI2,50, 100);
        tampilHar.drawString("Shabu Shabu : ",30, 130);
        tampilHar.drawString("Rp."+Menu3.NamaI3,50, 150);
        tampilHar.drawString("Chashu Ramen : ",30, 180);
        tampilHar.drawString("Rp."+Menu4.NamaI4,50, 200);
        tampilHar.drawString("Tonkatsu : ",30, 230);
        tampilHar.drawString("Rp."+Menu5.NamaI5,50, 250);
        tampilHar.drawString("Steak Stuffed Lobster : ",30, 280);
        tampilHar.drawString("Rp."+Menu6.NamaI6,50, 300);
        tampilHar.drawString("Total : "+total,30,330);
        if (Menu1.NamaS == "YA"){
            total =+ Menu1.NamaI;
        }
        
    }
    
    public menuLabel(){
        tampilHarga();
        setImage(tampilHar);
    }
}
