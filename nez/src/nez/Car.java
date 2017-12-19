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
    public String getlicensePlate()
    {
        return licensePlate;
    }
    
    public void setlicensePlate( String licensePlate)
    {
        if(licensePlate.length() !=7) return;
        /*
        if('A' <= licensePlate.charAt(0) && licensePlate.charAt(0) <='Z')
        {
            this.licensePlate = licensePlate;
        }
*/
        if(licensePlate.substring(0,1).matches("[A-Z].*"))
        //if(licensePlate.substring(0,1).matches("[A-Z]"))
        {
            System.out.println("R");
            this.licensePlate = licensePlate;
        }
    }
    
    public int  getKM()
    {
        return km;
    }
    public void setKM(int km){
        if ( 0<= km && km <1000000)
        {
          this.km =km;
            System.err.println("Error 0<km<10000000 ");
        }
        
    }
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String color)
    {
        if(color.equals("blanc"))
        {
            this.color = color;
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
