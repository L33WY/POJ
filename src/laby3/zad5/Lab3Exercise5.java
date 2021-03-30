package laby3.zad5;

import javax.naming.Name;

public class Lab3Exercise5 {
    public static void main(String[] args) {

//        nie działały coś te tablice :/

//        Account [] bankUsers = new Account[10];
//
//
//        for (int i=0; i<=10; i++){
//
//            bankUsers[i] = new Account(i, 100);
//        }
//
//        System.out.println(bankUsers[1]);
//        System.out.println(bankUsers[3]);

        Account account = new Account(1, 100);
        ATM accountAtm = new ATM(account);
        accountAtm.atmActive();

    }
}
