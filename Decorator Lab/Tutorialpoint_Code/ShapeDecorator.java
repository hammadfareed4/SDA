public abstract class ShapeDecorator implements Shape {
   protected Shape decoratedShape;

   public ShapeDecorator(Shape decoratedShape){
      this.decoratedShape = decoratedShape;
   }

   @Override
   public void draw(){
      decoratedShape.draw();
   }

   @Override
   public double getPrice() {
      return decoratedShape.getPrice(); 
   }

   
   public double computeCost() {
      return getPrice(); 
   }
}