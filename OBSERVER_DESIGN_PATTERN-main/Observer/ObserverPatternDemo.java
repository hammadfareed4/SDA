
package Observer;


public class ObserverPatternDemo {
     public static void main(String[] args) {
         
      Subject subject = new Subject();

      HexaObserver hexa = new HexaObserver(subject);
      OctalObserver octa = new OctalObserver(subject);
      BinaryObserver binary = new BinaryObserver(subject);
      
      
     HexaObserver hexa1 = new HexaObserver(null);
     HexaObserver hexa2 = new HexaObserver();

      System.out.println("First state change: 15");	
      subject.setState(15);
      System.out.println("Second state change: 10");	
      subject.setState(10);
      
      hexa1.detach();
      binary.detach();
      hexa.detach();
      
      // Observers itself attach themselves and detach themselves also
   }

}
