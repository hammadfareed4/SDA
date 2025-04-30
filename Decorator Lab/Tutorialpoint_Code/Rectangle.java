public class Rectangle implements Shape {

   private double price = 15.0; 

   @Override
   public void draw() {
      System.out.println("Shape: Rectangle");
   }

   @Override
   public double getPrice() {
      return price;
   }
}