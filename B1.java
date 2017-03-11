import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B1 extends Back
{
    /**
     * Act - do whatever the B1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public B1() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new StartPage());
        }
    } 
}
