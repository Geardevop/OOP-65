/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author wallr
 */
public class MmGUI extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    
    public MmGUI(){
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application1", true, true, true);
        frame2 = new JInternalFrame("Application1", true, true, true);
        frame3 = new JInternalFrame("Application1", true, true, true);
        
        frame1.setSize(200, 100);
        frame2.setSize(100, 100);
        frame3.setSize(300, 200);
        frame1.setLocation(200, 100);
        frame2.setLocation(600, 300);
        frame3.setLocation(1000, 100);
        
        frame1.setVisible(true);
        frame2.setVisible(true);
        frame3.setVisible(true);
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        this.add(desktopPane,BorderLayout.CENTER);
        this.setMinimumSize(new Dimension(300, 300));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        this.pack();
        this.setVisible(true);

    }
}
