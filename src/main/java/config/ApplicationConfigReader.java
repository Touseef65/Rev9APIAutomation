package config;

import ru.qatools.properties.Property;
import ru.qatools.properties.PropertyLoader;
import ru.qatools.properties.Resource.Classpath;

@Classpath({"config.properties"})
public class ApplicationConfigReader {
    private static ApplicationConfigReader config;

    // Private constructor to enforce the singleton pattern
    private ApplicationConfigReader() {
        // Print the classpath
        System.out.println("Classpath: " + System.getProperty("java.class.path"));

        PropertyLoader loader = PropertyLoader.newInstance();
        loader.populate(this);
        System.out.println("Loaded baseUrl: " + this.baseUrl);
    }

    // Singleton pattern to ensure a single instance of the configuration reader
    public static ApplicationConfigReader getConfig() {
        if (config == null) {
            config = new ApplicationConfigReader();
        }
        return config;
    }

    @Property("baseUrl")
    protected String baseUrl="http://beta.superkiwi.do/app-api/1.0";
    // Getter method to access the baseUrl property
    public String getBaseUrl() {
        System.out.println("Returning baseUrl: " + this.baseUrl);
        return this.baseUrl;
    }
}
