public class StringUtils {






    public static String reverse(String stringToReverse) {
        if (stringToReverse == null) {
            return null;
        }

        if (stringToReverse.isEmpty()) {
            return "";
        }



        char[] charStringArray = stringToReverse.toCharArray();
        int start = 0;
        int end = stringToReverse.length() - 1;

        while (start < end) {
            char temp = charStringArray[start];
            charStringArray[start] = charStringArray[end];
            charStringArray[end] = temp;
            start++;
            end--;
        }

        return new String(charStringArray);

    }

}
