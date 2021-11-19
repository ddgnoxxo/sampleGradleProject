package pruebajunitgradle;

public class Utils {
    static String environment = System.getProperty("env");

    public static String getEnvironment(){
        if (environment==null){
            return Constants.DEFAULT_ENV;
        }else{
            return environment;
        }
    }
}
