import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld3 extends World
{

    /**
     * Constructor for objects of class GameWorld3.
     * 
     */
    
    EndPage scoreBoard = new EndPage();
    public static int result = 0;
    public static int select = 0;
    public static int timer = 240000;
    
    int time;
    
    public GameWorld3()
    {    
        // Create a GameWorld3 for Hard Level with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
        addObject(new N1(), 750, 30);
        addObject(new B2(), 65, 20);
        addObject(new Restart3(), 99, 562);
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
        //randomly falling Apple, Poison's Apple and Poison's Leafs
        time++;
        if(time == 60){
            int x = Greenfoot.getRandomNumber(600);
            int y = Greenfoot.getRandomNumber(300);
            int z = Greenfoot.getRandomNumber(300);
            if (x - y >= 130 || y - x >= 130) {
            addObject(new Apple(), x, 0);
            addObject(new AppG(), y, 0);
            addObject(new Leaf(), z, 0);
            }
            time = 0;
        }
    }
    
    public void scoring() {
        showText("Score : " + result, 650, 20);
        
        for(int i=35; i>0; i--) {
            showText("Time : " + (int)(timer/2000), 180, 20);
            timer--;
        }
        
        if(timer==0) {
            Greenfoot.setWorld(scoreBoard);
        }
    }
}
