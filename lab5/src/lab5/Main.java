/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author wallr
 */
//test
//public class Main {
// public static void main(String[] args) {
// Account a1 = new Account();// Account have method constructor that require double and String; 
// //because we define constructor already that why java will not add default constructir
// 
// a1.showAccount();
//    }
//}
//test 2
//public class Main {
// public static void main(String[] args) {
// Account a1 = new Account(50000,"61070033");
// a1.showAccount();
// a1.deposit(500);
// a1.showAccount();
// a1.withdraw(40000);
// a1.showAccount();
// }
//}
//test CheckingAccout
public class Main {
 public static void main(String[] args) {
    CheckingAccount a1 = new CheckingAccount(50000,"61070033",5000);
    a1.showAccount();
    a1.deposit(500);
    System.out.println(a1);
    a1.withdraw("60000");
    System.out.println(a1.toString()); 
    }
}
//test 2
//public class Main {
// public static void main(String[] args) {
// CheckingAccount a1 = new CheckingAccount();
// a1.deposit(500);
// System.out.println(a1);
// a1.withdraw(40000.0);
// System.out.println(a1.toString());
// }
//}
//test 3
//public class Main {
// public static void main(String[] args) {
// Account a1 = new CheckingAccount();
// ((CheckingAccount)a1).setCredit(1000);//Account have no method setCredit that why error : solve "Casting Object"
// System.out.println(a1);
// }
//}
//test 4
//public class Main {
//    public static void main(String[] args) {
//        Account a1 = new CheckingAccount();
//         a1.setName("Nook");
//        System.out.println(a1);
//        ((CheckingAccount)a1).setCredit(1000);
//        System.out.println(a1); }
// }
//test Customer
//public class Main {
//    public static void main(String[] args) {
//    CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
//    Customer c1 = new Customer();
//    Customer c2 = new Customer("Harry","Potter");
//    Customer c3 = new Customer("Harry","Potter",a1);
//
//    System.out.println(c2);
//    System.out.println(c3);
//    }
//}
//test2
//public class Main {
//    public static void main(String[] args) {
//    CheckingAccount a1 = new CheckingAccount(1000,"62070033",500);
//    Customer c1 = new Customer(); // c1 have default = Customer("", "", null)
//    Customer c2 = new Customer("Harry","Potter");
//    Customer c3 = new Customer("Harry","Potter",a1);
//    System.out.println(c1.equals(c2));
//    System.out.println(c3.equals(c2));
//    }
//}