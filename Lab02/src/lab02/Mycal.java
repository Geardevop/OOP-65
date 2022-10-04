/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author wallr
 */
import java.util.*;
public class Mycal {
      public static void main(String[] args) {
        double salary;
        double pay;
        Scanner tube = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        salary = tube.nextDouble();
        if (salary > 50000.00){
            pay = 0.1 * salary;
        }else{
            pay = 0.05 * salary;
        }
        System.out.println(pay);
    }
    
}
 