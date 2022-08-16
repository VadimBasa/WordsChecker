import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class WordsChecker {
    String wordsText = "Null";

    WordsChecker(String wordsText) {
        this.wordsText = wordsText;
    }

    public boolean hasWord(String word) {
        String AraySplit[] = wordsText.split("\\P{IsAlphabetic}+");
        Set<String> set = new HashSet<>();
        Collections.addAll(set, AraySplit);

        if (set.contains(word))
            return true;
        else
            return false;
    }
}
