import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class B2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class B2 extends Back
{
    /**
     * Act - do whatever the B2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public B2() {
        getImage().scale(100,60);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuPage());
            Greenfoot.playSound("Mousclik.wav");
            StartPage.sound.play();
        }
    }  
}
