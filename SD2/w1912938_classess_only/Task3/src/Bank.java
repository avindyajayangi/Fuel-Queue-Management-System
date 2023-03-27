//import java.util.Scanner;
//
//public class Bank {
//
//    static int balance = 0;
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        while(true) {
//
//            System.out.print("Enter the option you want: ");
//            int option = input.nextInt();
//
//            switch (option) {
//
//                case 1:
//                    System.out.println("deposit money");
//                    Scanner x = new Scanner(System.in);
//                    System.out.println("Enter the deposit money amount: ");
//                    int money = x.nextInt();
//                    balance = balance + money;
//
//                    break;
//                case 2:
//                    System.out.println("withdraw money");
//                    Scanner y = new Scanner(System.in);
//                    System.out.println("How much do you want: ");
//                    int money2 = y.nextInt();
//                    withdrawMoney(money2);
//                    break;
//                case 3:
//                    System.out.println("get the current balance");
//                    System.out.println(getTheCurrentBalance());
//                    break;
//                case 4:
//                    System.out.println("deposit special money");
//                    Scanner z = new Scanner(System.in);
//                    System.out.println("Enter the deposit special money: ");
//                    int money3 = z.nextInt();
//                    depositSpecialMoney(money3);
//                    break;
//                default:
//                    System.out.println("Please check the option number");
//                    System.exit(0);
//
//            }
//        }
//
//    }
//
//    private static void depositMoney(int money) {
//
//        balance = balance + money;
//    }
//
//    private static void withdrawMoney(String money, int name) {
//
//
//
//    }
//    String firstName = "janith";
//
//    Passenger x = new Passenger(firstName, "gayali");
//    WaitingQueue y = new WaitingQueue(x);
//
//    private static int withdrawMoney(int money, String name) {
//
//        return 0;
//    }
//
//    private static int getTheCurrentBalance() {
//
//        return balance;
//    }
//
//    private static void depositSpecialMoney(int money) {
//
//        balance = balance + money + (money*10/100);
//    }
//
//
//}
