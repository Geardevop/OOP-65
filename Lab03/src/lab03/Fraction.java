/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab03;

/**
 *
 * @author wallr
 */
public class Fraction {
    public int topN;
    public int btmN;
    
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN  = 2;
        f1.btmN = 5;
        Fraction f2 = new Fraction();
        f2.topN = 3;
        f2.btmN = 7;
        System.out.println("before "+ f1.toFraction());
        System.out.println("before "+ f1.toFloat());
        f1.addFraction(f2);
        System.out.println("after "+ f1.toFraction());
        System.out.println("after "+ f1.toFloat());
    }
//    public static void main(String[] args) {
//        Fraction f1 = new Fraction();
//        f1.topN = 1;
//        f1.btmN = 3;
//        Fraction f2 = new Fraction();
//        f2.topN = 4;
//        f2.btmN = 16;
//        Fraction f3 = new Fraction();
//        f3.topN = 5;
//        f3.btmN = 15;
//
//        System.out.println(f1.toFloat());
//        System.out.println(f2.toFloat());
//        System.out.println(f3.toFloat());
//        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
//        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));
//        System.out.println("Before : " + f2.toFraction());
//        f2.LowestTermFrac();
//        System.out.println("After : " + f2.toFraction());
//    }

    public String toFraction(){
        return topN+"/"+btmN;//why cant use ''
    }
    public String toFloat(){
        double result = (double)topN / (double)btmN;
        String text = Double.toString(result);
        return text;
    }
    public void  addFraction(Fraction f){
        if (f.btmN == btmN){
            topN = f.topN + topN;
        }
        else {
            topN = topN *f.btmN+f.topN*btmN;
            btmN = btmN * f.btmN;
        }
    }
    public boolean myEquals(Fraction x){
        double r1, r2, a = topN , b = x.topN, c = btmN, d = x.btmN;
        r1 = a*d;
        r2 = b*c;
        return (r1 == r2);
    }
    public void LowestTermFrac(){
        int d ;
        d = __gcd(topN, btmN);
        topN = topN / d;
        btmN = btmN / d;
       
    }
    public int __gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return __gcd(b, a%b);
    }
}
