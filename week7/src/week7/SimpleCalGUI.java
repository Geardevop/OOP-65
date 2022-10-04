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
public class SimpleCalGUI {
    private JFrame fr;
    private JPanel p1;
    private JTextField tf1, tf2, tf3;
    private JButton bnPl, bnMi, bnMu, bnDi;
    
    public SimpleCalGUI(){
        fr = new JFrame("Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new JPanel();
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf2.setEditable(false);
        tf3 = new JTextField();
        tf3.setEditable(false);
        bnPl = new JButton("Plus");
        bnMi = new JButton("Minus");
        bnMu = new JButton("Multiple");
        bnDi = new JButton("Division");
        
        p1.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(4,1));
        
        
        p1.add(bnPl);
        p1.add(bnMi);
        p1.add(bnMu);
        p1.add(bnDi);
        fr.add(tf1);
        fr.add(tf2);
        fr.add(p1);
        fr.add(tf3);
        fr.pack();
        fr.setVisible(true);
      
        
    }
    
}
