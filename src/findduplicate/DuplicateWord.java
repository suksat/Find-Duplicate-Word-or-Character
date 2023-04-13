package findduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateWord {
    public static void main(String[] args) {
        String words = "sukumar hello sukumar hello";

        Set<String> hashSet = new HashSet<>();

        List<String> duplicateWordList = Arrays.stream(words.split(" "))
                .collect(Collectors.toList()) // converted words into List
                .stream() // stream method applied on List
                .filter(temp -> !hashSet.add(temp))
                .collect(Collectors.toList()); // converted final output into List

        String duplicateWordString = duplicateWordList.stream()
                .map(Object::toString) // converted List into String
                .collect(Collectors.joining(", "));

        System.out.println(duplicateWordString);
    }
}

