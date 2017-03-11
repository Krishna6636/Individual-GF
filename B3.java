import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B3 extends Back
{
    /**
     * Act - do whatever the B3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public B3() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld1());
        }
    }  
}
