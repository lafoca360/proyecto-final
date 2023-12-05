package utils;

public class AppProperties {

    private AppProperties(){}

    static ConfigFileReader reader = new ConfigFileReader("src/main/resources/configs/config.properties");


    // Conexion BD
    public static String getMySqlUrl(){
        return  reader.getPropertyByKey("MYSQL_URL");
    }
    public static String getMySqlUser(){ return  reader.getPropertyByKey("MYSQL_USER"); }
    public static String getMySqlPassword(){ return  reader.getPropertyByKey("MYSQL_PASSWORD"); }

}
