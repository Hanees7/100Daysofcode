import java.util.Scanner;

class encapsu {
    private double bal = 5000;
    private int pass;

    public void Deposite(double money) {
        System.out.println("ENter pass");
        Scanner s1 = new Scanner(System.in);
        pass = s1.nextInt();
        System.out.println("Entr deposiiite money");
        money=s1.nextInt();
        if (pass == 786) {
            bal = bal + money;
            System.out.println("Money Deposite" + money);
            System.out.println("Total balance" + bal);

        } else {
            System.out.println("Wrong pass");
        }
    }

    public void Withdraw(double money) {
        System.out.println("Enter pass");
        Scanner s1 = new Scanner(System.in);
        pass = s1.nextInt();
        System.out.println("how much");
        money=s1.nextInt();
        if (pass == 786) {
            bal = bal - money;
            System.out.println("Withdraw MOney:" + money);
            System.out.println("Total BAl:" + bal);
        } else {
            System.out.println("Glt hai");
        }
    }

    public void CheckBal() {
        System.out.println("Enter passs");
        Scanner s1 = new Scanner(System.in);
        pass = s1.nextInt();
        if (pass == 786) {
            System.out.println("total amt" + bal);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        encapsu jj = new encapsu();

        int ch;
        System.out.println("1=deposite");
        System.out.println("2=withdraw");
        System.out.println("3=total Bal");
        System.out.println("Enter your choice");
        Scanner s2 = new Scanner(System.in);
        ch = s2.nextInt();

        switch (ch) {
            case 1:
            // Scanner s3=new Scanner(System.in);
            // money=s3.nextInt();

                jj.Deposite(100);
                break;
            case 2:
                jj.Withdraw(200);
                break;
            case 3:
                jj.CheckBal();
                break;
                default:System.out.println("NOt Valid");

        }

    }
}