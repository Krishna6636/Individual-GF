import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndPage extends World
{

    /**
     * Constructor for objects of class EndPage.
     * 
     */
    public EndPage()
    {    
        super(800, 600, 1); 
        
        addObject(new Menu(), 300, 400);
        addObject(new End(), 500, 400);
    }
    
    public void act() {
        showText("Game Over!", 400, 20);
        showText("Easy!    Score : " + GameWorld1.result, 400, 120);
        showText("Normal!  Score : " + GameWorld2.result, 400, 200);
        showText("Hard!    Score : " + GameWorld3.result, 400, 280);
    }
}
