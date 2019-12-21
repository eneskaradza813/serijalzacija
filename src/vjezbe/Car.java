package vjezbe;

import java.io.Serializable;

public class Car implements Serializable{

   
    public String model;
    public int maximumSpeed;
    
    public void setModel(String model){this.model = model;}
    public String getModel(){return this.model;}
    public void setmaximumSpeed(int maximumSpeed){this.maximumSpeed = maximumSpeed;}
    public int maximumSpeed(){return maximumSpeed;}

    @Override
    public String toString() {
        return "model: " + model + " max speed: " + maximumSpeed;
                
    }
    
    
    }
    
    
   
    
    
    
  
    

