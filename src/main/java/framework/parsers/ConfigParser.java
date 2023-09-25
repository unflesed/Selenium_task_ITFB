package framework.parsers;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ConfigParser {
    private static final String PATH = "src/main/resources/config.json";
    private static final String BROWSER_KEY = "browser";
    private static final String URL_KEY = "url";
    private static final String TIMEOUT_KEY = "timeout";
    public static String getBrowserName() throws Exception {

        return getJSONConfigObj().getString(BROWSER_KEY);
    }

    public static String getUrlName() throws Exception {

        return getJSONConfigObj().getString(URL_KEY);
    }

    public static long getTimeout() throws Exception {

        return Long.parseLong(getJSONConfigObj().getString(TIMEOUT_KEY));
    }

    public static JSONObject getJSONConfigObj() throws Exception {
        String config = convertFileIntoString(PATH);

        return new JSONObject(config);
    }

    public static String convertFileIntoString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
