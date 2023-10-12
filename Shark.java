/**
Nate Brosio
Shark Class
10/11/23
**/


public class Shark extends Animal{
   
   // constructor
   public Shark(String name){
      super(name);
   }
   
   // abstract sound method
   @Override
   public void sound(){
      // Print out shark sound --- not sure if sharks make a lot of noise
      System.out.println("Chomp! Chomp! Chomp!");
   }
   
   // abstract play method
   @Override
   public void play(){
      // Print out what a shark would do for fun
      System.out.println("A shark likes to play by being scratched on the belly.");
   }
   

}