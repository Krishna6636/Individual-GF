import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World
{

    /**
     * Constructor for objects of class StartPage.
     * 
     */
    public StartPage()
    {    
        super(800, 600, 1); 
        
        addObject(new MenuBoy(), getWidth()-350, getHeight()-80);
        addObject(new Start(), 420, 350);
    }
}
