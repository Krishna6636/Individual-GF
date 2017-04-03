import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowTo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends Button
{
    /**
     * Act - do whatever the HowTo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public HowTo() {
        getImage().scale(300,100);

        getImage().scale(300,100);

        getImage().scale(250,100);

    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HowToPlay());
            Greenfoot.playSound("Mousclik.wav");
        }
    }
}
