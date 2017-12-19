/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nez;

/**
 *
 * @author 2104dalibioulleanzul
 */
public class Car {
    private String licensePlate;
    private int year;
    private String color;
    private int  km;
    private String model;
    
    public void setYear(int value)
    {
        if(value > 1900 && value < 2100 )
        {
            year = value;
        }
        /*
        else 
        {
         throw new Exception("Not valid year"+value);
         
        }
      */
    }
    
    public int  getKM()
    {
        return km;
    }
    public void setKM(int km){
        if ( 0<= km && km <1000000)
        {
          this.km =km;
        }
        
    }
       
    
            
    String getDes()
    {
        return 
                "LP : "+ licensePlate+ "\n"+
                "Y : "+year + "\n"+
                "C : "+ color + "\n"+
                "Km: "+ km + "\n"+
                "M: " + model  ;
        
    }
    
    
  

}
