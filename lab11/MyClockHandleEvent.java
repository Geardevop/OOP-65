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
public class MyClockHandleEvent implements MouseListener  {

    boolean check = true;
    MyClock clock ;
    MyFrame fr;
    
    public MyClockHandleEvent(MyFrame m, MyClock c){
        this.fr = m;
        this.clock = c;
    }
    
    @Override
    public void mouseClicked(MouseEvent e){   

            if(check){
                clock.pauseThread();
                System.out.print("clicked");
                System.out.print(check);
                check = false;
               
            }
            else if(check == false){
                clock.resumeThread();
                check = true;
            }
       }
    @Override
    public void mouseEntered(MouseEvent e) {}  
    @Override
    public void mouseExited(MouseEvent e) {}  
    @Override
    public void mousePressed(MouseEvent e) {
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        
    }  
}
