package framework.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {
    public static String getTextAfterColon(String text){
        Pattern pattern = Pattern.compile(":(.*)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
