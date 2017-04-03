import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DataInput here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataInput extends World
{

    /**
     * Constructor for objects of class DataInput.
     * 
     */
    public DataInput()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(new Input(), getWidth()/2, (getHeight()/2)- 35);
        addObject(new Play(), getWidth()/2, 300);
        showText("Enter your name",(getWidth()/2), (getHeight()/2) - 66);
    }
}
