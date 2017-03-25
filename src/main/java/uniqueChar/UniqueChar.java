package uniqueChar;


public class UniqueChar {

    public boolean isUniqueChar(String str) {
        boolean containsUnique = false;
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                containsUnique = true;
            } else {
                containsUnique = false;
            }
        }
        return containsUnique;

    }

    public boolean isUniqueCharOther(String asciiStr) {
        if (asciiStr == null || asciiStr.isEmpty()) {
            return false;
        }
        boolean[] charSet = new boolean[256];
        for (int i = 0; i < asciiStr.length(); i++) {
            int asciiVal = asciiStr.charAt(i);
            if (charSet[asciiVal]) {
                return false;
            }
            charSet[asciiVal] = true;
        }
        return true;
    }
}
