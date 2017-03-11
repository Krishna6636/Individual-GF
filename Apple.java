import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Apple() {
        getImage().scale(40,40);
    }
    
    public void act() 
    {
        setRotation(getRotation()+5);
        setLocation(getX(), getY()+2);
        
        if(isTouching(Boy.class)) {
            getWorld().removeObject(this);
            GameWorld1.result++;
        }
        else if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}