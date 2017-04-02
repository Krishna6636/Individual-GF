import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boy extends Actor
{
    /**
     * Act - do whatever the Boy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage image1 = new GreenfootImage("h1.png");
    GreenfootImage image2 = new GreenfootImage("h2.png");
    
    private double vSpeed = 0.0;
    private final double jumps = 16;
    private final double gravity = 1.2;
    private final int speed = 5;
    
    public void act() 
    {
       checkKeyPress();
       checkSkip();
       checkOnGround();
    }
    
    public void checkKeyPress() {
        if(Greenfoot.isKeyDown("right")){
            setImage(image1);
            setLocation(getX()+3, getY());
        }
        if(Greenfoot.isKeyDown("left")){
            setImage(image2);
            setLocation(getX()-3, getY());
        }
        if(Greenfoot.isKeyDown("space")){
            jump();
        }
    }
    
    public boolean onGround() {
        if(isTouching(Cliff.class) || isTouching(Jump.class)){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void checkOnGround() {
        if(onGround()) {
            vSpeed = 0.0;
        }
        else {
            fall();
        }
    }
    
    public void jump() {
        if(onGround()){
            vSpeed = -jumps;
            fall();
        }
    }

    public void fall() {
       vSpeed = vSpeed + gravity;
       setLocation(getX(), (int)(getY()+vSpeed));
       if(getY()>getWorld().getHeight()-2) {
           getWorld().removeObject(this);
           Greenfoot.setWorld(new EndPage());
           Greenfoot.playSound("win.wav");
       } 
    }
    
    public void checkSkip(){
        int y = getImage().getHeight()/2;
        Jump ju = (Jump)getOneObjectAtOffset(0, y, Jump.class);
        if(ju!=null){
            setLocation(getX() + ju.getSpeed(), getY());
        }
    }
}
