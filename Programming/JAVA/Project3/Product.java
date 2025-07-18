/*
   Name: Jefferson T. Kim
   Date: 11/07/2021
   Course/Section: IT 206.DL2
   Assignment: Lab 9 

 * In this file, do the following things:
 * 1) Modify the class so that a Product object cannot be created. Instead, only subclass objects of
 *    Product can be created
 * 2) Modify the class so that all Product objects must use the Sellable interface
 */
 

public class Product implements Sellable {
   private String title;
   private double cost;
  
   public Product(String title, double cost) {
      this.title = title;
      this.cost = cost;
   }
  
   public String getTitle() { return this.title; }
   public double getCost() { return this.cost; }


   public void Sellable(String title, double cost) {
      }

   public String toString() {
      return "Title: " + getTitle();
   }  
}

//*********************************************************

