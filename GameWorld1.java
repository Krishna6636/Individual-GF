import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld1 extends World
{

    /**
     * Constructor for objects of class GameWorld1.
     * 
     */
    
    EndPage scoreBoard = new EndPage();
    public static int result = 0;
    public static int select = 0;
    public static int timer = 240000;
    
    int time;
    
    public GameWorld1()
    {    
        super(800, 600, 1); 
        
        addObject(new Boy(), getWidth()-700, getHeight()-232);
        addObject(new C1(), getWidth()-740, getHeight()-115);
        addObject(new C2(), getWidth()-70, getHeight()-385);
        addObject(new Jump(), getWidth()-350, getHeight()-300);
        addObject(new Jump(), getWidth()-550, getHeight()-470);
        addObject(new N1(), 750, 30);
        addObject(new B2(), 50, 30);
        addObject(new Restart1(), 99, 562);

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
            time = 0;
        }
    }
    
    public void scoring() {
        showText("Score : " + result, 650, 20);
        
        for(int i=35; i>0; i--) {
            showText("Time : " + (int)(timer/2000), 150, 20);
            timer--;
        }
        
        if(timer==0) {
            Greenfoot.setWorld(scoreBoard);
        }
    }
}
