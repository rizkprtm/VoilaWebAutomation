package com.voila.Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties prop;
    private final String browserFilePath = "src/main/resources/browser.properties";

    public ConfigFileReader() throws IOException {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(browserFilePath);
            prop = new Properties();
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            assert fis != null;
            fis.close();
        }
    }

    public String getURL() {
        return prop.getProperty("URL");
    }

    public String getBrowser() {
        return prop.getProperty("BROWSER");
    }
}
