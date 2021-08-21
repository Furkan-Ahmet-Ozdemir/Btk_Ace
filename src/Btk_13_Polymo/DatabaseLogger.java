package Btk_13_Polymo;

public class DatabaseLogger extends BaseLogger{
    //overriding
    public void log(String message){
        System.out.println("Logged to Database :"+message);
    }

}
