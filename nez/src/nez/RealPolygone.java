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
public class RealPolygone {
    SIDe[] sideList;
    
    public RealPolygone (int sideNr)
    {
       sideList = new SIDe[sideNr]; 
    }
    
    

    @Override
    public String toString() {
        
        return "RealPolygone{" + "sideList=" + sideList.length + '}';
    }
    
    public int getsiderNr()
    {
        int number = sideList.length;
        // ecrire le code
        return number;
    }
    
    
    
  
    
}
