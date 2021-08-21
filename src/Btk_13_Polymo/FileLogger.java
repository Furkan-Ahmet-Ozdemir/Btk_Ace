package Btk_13_Polymo;

public class FileLogger extends BaseLogger{
    //overriding
    public void log(String message){
        System.out.println("Logged to File :"+message);
    }

}
