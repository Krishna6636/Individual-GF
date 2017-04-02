import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart1 extends Button
{
    /**
     * Act - do whatever the Restart1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Restart1() {
        getImage().scale(80,80);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld1());
            GameWorld1.result = 0;
            GameWorld1.timer = 240000;
            GameWorld1.select = 0;
        }
    }   
}
