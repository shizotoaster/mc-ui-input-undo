package thecsdev.uiinputundo.client;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public final class TextManipUtils {
    private TextManipUtils() {}
    public static String reverseText(String s) { return new StringBuilder(s).reverse().toString(); }

    public static String reverseWords(String input)
    {
        return replaceWords(input, word -> new StringBuilder(word).reverse().toString());
    }
    public static String capitalizeAllWords(String input)
    {
        return replaceWords(input, word -> StringUtils.capitalize(word));
    }

    public static String replaceWords(String input, Function<String, String> replacement)
    {
        Matcher wordMatcher = Pattern.compile("[A-z]*").matcher(input);
        StringBuilder output = new StringBuilder(input);

        while(wordMatcher.find())
        {
            if(StringUtils.isBlank(wordMatcher.group())) continue;

            String rWord = replacement.apply(wordMatcher.group());
            output.replace(wordMatcher.start(), wordMatcher.end(), rWord);
        }

        return output.toString();
    }
}
