package stringCalculator;


public class StringCalculator {

    public int add(String numbers) {
        String reg = "[,\n]";
        int res = 0;
        if (numbers.isEmpty() || numbers.contains(",\n")){
            return res;
        }
        int first = numbers.indexOf("[");
        if (first != -1) {
            int second = numbers.indexOf("]");
            String separator = numbers.substring(first + 1, second);
            if (!separator.isEmpty()) {
                reg = separator;
                numbers = numbers.substring(second + 1);
            }
        }

        String[] tab = numbers.split(reg);
        for (String st : tab) {
            res = res + Integer.parseInt(st);
        }
        return res;

    }
}
