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
        // Create a new world for menu page with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);

        addObject(new Easy(), 400, 180);
        addObject(new Normal(), 400, 290);
        addObject(new Hard(), 400, 400);
        addObject(new B1(), 62, 19); //back to start page
        addObject(new MenuBoy(), getWidth()-350, getHeight()-80);
        
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
