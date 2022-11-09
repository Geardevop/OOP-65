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
import java.util.*;
public class MyFrame {
    private JFrame jf;
    private Thread t;
    private MyClock clock;
    private JLabel jl;
    MyClockHandleEvent handleEvent;
    public MyFrame(){
        jl = new JLabel();
        clock = new MyClock();
        jf = new JFrame();
        t = new Thread(clock);
        t.start();
        jl.setLayout(new FlowLayout());
        jl.add(clock);
        jf.add(jl);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.pack();
        jf.setVisible(true);
         handleEvent = new MyClockHandleEvent(this, clock);
        
       jl.addMouseListener(handleEvent);
        
    }

    public JLabel getJl() {
        return jl;
    }

    public void setJl(JLabel jl) {
        this.jl = jl;
    }
    
    public static void main(String args[]){
        MyFrame test = new MyFrame();

    }
}
