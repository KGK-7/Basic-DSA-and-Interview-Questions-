import java.util.*;

interface BankIx {
    void getData();
    void deposit(int amount);
    void withdraw(int amount);
}

class Concreate implements BankIx {
    String name;
    int acc_no;
    int ini_bal;

    public void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, acc_no, ini_bal");
        name = sc.next();
        acc_no = sc.nextInt();
        ini_bal = sc.nextInt();
    }

    public void deposit(int amount) {
        if (amount > 20000) {
            System.out.println("Deposit limit per once is Rs.20000");
        } else {
            ini_bal += amount;
            System.out.println("Current balance: " + ini_bal);
        }
    }

    public void withdraw(int amount) {
        if (amount > 10000) {
            System.out.println("Withdraw limit per once is Rs.10000");
        } else {
            ini_bal -= amount;
            System.out.println("Current balance: " + ini_bal);
        }
    }
}

public class BankMainInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankIx bb = new Concreate();
        bb.getData();
        System.out.println("Want to do deposit or withdraw: Enter deposit or withdraw");
        String dw = sc.next();
        System.out.println("Enter amount to " + dw);
        int amnt = sc.nextInt();

        if (dw.equalsIgnoreCase("deposit")) {
            bb.deposit(amnt);
        }
        if (dw.equalsIgnoreCase("withdraw")) {
            bb.withdraw(amnt);
        }
    }
}

