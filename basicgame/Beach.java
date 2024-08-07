import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beach extends World
{
    private int counter; // za kraj igre kada gubimo        
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Beach()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(10, 6, 60); 
        /*this.addObject(new Police("w","s","a","d"),0 ,0 );
        this.addObject(
            new Robber(),
            Greenfoot.getRandomNumber(this.getWidth()),
            Greenfoot.getRandomNumber(this.getHeight())
        );
        this.counter=100;*/  // 100 x pozivanje act metodw
        this.prepareTheBeach();
        
    }
    public void endTheGame(boolean vin)  // Ispis teksta u klasi Beach (početna klasa - canvas)
    {
    this.removeObjects(this.getObjects(Actor.class));
    int x=this.getWidth()/2;
    int y=this.getHeight()/2;
     if(vin){
        this.showText("POBJEDA!", x, y)  ; 
     }else{
        this.showText("IZGUBILI STE!", x, y)  ;  
     }
    Greenfoot.delay(50);
    this.showText(null,x, y);
    this.prepareTheBeach();
    Greenfoot.stop(); 
    }
    public void act()
    {
       this.counter--;  // svaki act smanjuje counter (u početku je 100) - za gubitak
       if(this.counter==0){
           this.endTheGame(false);
       }
    }
    private void prepareTheBeach()
    {
      this.addObject(new Police("w","s","a","d"),0 ,0 );
        // ovo je kod iz početnog Beach konstruktora
      for(int i=0;i<=10;i++){
      int x=0;
      int y=0;
      while(!this.getObjectsAt(x,y,Police.class).isEmpty())
      {
          x=Greenfoot.getRandomNumber(this.getWidth());
          y=Greenfoot.getRandomNumber(this.getHeight());
      } 
      this.addObject(new HidingSpot(), x, y);
      }
        
      
        this.addObject(
            new Robber(),
            Greenfoot.getRandomNumber(this.getWidth()),
            Greenfoot.getRandomNumber(this.getHeight())
        );
        
        this.counter=100;  // 100 x pozivanje act metodw  
    }
}
