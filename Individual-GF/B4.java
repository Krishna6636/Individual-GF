import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B4 extends Back
{
    /**
     * Act - do whatever the B4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public B4() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld2());
        }
    }  
}
