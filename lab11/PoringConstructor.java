/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author wallr
 */
import java.awt.*;
import javax.swing.*;
import java.net.URL;
public class PoringConstructor {
    PoringConstructorHandleEvent createPoring;
    private JFrame fr;
    private JPanel p;
    private JButton addBtn;
    Poring poringOBJ;
    public PoringConstructor(){
        createPoring = new PoringConstructorHandleEvent(this);
        fr = new JFrame();
        p = new JPanel();
        addBtn = new JButton("add");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p.setLayout(new FlowLayout());
        p.add(addBtn);
        fr.add(p);
        fr.pack();
        fr.setVisible(true);
        fr.setLocation(500,500);
        addBtn.addActionListener(createPoring);
        
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public void setAddBtn(JButton addBtn) {
        this.addBtn = addBtn;
    }
    
   public static void main(String args[]){
       PoringConstructor test = new PoringConstructor();
  
   }
}
