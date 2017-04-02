import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Button
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Menu(){
        getImage().scale(150,150);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MenuPage());
            StartPage.sound.play();
            
            GameWorld2.result = 0;
            GameWorld2.timer = 240000;
            GameWorld2.select = 0;
            
            GameWorld1.result = 0;
            GameWorld1.timer = 240000;
            GameWorld1.select = 0;
            
            GameWorld3.result = 0;
            GameWorld3.timer = 240000;
            GameWorld3.select = 0;
        }
    }   
}
