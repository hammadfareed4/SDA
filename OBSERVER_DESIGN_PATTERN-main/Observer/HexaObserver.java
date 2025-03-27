package Observer;


public class HexaObserver extends Observer{

    public HexaObserver() {
        System.out.println("You are observer but you didn't not subsribe to any of the subject");
    }
  
    public HexaObserver(Subject subject){
        this.subject = subject;
      if(this.subject != null) subject.attach(this);
      else System.out.println("You are observer but you didn't not subsribe to any of the subject");

   }

   @Override
   public void update() {
      System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() ); 
   }
   
      public void detach() {
       if(subject != null) {
            subject.detachObserver(this);
          System.out.println("Hexa Observer you are successfully detached");
       }else {
           System.out.println("First subscribe then un-subsribe");
       }
   }
}
