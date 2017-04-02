import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuBoy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuBoy extends Actor
{
    /**
     * Act - do whatever the MenuBoy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    private int speed = 6;
    private int left = 250;
    private int right = 600;
    
    public void act() 
    {
        checkTurningPoint();
        setLocation(getX() + speed, getY());
    } 
    
    public boolean turningPoint() {
        return(getX() <= left || getX() >= right);
    }
    
    public void checkTurningPoint() {
        if(turningPoint()) {
            speed = -speed;
        }
    }
    
    public int getSpeed() {
        return speed;
    }
}
