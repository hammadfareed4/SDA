
package Observer;



public class BinaryObserver extends Observer{
    
   public BinaryObserver() {
       System.out.println("You are observer but you didn't not subsribe to any of the subject");
   }

   public BinaryObserver(Subject subject){
          this.subject = subject;
          
      if(this.subject != null) subject.attach(this);
      else System.out.println("You are observer but you didn't not subsribe to any of the subject");
   }

   @Override
   public void update() {
      System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) ); 
   }
   
   
   public void detach() {
       if(subject != null) {
            subject.detachObserver(this);
            System.out.println("Binary Observer you are successfully detached");
       }else {
           System.out.println("First subscribe then un-subsribe");
       }
   }
}
