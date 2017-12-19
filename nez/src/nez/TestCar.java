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
public class TestCar {
    public static void main(String[] args) {
        Car ferrari;
        ferrari = new Car();
        ferrari.setYear(2017);
        ferrari.setKM(-6);
        ferrari.setlicensePlate("G554544");
        
        System.out.println("The ferrary test "+ ferrari.getDes());
        
        //ferrari.color = "Yellow";
        //ferrari.km = 250;
        //ferrari.licensePlate="65454654687";
        //ferrari.model = "AZ";
        
        //System.out.println( ferrari.getDes());
        
        //ferrari.print();
        
        //for( int i=0; i<=ferrari.lenghth();i++)
        //{
        //}
       

        
    }
    
}
