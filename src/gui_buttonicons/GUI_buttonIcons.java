package gui_buttonicons;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;




public class GUI_buttonIcons extends JFrame implements EventListener{

    private JButton b1;
    private JButton b2;
    
    
    public static void main(String[] args) {
        new GUI_buttonIcons();
    }
    
         
     public GUI_buttonIcons()
     {
          setSize(500,400);
         setTitle("testing icon hovering");
                        //DONT FUCKIN FORGET THIS
         setLayout(new FlowLayout());
         setDefaultCloseOperation(EXIT_ON_CLOSE);
          
         b1= new JButton("I am stupid");
         add(b1);
        
         Icon x= new ImageIcon(getClass().getResource("download.png")); //gets pictures to be displayed on icon from source folder
         Icon y= new ImageIcon(getClass().getResource("coloured.png"));
         b2= new JButton("whatsapp",x);    //shows icon
         b2.setRolloverIcon(y);             // replaced upon hovering
         //b2.setPreferredSize(new Dimension(100,100));   // to adjust button sizze
         add(b2);
          
         theHandler handler = new theHandler();
         b1.addActionListener(handler);
         b2.addActionListener(handler);
        
         setVisible(true);           
         setLocationRelativeTo(null);
     }
    
     public class theHandler implements ActionListener{  //addition of interface
         public void actionPerformed(ActionEvent event){   //method that needs to be overriden for actionlistener command
           
             //pattern:
             //   showMessageDialog(Component parentComponent, Object message, String title, int messageType)
             
JOptionPane.showMessageDialog(null, String.format("%s", event.getActionCommand()), "i am a window", JOptionPane.ERROR_MESSAGE);
// can show error, warning or customized icon aswell
         }
     }
}
