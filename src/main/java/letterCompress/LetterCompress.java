package letterCompress;


public class LetterCompress {

    public String apply(String input) {
        StringBuilder result = new StringBuilder();
        if (input == null) {
            return result.toString();
        }
        String[] letters = input.split("");
        for (String letter : letters) {
            if (result.indexOf(letter) == -1) {
                result.append(letter);
                result.append(count(letter, letters));
            }
        }

        return result.toString();
    }

    private int count(String letter, String[] letters) {
        int count = 0;
        for (String s : letters) {
            if (letter.equals(s)) {
                count++;
            }
        }
        return count;
    }

}
