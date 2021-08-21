package Btk_13_Polymo;

public class EmailLogger extends BaseLogger{
    //overriding
    public void log(String message){
        System.out.println("Logged to Email :"+message);
    }
}
