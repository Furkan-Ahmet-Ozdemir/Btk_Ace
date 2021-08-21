package Btk_27_Throw_Exc;

public class BalanceInsufficentException extends  Exception{
    String message;
    public BalanceInsufficentException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return this.message;
    }
}
