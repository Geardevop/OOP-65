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
public class ten {
    public static void main(String[] args) {
        String name;
        double weight, numDay1, numDay2, salary1 = 0, salary2= 0;
        int age;
        Scanner tube = new Scanner(System.in);
        System.out.print("Please insert your name : ");
        name = tube.nextLine();
        System.out.print("Please insert your age : ");
        age = tube.nextInt();
        System.out.print("Please insert number of working days : ");
        numDay1 = tube.nextDouble();
        System.out.print("Please insert number of absent days : ");
        numDay2 = tube.nextDouble();
        System.out.print("Please insert your body weight: ");
        weight = tube.nextDouble();
        System.out.println("Hi"+name);
        if(age >=21 && age <=30){
            salary1 = (numDay1*300)-(numDay2*50);
        }else if (age>=31 && age<=40){
            salary1 = (numDay1*500)-(numDay2*50);
        }else if (age>=41 && age<=50){
            salary1 = (numDay1*1000)-(numDay2*25);
        }else if (age>=41 && age<=50){
            salary1 = (numDay1*3000);
        }
        if(weight >= 10 && weight <=60){
            salary1 += 5000;
        }else if (weight >= 61 && weight <= 90){
            salary1 =salary1 + (5000-((weight-60)*10));
        }

        System.out.println("You salary is "+(int)salary1+" Bath");
        System.out.println("You salary and Bonus is "+(int)salary2+" Bath");
    }
}
