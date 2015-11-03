class NamedCow extends Cow
/*{ private String myName;
public NamedCow(String name){
  myName=name;
}
public NamedCow(){
 myName="Betsy"; 
}
 public String getName(){return myName;}
}*/
 {   protected String myName;
     public NamedCow(String type, String sound,String name)     {         
         myType = type;         
         mySound = sound;  
         myName = name;   
     }     
     public NamedCow()     {         
         myName = "unknown";    
     }      
    
     public String getName(){return myName;}
}
