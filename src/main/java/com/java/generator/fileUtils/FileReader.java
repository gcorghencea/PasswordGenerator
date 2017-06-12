package com.java.generator.fileUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by gcorghencea on 12-Jun-17.
 */
public class FileReader {
    private Properties prop;

    private void getPropertyFile() {
        prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("boundries.properties");
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCharacterMark(String key) {
        return Integer.parseInt(prop.getProperty(key));
    }
}
