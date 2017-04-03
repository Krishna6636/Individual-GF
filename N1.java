import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class N1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N1 extends Back
{
    /**
     * Act - do whatever the N1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public N1() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new EndPage());
            Greenfoot.playSound("Mousclik.wav");
            Greenfoot.playSound("win.wav");
        }
    }    
}
