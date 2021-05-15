package laby10.zad1;

import java.util.HashMap;
import java.util.Map;

public class Exercise {

    public static void main(String[] args) {
        String text = "Ala ma kota i Ala ma psa";
        System.out.println(wordsCount(text));

    }
    static Map<String, Integer> wordsCount(String text){
        Map<String, Integer> words = new HashMap<>();
        String[] splitWords = text.split(" ");
        for (String word : splitWords){
            if (words.containsKey(word)){
                words.put(word, words.get(word) + 1);
            }else {
                words.put(word, 1);
            }
        }
        return words;
    }
}
