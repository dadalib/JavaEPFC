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
public class Polygone {
    public static void main(String[] args) {
        RealPolygone triangle  = new RealPolygone(3);
        
        //
        SIDe cote0 =new SIDe(0,0);
        triangle.sideList[0]= cote0;
        
        SIDe cote1 =new SIDe(1,0);
        triangle.sideList[1]= cote0;
        
        SIDe cote2 =new SIDe(0,1);
        triangle.sideList[2]= cote0;
        
        //String s1String = cote0.toString();
        System.out.println("Modifier"+triangle.toString());
        System.out.println("Lenght list : "+triangle.getsiderNr());
        System.out.println("Lenght list : "+triangle.getsiderNr());
        
       
    }
   
    
    
    
    
    
    
}
