package task2;

class BankAccount {
    private int balance = 100;

    // Synchronized method → only ONE thread can run this at a time
    public synchronized void deposit(int amount) {
        int newBalance = balance + amount;

        // Simulate some delay
        try { Thread.sleep(100); } catch (InterruptedException e) {}

        balance = newBalance;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", New Balance: " + balance);
    }
}

class Person extends Thread {
    BankAccount account;

    public Person(BankAccount account, String name) {
        super(name); // Thread name
        this.account = account;
    }

    @Override
    public void run() {
        account.deposit(50);
    }
}

public class Multithreading {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Two threads using same account
        Person p1 = new Person(account, "Person 1");
        Person p2 = new Person(account, "Person 2");

        p1.start();
        p2.start();
    }
}

//Output:
//Person 1 deposited 50, New Balance: 150
//Person 2 deposited 50, New Balance: 200

