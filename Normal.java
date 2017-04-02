import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Normal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Normal extends Level
{
    /**
     * Act - do whatever the Normal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Normal() {
        getImage().scale(220,80);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            StartPage.sound.stop();
            Greenfoot.setWorld(new GameWorld2());
            Greenfoot.playSound("Mousclik.wav");
        }
    }    
}
