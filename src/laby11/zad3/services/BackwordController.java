package laby11.zad3.services;

public class BackwordController {

    public static String reverseWord(String word) {

        word = word.trim();
        String result = "";
        char[] ch = word.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            result += ch[i];
        }
        return result;
    }
}