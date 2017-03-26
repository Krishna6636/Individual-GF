import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuPage extends World
{
    
    
    /**
     * Constructor for objects of class MenuPage.
     * 
     */
    public MenuPage()
    {    
        super(800, 600, 1);
        
        addObject(new Easy(), 400, 180);
        addObject(new Normal(), 400, 290);
        addObject(new Hard(), 400, 400);
        addObject(new B1(), 50, 30);
        addObject(new MenuBoy(), getWidth()-350, getHeight()-80);
    }
    
    
}
