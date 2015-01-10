import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu1 extends menuLabelCek
{
    public static int NamaI;
    public static String NamaS;
    
    
    public void act() 
    {
        pilihM();
        
    }    
    
    public void pilihM(){
        if(Greenfoot.mouseClicked(this)){
            GreenfootImage HargaM = new GreenfootImage("Harga_Sushi_spread.png");          
            getWorld().getBackground().drawImage(HargaM,21,106);
            NamaS = "YA";
            NamaI = 45000;
        }
    }
}
