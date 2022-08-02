
import java.util.*;

public class twenty {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float sec;
        System.out.print("Input : Hour :   ");
        float hour = input.nextFloat();
        System.out.print("        Mins:   ");
        float minute = input.nextFloat();
        sec = (hour * 3600) + (minute * 60);
        System.out.println("Input : Hour :   " + (int) hour + "  .");
        System.out.println("Input : Hour :   " + (int) minute + "  .");
        System.out.println("Ouput : Secs  =   " + (int) sec);
    }

}
