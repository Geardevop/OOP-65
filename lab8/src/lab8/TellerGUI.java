


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TellerGUI implements ActionListener{
    private Account account = new Account(6000, "gear"); //  why set account in constructor of Teller name will get null
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
        tfBa = new JTextField(account.getBalance()+"",15);
        tfAm = new JTextField("0", 15);
        
        bnDe.addActionListener(this);
        bnWi.addActionListener(this);
        bnEx.addActionListener(this);
        
    
        
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
    
   
    public static void main(String[] args) { 
        new TellerGUI();
 
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource().equals(bnWi)){
           account.deposit(Double.parseDouble(tfAm.getText()));
           
       }
       if(ae.getSource().equals(bnDe)){
           account.withdraw(Double.parseDouble(tfAm.getText()));
       }
       if(ae.getSource().equals(bnEx)){
           System.exit(0);
       }
       System.out.print(account.getBalance());
       tfBa.setText(account.getBalance()+"");
    }
}
