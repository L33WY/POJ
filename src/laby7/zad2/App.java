package laby7.zad2;

import java.util.Scanner;

public class App {
    private static final String EXIT = "exit";
    private final static BankAccount account = new BankAccount(Math.random() * 10000);
    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {
            try {
                final String line = in.nextLine();
                if (EXIT.equals(line)) {
                    isExit = true;
                } else {
                    account.transaction(line);
                }throw new InsufficientFundsException();
            }catch (InsufficientFundsException e){
                e.getMessage();
            }


        }
    }
}

