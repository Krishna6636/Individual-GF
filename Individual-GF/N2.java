import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class N2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N2 extends Next
{
    /**
     * Act - do whatever the N2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public N2() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld3());
        }
    }    
}
