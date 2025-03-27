
package Observer;


public class OctalObserver extends Observer{

    public OctalObserver() {
           System.out.println("You are observer but you didn't not subsribe to any of the subject");
    }
    
   public OctalObserver(Subject subject){
         this.subject = subject;
      if(this.subject != null) subject.attach(this);
      else System.out.println("You are observer but you didn't not subsribe to any of the subject");
   }

   @Override
   public void update() {
     System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) ); 
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

