import java.util.Scanner;

public class PigLatin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            //divide each word
            String[] tmp = sc.nextLine().split(" ");
            String wordLine = "";
            for (String word : tmp) {
                wordLine = wordLine + " " + pigLatinConverter(word);
            }
            System.out.println(wordLine);
        }
    }
    //Convert one word to Pig Latin
    private static String pigLatinConverter(String word){
        char fstLetter = word.charAt(0);
        if(fstLetter == 'a' || fstLetter == 'e' ||fstLetter == 'i' ||
                fstLetter == 'o' || fstLetter == 'u' || fstLetter == 'y'){
            return word + "yay";
        }
        else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' ||
                        word.charAt(i) == 'o' || word.charAt(i) == 'u' || word.charAt(i) == 'y') {
                    return word.substring(i) + word.substring(0, i) + "ay";
                }
            }
        }
        return word;
    }
}
