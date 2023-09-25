package framework.parsers;

import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

public class TestingDataParser {
    private static final String PATH = "src/main/resources/testingData.json";
    private static final String NAME_KEY = "name";
    private static final String EMAIL_KEY = "email";
    private static final String CURRENT_ADDRESS_KEY = "currentAddress";
    private static final String PERMANENT_ADDRESS_KEY = "permanentAddress";
    private static final String TEXT_FOR_PROMPT_KEY = "textForPrompt";

    public static String getName() throws Exception {

        return getJSONTestingDataObj().getString(NAME_KEY);
    }

    public static String getEmail() throws Exception {

        return getJSONTestingDataObj().getString(EMAIL_KEY);
    }

    public static String getCurrentAddress() throws Exception {

        return getJSONTestingDataObj().getString(CURRENT_ADDRESS_KEY);
    }

    public static String getPermanentAddress() throws Exception {

        return getJSONTestingDataObj().getString(PERMANENT_ADDRESS_KEY);
    }

    public static String getTextForPrompt() throws Exception {

        return getJSONTestingDataObj().getString(TEXT_FOR_PROMPT_KEY);
    }

    public static JSONObject getJSONTestingDataObj() throws Exception {
        String config = convertFileIntoString(PATH);

        return new JSONObject(config);
    }

    public static String convertFileIntoString(String file) throws Exception
    {
        return new String(Files.readAllBytes(Paths.get(file)));
    }
}
