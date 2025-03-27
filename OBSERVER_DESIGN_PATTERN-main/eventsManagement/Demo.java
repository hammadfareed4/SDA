/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eventsManagement;


public class Demo {
    
    public static void main(String[] args) {
        
        Editor editor = new Editor();
        
        LogOpenListener logOL = new LogOpenListener("/path/to/log/file.txt");
        
        editor.events.subscribe("open", logOL);
        
        EmailNotificationListener eNL = new EmailNotificationListener("admin@example.com");
        
        editor.events.subscribe("save", eNL);
        
        SMSSupportListener sSL = new SMSSupportListener("03487190933");
        
        
        editor.events.subscribe("sendSMS", sSL);
        
        // Unsubsribe:
        editor.events.unsubscribe("open", logOL);
        editor.events.unsubscribe("save", eNL);

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       editor.sendMessage("Once upon a time there was a lion in the jungle of Amazon rain forest!");
//       editor.sendMessage("fjkdfjdkfjdkfjdkfdj fkdjfdkfj dk fjdkf jdkf jdkfj dkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdkf jdk fjdkf djkf djfkd fjdkfjdkfjdkfjdkfjdkfjdkf dfjdk fjdkf jdkf"
//               + "jfkdfjdkfjdddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd");
    }
    
}
