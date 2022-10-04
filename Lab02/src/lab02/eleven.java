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
public class eleven {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = inputInt.nextDouble();
        Scanner inputString = new Scanner(System.in);
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        String type = inputString.nextLine();
        if(type.equals("A")){
            money *= 1.015;
        } else if(type.equals("B")){
            money *= 1.02;
        } else if(type.equals("C")){
            money = money + (money*1.015);
        } else{
            money *= 1.05;
        }
        System.out.println("Your total money in one year = "+(int)money);
    }
}

   
