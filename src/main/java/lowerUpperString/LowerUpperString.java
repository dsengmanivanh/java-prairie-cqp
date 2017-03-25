package lowerUpperString;


public class LowerUpperString {

    public String toAlternativeString(String input) {
        StringBuilder result = new StringBuilder();
        if (input == null || input.isEmpty()) {
            return result.toString();
        }
        char[] letters = input.toCharArray();
        for (char letter : letters) {
            if (Character.isUpperCase(letter)) {
                result.append(Character.toLowerCase(letter));
            } else {
                result.append(Character.toUpperCase(letter));
            }
        }
        return result.toString();
    }
}
