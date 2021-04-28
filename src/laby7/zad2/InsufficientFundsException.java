package laby7.zad2;

public class InsufficientFundsException extends Exception{
    private String message;

    public InsufficientFundsException(String message) {
        this.message = message;
    }

    public InsufficientFundsException(){
        this.message = "Niepoprawne dane!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
