package Btk_13_Polymo;

public class Btk_13 {
    public static void main(String[] args) {
//        EmailLogger logger = new EmailLogger();
//        logger.Log("Log mesajı");

//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};
//        for (BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();


    }
}
