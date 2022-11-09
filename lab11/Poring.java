/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab11;
import java.awt.*;
import javax.swing.*;
import java.net.URL;
import java.lang.Math;   

public class Poring  extends Thread{
    private boolean paused;
    int min = 100;  
    int max = 1000;  
    private JFrame fr;
    private JLabel labelPicture;
    private JTextArea textShownum;
    private Handleporing handleEvent;
    public int randoma = (int)(Math.random()*(max-min+1)+min);  
    public int randomb = (int)(Math.random()*(max-min+1)+min);
    public   Poring(){
        synchronized (this){
        handleEvent = new Handleporing(this);
        ImageIcon icon = new ImageIcon("C:\\Users\\wallr\\OneDrive\\Desktop\\poring04-300x219.png");
        fr = new JFrame("Poring");
        textShownum = new JTextArea("0");
        textShownum.setEditable(false);
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setLayout(new FlowLayout());
        labelPicture = new JLabel(icon);
        fr.add(labelPicture);
        fr.add(textShownum);
        fr.setLocation(randoma, randomb);
        fr.pack();
        fr.setVisible(true);
        labelPicture.addMouseListener(handleEvent);
        
        }
        
    }
    
    public synchronized void checkPause(){
        System.out.print(paused);
        while(paused){
            try{
                this.wait();
           }catch(InterruptedException ex){
               ex.printStackTrace();
           }
        }
    }
    public void pauseThread(){
        paused = true;
    }    
    public synchronized void resumeThread(){
        paused = false;
        this.notify();
    }
   public void run(){
        try{
            while(true){
                checkPause();
                 Thread.sleep(1000);
                    for(int i = 1; i < 20 ;i++){
                        for(int j = 20;j > 1 ; j--){
                        fr.setLocation(randoma+i+j, randomb+i+j);
                        fr.setLocation(randoma-i-j, randomb-i-j);
                        }
                    }
            }
 
        }catch(Exception a){
            System.out.print(a);
        }
   
    }
    public JTextArea getTextShownum() {
        return textShownum;
    }

    public void setTextShownum(JTextArea textShownum) {
        this.textShownum = textShownum;
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JLabel getLabelPicture() {
        return labelPicture;
    }

    public void setLabelPicture(JLabel labelPicture) {
        this.labelPicture = labelPicture;
    }

    
  
  
}
