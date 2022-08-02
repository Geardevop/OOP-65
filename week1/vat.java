import java.util.*;
public class vat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double money = input.nextDouble();
        double result;
        result = (money * 107)/100;
        System.out.print(result);
    }
    
}
