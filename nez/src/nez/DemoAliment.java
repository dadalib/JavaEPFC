/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nez;

import com.oracle.jrockit.jfr.Producer;
import javax.swing.GroupLayout;

/**
 *
 * @author 2104dalibioulleanzul
 */
public class DemoAliment {
    public static void main(String[] args) {
        Aliment[] produitList = new Aliment[10];
        //produitList[0] = new Aliment("cornichon","legumes" ,60,1);
        Category cat= new Category("Viande");
        Category[] cat2 = new Category[3];
        
        
        //String catV = ne 
        
        produitList[0] = new Aliment("cornichon",cat ,60,1);
        
        //for (Aliment aliment : produitList) 
        //{
           
        
        //}
        
        
        
        
    }
    
}
