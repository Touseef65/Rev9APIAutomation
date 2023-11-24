package config;

public class configProperties {

    // Use getConfig() to obtain an instance of ApplicationConfigReader
    public static ApplicationConfigReader appConfig = ApplicationConfigReader.getConfig();

    // Accessing the baseUrl property through the getter method after appConfig is initialized
    public static String BaseURl = appConfig.getBaseUrl();

}
