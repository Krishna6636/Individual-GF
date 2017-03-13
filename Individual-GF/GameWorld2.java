import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld2 extends World
{

    /**
     * Constructor for objects of class GameWorld2.
     * 
     */
    
    EndPage scoreBoard = new EndPage();
    public static int result = 0;
    public static int select = 0;
    public static int timer = 60000;
    
    int time;
    
    public GameWorld2()
    {    
        super(800, 600, 1); 
        
        addObject(new N2(), 750, 30);
        addObject(new B3(), 50, 30);
        addObject(new Restart2(), 50, 550);
        addObject(new Boy(), getWidth()-700, getHeight()-232);
        addObject(new C1(), getWidth()-740, getHeight()-115);
        addObject(new C2(), getWidth()-70, getHeight()-385);
        addObject(new Jump(), getWidth()-350, getHeight()-300);
        addObject(new Jump(), getWidth()-550, getHeight()-470);

        time = 0;
    }
    
    public void act() 
    {
        fallTime();
        scoring();
    }
    
    public void fallTime() {
        time++;
        if(time == 60){
            addObject(new Apple(), Greenfoot.getRandomNumber(600), 0);
            addObject(new AppG(), Greenfoot.getRandomNumber(300), 0);
            time = 0;
        }
    }
    
    public void scoring() {
        showText("Score : " + result, 650, 20);
        
        for(int i=30; i>0; i--) {
            showText("Time : " + (int)(timer/2000), 150, 20);
            timer--;
        }
        
        if(timer==0) {
            Greenfoot.setWorld(scoreBoard);
        }
    }
}
