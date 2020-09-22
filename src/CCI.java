public class CCI {

    /*public int positiveIntegerSolutions (int a, int b, int c) {

        return
    }*/

    // 1.1 Is Unique: implement an algorithm to determine if a string has all unique characters
    //what if you can't use additional data structures?

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }


    public static void main(String[] args) {
        //test for question 1.1
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }


    }
}
