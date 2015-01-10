import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu6 extends menuLabelCek
{
     public static int NamaI6;
     
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("Harga_Steak_stuffed_lobster.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
            NamaI6 = 30000;
        }
    }   
}
