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
public class MyClock extends JLabel implements Runnable {
    public int sec = 0;
    public int min = 0;
    public int hour = 0;
    private boolean paused;
    
    
     public synchronized void checkPause(){
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
 
        
//            while(true){
//                 try{
//                    Calendar d = Calendar.getInstance();
//                    int sec = d.get(Calendar.SECOND);
//                    int min = d.get(Calendar.MINUTE);
//                    int hour = d.get(Calendar.HOUR_OF_DAY);
//                    String time = String.format("%02d:%02d:%02d", hour,min,sec);
//                    this.setText(hour+":"+min+":"+sec);
//                    Thread.sleep(1000);
//                     }catch(Exception ae){
//                        ae.getStackTrace();
//                       }
//    }
                
//            while(true){
//                 try{
//                    this.setFont(new Font("Tahoma",Font.BOLD, 80));
//                    String time = String.format("%02d:%02d:%02d", hour,min,sec);
//                    this.setText(time);
//                    Thread.sleep(10);
//                    sec += 1;
//                    if(sec == 60){
//                        min += 1;
//                        sec = 0;
//                    }
//                    if(min == 60){
//                        hour += 1;
//                        min = 0;
//                    }
//                    if(hour == 24){
//                        hour = 0;
//                        min = 0;
//                        sec= 0;
//                
//                    }
//                     }catch(Exception ae){
//                        ae.getStackTrace();
//                       }
//                 
//    }

                try{
                    while(true){
                                System.out.print(paused);
                                checkPause();
                                this.setFont(new Font("Tahoma",Font.BOLD, 80));
                                String time = String.format("%02d:%02d:%02d", hour,min,sec);
                                this.setText(time);
                                Thread.sleep(100);
                                sec += 1;
                                  if(sec == 60){
                                      min += 1;
                                      sec = 0;
                                  }
                                if(min == 60){
                                      hour += 1;
                                      min = 0;
                                  }
                                if(hour == 24){
                                      hour = 0;
                                      min = 0;
                                      sec= 0;

                                  }
                                }

             }catch(Exception ae){
                 ae.getStackTrace();
              }


            


    }
}
