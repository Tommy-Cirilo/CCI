import java.util.HashMap;

public class CCI {

//-------------------------------    Key Topics to Study & Master -----------------------------------------

//Hash Maps
    public void Hash () {

    }




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

    //1.1 Is Unique second question: what if you cannot use additional data structures?
    /* Assumes only letters a through z. */
    public static boolean isUniqueChars2(String str) {
        if (str.length() > 26) { // Only 26 characters
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
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
