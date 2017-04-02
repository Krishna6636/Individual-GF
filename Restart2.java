import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart2 extends Button
{
    /**
     * Act - do whatever the Restart2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Restart2() {
        getImage().scale(80,80);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new GameWorld2());
            GameWorld2.result = 0;
            GameWorld2.timer = 240000;
            GameWorld2.select = 0;
            Greenfoot.playSound("Mousclik.wav");
        }
    } 
}
