
package buttonexample;
import java.awt.*;
import java.awt.event. *;

public class ButtonExample extends Frame{
    public static void main(String[] args) {
        Button okButton = new Button("Ok");
        Button cancelButton = new Button("cancel");
        
        
        Frame frame = new Frame ("Button Example");
        frame.setSize(300,300);
        frame.setLayout(new FlowLayout());
        System.out.println("Button label = " + okButton.getLabel());
        cancelButton.setLabel("you can not click me");
        cancelButton.setEnabled(false);
        frame.add(okButton);
        frame.add(cancelButton);
      
            }
        }
               

 
               
            
        
            
        

                
    


    

