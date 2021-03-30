package laby3.zad5;

public class Account {

    int id;
    int saldo;

    public Account(){
        this.saldo = 0;
    }
    public Account(int id ,int ammount){
        this.id = id;
        this.saldo = ammount;
    }

    public void checkSaldo(){
        System.out.println("Masz: " + this.saldo + " zł na koncie");
    }

    public void deposit(int ammount){
        this.saldo += ammount;
        System.out.println("aktualny stan konta to: " + this.saldo + " zł");
    }
    public void withdraw(int ammount){
        if ((this.saldo - ammount) < 0){
            System.out.println("Niewystarczająca ilość środków na koncie!");
        }else{
            this.saldo -= ammount;
            System.out.println("aktualny stan konta to: " + this.saldo + " zł");
        }
    }


}
