import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Leaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Leaf extends Apple
{
    /**
     * Act - do whatever the Leaf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

     public Leaf() {
        getImage().scale(40,40);
    }
    
    public void act() 
    {
        setRotation(getRotation()+5);
        setLocation(getX(), getY()+2);
        
        if(isTouching(Boy.class)) {
            Greenfoot.setWorld(new EndPage());
            Greenfoot.playSound("win.wav");
            //MyWorld.updateScore(point); 
        }
        else if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }  
}
