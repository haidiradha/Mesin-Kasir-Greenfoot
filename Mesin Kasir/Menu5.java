import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu5 extends menuLabelCek
{
    public static int NamaI5;
    public void act() 
    {
        pilihM();
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("Harga_Tonkatsu.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            
            NamaI5 = 10000;
        }
    }
}
