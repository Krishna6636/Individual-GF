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
        getImage().scale(220,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld3());
        }
    }    
}