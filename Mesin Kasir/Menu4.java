import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu4 extends menuLabelCek
{
     public static int NamaI4;
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("Harga_Chashu_ramen.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
            NamaI4 = 30000;
        }
    }  
}
