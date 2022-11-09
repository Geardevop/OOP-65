/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;

/**
 *
 * @author wallr
 */
import java.awt.event.*;

public class PoringConstructorHandleEvent implements ActionListener{
    int min = 100;  
    int max = 1000;
    public int randoma = (int)(Math.random()*(max-min+1)+min);  
    public int randomb = (int)(Math.random()*(max-min+1)+min);
    PoringConstructor poringCon;
    public int count = 0;
    Poring poringobj;
    public PoringConstructorHandleEvent(PoringConstructor p){
        this.poringCon = p;
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(poringCon.getAddBtn())){
            poringobj = new Poring();
            count+=1;
            poringobj.getTextShownum().setText(count+"");
            poringobj.start();
    
        }
    }
}
