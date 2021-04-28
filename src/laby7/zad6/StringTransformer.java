package laby7.zad6;

public class StringTransformer {

    public static void main(String[] args) {
        System.out.println(removeSigns("Ala Ma Kota", Sign.VOWEL));
    }


    public static String removeSigns(String text, Sign sign){
        String convertedText = "";

        switch (sign){
            case VOWEL:
                for (char ch : text.toCharArray()){
                    if (!(ch == 'a' || ch == 'A' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u'))
                    {convertedText += ch;}
                    break;
                }
            case CONSONANT:
                for (char ch : text.toCharArray()){
                    if (ch == 'a' || ch =='e' || ch == 'i' || ch == 'o' || ch == 'u')
                    {convertedText += ch;}
                    break;
                }
            case SPACE:
                for (char ch : text.toCharArray()){
                    if (!(ch == ' '))
                    {convertedText += ch;}
                    break;
                }
            case NUMBER:
                for (char ch : text.toCharArray()){
                    if (!(Character.isDigit(ch)))
                    {convertedText += ch;}
                    break;
                }
        }
        return convertedText;
    }
}
