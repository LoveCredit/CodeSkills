package codetests;

public class SortWordsByNumber {

    public static String order(String words) {
        String result = "";
        int i = 1;
        String[] spaceSplitted;
        while (words.contains(String.valueOf(i))) {
            spaceSplitted = words.split(" ");
            int j = 0;
            while (!spaceSplitted[j].contains(String.valueOf(i))) {
                j++;
            }
            if (!result.isEmpty()) {
                result += " " + spaceSplitted[j];
            } else {
                result += spaceSplitted[j];
            }

            i++;
        }
        return result;
    }
}
