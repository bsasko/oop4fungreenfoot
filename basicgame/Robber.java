import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class Robber extends Person
{
    //private int delay;
    //private int delayCounter;
    
    /**
     * Act - do whatever the Robber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Robber(){
        super(3);          
    }
    
    /*public void act()
    {
        super.act();  // act metoda se nasljeđuje iz Person klase - apstraktna klasa
    } */
    public void movement()
    {
        this.setRotation(90*Greenfoot.getRandomNumber(4));
        this.move(1);
    }
}
