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
public class Aliment {
    String name;
    Category category;
    double kcal;
    double price;
    
    public Aliment(String name,Category category,double kcal,double price)
    {
        this.name =name; 
        this.category =category; 
        this.kcal =kcal; 
        this.price =price; 
        
    }
    public String  getName()
    {
        return name;
    }
    
    
    public Category  getCatregory()
    {
        return category;
    }
    
    public double  getKcal()
    {
        return kcal;
    }
    
    public double  price()
    {
        return price;
    }

    @Override
    public String toString() {
        return "Aliment{" + "name=" + name + ", category=" + category + ", kcal=" + kcal + ", price=" + price + '}';
    }
    
}
