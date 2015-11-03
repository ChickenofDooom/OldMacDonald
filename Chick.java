class Chick implements Animal 
{  private String myType;     
     private String mySound;      
     public Chick(String type, String sound, String other)     {         
         myType = type;         
         if (Math.random()<.5){
           
         mySound = sound;
         }
        else
         mySound=other;    
     }         
     public Chick()     {         
         myType = "Chick";         
         mySound = "Cluck";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
     
     
}
