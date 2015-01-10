import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu2 extends menuLabelCek
{
    public static int NamaI2;
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("Harga_Lumpia.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
            NamaI2 = 10000;
        }
    }   
}
