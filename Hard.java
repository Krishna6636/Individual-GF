import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Level
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hard() {
        getImage().scale(220,80);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            StartPage.sound.stop();
            Greenfoot.setWorld(new GameWorld3());
            Greenfoot.playSound("Mousclik.wav");
        }
    }    
}
