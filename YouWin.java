import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YouWin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWin extends World
{

    /**
     * Constructor for objects of class YouWin.
     * 
     */

    public YouWin()
    {    
        super(800, 600, 1); 
        
        addObject(new Menu(), 300, 400);
        addObject(new End(), 500, 400);
        addObject(new MenuBoy(), getWidth()-350, getHeight()-80);
    }
    
    public void act() {
        showText("                            " + GameWorld1.result, 400, 235);
    }
}
