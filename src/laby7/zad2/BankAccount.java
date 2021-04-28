package laby7.zad2;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private static final String EMPTY = "";
    private static final String MINUS = "-";
    private double balance;
    public BankAccount(final double initialBalance) {
        balance = BigDecimal.valueOf(initialBalance)
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
        printBalance();
    }

    public void transaction(final String value) {
        if (value.startsWith(MINUS)) {
            try {
                withdraw(value.replaceFirst(MINUS, EMPTY));
            }catch (InsufficientFundsException e){
                e.getMessage();
            }

        } else {
            try {
                deposit(value);
            }catch (InsufficientFundsException e){
                System.out.println(e.getMessage());
            }

        }
    }
    private void deposit(final String depositAmount) throws InsufficientFundsException {
        try{
            balance += Double.parseDouble(depositAmount);
        }finally {
            printBalance();
        }
        throw new InsufficientFundsException();


    }
    private void withdraw(final String withdrawAmount) throws InsufficientFundsException{
        try {
            balance -= Double.parseDouble(withdrawAmount);
        }finally {
            printBalance();
        }throw new InsufficientFundsException();


    }
    private void printBalance() {
        System.out.println("Account has a balance of " + balance);
    }
}
