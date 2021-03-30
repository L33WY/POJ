package laby3.zad5;

import java.util.Scanner;

public class ATM {
    Account account;

    public ATM(Account account){
        this.account = account;
    }

    public void atmActive(){
        Scanner scanner = new Scanner(System.in);

        boolean powerOn = true;

         while (powerOn){
             System.out.println("Bankomat");
             System.out.println("1.Sprawdz stan konta");
             System.out.println("2.Wyplac gotowke");
             System.out.println("3.Wplac gotowke");
             System.out.println("4.Exit");

             int optionChose = scanner.nextInt();

            switch (optionChose){
                case 1:
                    this.account.checkSaldo();
                    break;
                case 2:
                    System.out.println("Ile pieniedzy chcesz wyplacic: ");
                    int ammountW = scanner.nextInt();
                    this.account.withdraw(ammountW);
                    break;
                case 3:
                    System.out.println("Ile pieniedzy chcesz wplacic: ");
                    int ammountD = scanner.nextInt();
                    this.account.deposit(ammountD);
                    break;
                case 4:
                    powerOn = false;

        }

        }

    }

    }
