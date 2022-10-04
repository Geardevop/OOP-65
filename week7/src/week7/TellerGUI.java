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
public class TellerGUI {
    private JFrame frB;
    private JPanel frF1, frF2, frF3;
    private JButton bnDe, bnWi, bnEx;
    private JLabel labBa, labAm;
    private JTextField tfBa, tfAm;
    public TellerGUI(){
        frB = new JFrame("Teller GUI");
        frF1 = new JPanel();
        frF2 = new JPanel();
        frF3 = new JPanel();
        frB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bnDe = new JButton("Deposit");
        bnWi = new JButton("Withdraw");
        bnEx = new JButton("Exit");
        labBa = new JLabel("Balance");
        labAm = new JLabel("Amonut");
        tfBa = new JTextField("6000",15);
        tfBa.setEditable(false);
        tfAm = new JTextField("0", 15);
        
        frB.setLayout(new GridLayout(3,1));
        frF1.setLayout(new GridLayout(1,2));
        frF2.setLayout(new GridLayout(1,2));
        frF2.setLayout(new GridLayout(1,3));
        
        frF1.add(labBa);
        frF1.add(tfBa);

        
        frF2.add(labAm);
        frF2.add(tfAm);
 
        frF3.add(bnDe);
        frF3.add(bnWi);
        frF3.add(bnEx);
  
        
        frB.add(frF1);
        frB.add(frF2);
        frB.add(frF3);
        
        frB.setSize(30,30);
        frB.setSize(500, 500);
        frB.setVisible(true);
    }
}