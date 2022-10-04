import java.util.*;
public class Gearity {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String gear = input.next();
        String name = "Puun";
        for (int i = 0; i < 3; i++) {
            // System.out.println("My name is " + gear);
            System.out.println(gear);
            System.out.println(gear == name);
            if ((gear == "Gear")) {
                System.out.println("I love U<3");
            }
            // else {
            //     System.out.println("I hate U ;(");
            // }
        }
        input.close();
    }
    
}