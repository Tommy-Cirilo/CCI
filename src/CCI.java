import java.util.HashMap;

public class CCI {

//-------------------------------    Key Topics to Study & Master -----------------------------------------

    //Hash Maps
    public void Hash() {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values use the .put method (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


        //to access an individual item in the hash map, use the .get method
        capitalCities.get("England");

        //to remove an individual item in the hash map, use the .remove method
        capitalCities.remove("England");

        //to clear all items in the hash map, use .clear method
//        capitalCities.clear();

        //to find out how many items there are in the hashmap, use the .size method
        capitalCities.size();


        //Loop through the items of a HashMap with a for-each loop.
        //Note: Use the keySet() method if you only want the keys, and use the values() method if you only want the values:

        // Print keys
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        // Print values
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        // Print keys and values
        for (String i : capitalCities.keySet()) {
            System.out.println("key: " + i + " value: " + capitalCities.get(i));
        }



        // Another Example of using different types of keys and values
        //Create a HashMap object called people that will store String keys and Integer values:

        // Create a HashMap object called people
        HashMap<String, Integer> people = new HashMap<String, Integer>();


        // Add keys and values (Name, Age)
        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for (String i : people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));
        }


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


    // 1.2 permutation
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        return sort(s).equals(sort(t));
    }


    public static void main(String[] args) {
        //test for question 1.1
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word));
        }

        //test for question 1.2 permutation
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = permutation(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }


    }
}
