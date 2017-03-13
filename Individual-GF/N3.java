import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class N3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class N3 extends Next
{
    /**
     * Act - do whatever the N3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public N3() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new EndPage());
        }
    }  
}
