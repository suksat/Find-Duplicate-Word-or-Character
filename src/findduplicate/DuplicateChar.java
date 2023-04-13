package findduplicate;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

    public static void main(String[] args) {
        String dupChar = "AABBCDD";

        char[] charArray = dupChar.toCharArray();

        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (char c : charArray) {
//            System.out.println("[16] element of Char Array: "+c);
            if (!set1.add(c)) {
//                System.out.println("[18] element of Char Array which on set add false: "+c);
                if (set2.add(c)) {
                    //System.out.println("-");
                    System.out.println(c);
                }
            }
        }
    }
}


