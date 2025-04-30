public class RedShapeDecorator extends ShapeDecorator {

   private double redCost = 5.0;

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);
   }

   @Override
   public void draw() {
      decoratedShape.draw();
      setRedBorder(decoratedShape);
      System.out.println("Total Cost: " + computeCost()); 
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }

   @Override
   public double getPrice() {
      return decoratedShape.getPrice() + redCost;
   }

   @Override
   public double computeCost() {
      return getPrice(); 
   }
}
