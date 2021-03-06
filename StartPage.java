import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartPage extends World
{
    static GreenfootSound sound = new GreenfootSound("gameplay1.wav");
    
    /**
     * Constructor for objects of class StartPage.
     * 
     */
    public StartPage()
    {    
         // Create a new world for front start page with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        prepare();
        
        addObject(new MenuBoy(), getWidth()-350, getHeight()-80);
        addObject(new Start(), getWidth()/2, 260);
        addObject(new HowTo(), getWidth()/2, 390);
        

    }
    
    public void prepare(){
        Title title = new Title();
        addObject(title, getWidth()/2, 90);
    }
    
    boolean play = false;
    public void act()
    {
        //play sound correctly
        if(!play) {
            sound.play();
            play = true;
        }
    }
}
