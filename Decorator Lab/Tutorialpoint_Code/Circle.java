public class Circle implements Shape {

   private double price = 10.0; 

   @Override
   public void draw() {
      System.out.println("Shape: Circle");
   }

   @Override
   public double getPrice() {
      return price;
   }
}