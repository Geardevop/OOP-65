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
public class Handleporing implements MouseListener{
    Poring poringobj;
    public Handleporing(Poring poring){
        this.poringobj = poring;
    }
    public void mouseClicked(MouseEvent e){
        if(e.getSource().equals(poringobj.getLabelPicture())){
         poringobj.pauseThread();
         poringobj.getFr().dispose();
        }
        else{
            poringobj.resumeThread();
        }
           } 
    
       

    public void mouseEntered(MouseEvent e) {}  
    public void mouseExited(MouseEvent e) {}  
    public void mousePressed(MouseEvent e) {
       
    }  
    public void mouseReleased(MouseEvent e) {}  
}
