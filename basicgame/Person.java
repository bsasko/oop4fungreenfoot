import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person extends Actor 
{
    /**
     * Act - do whatever the Person wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int delay;
    private int delayCounter;
    public Person()
    {
        this(3); // odnosi se na delay
    }
    public Person(int delay)
    {
        this.delay=delay;
        this.delayCounter=0;
    }
    public void act()
    {
        if (this.delayCounter==this.delay)
        {
            this.movement();
            this.delayCounter=0;
        }
        else{
                this.delayCounter++;
            }// Add your action code here.
    }
    public abstract void movement(); // apstraktna metoda - veli se da movement mora biti u klasama ispod - Policeman i Robber
}
