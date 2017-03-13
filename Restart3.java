import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart3 extends Button
{
    /**
     * Act - do whatever the Restart3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Restart3() {
        getImage().scale(80,80);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld3());
            GameWorld3.result = 0;
            GameWorld3.timer = 240000;
            GameWorld3.select = 0;
        }
    } 
}
