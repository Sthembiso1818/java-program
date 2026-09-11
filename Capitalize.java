import java.util.Scanner;

public class Capitalize
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = "";
        String prevSentence = "";

        System.out.print("Enter a sentence then I will capitalize the first character of the words: ");
        sentence = sc.nextLine();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (i == 0) {
                ch = Character.toUpperCase(ch);
            }
            else {
                char ch2 = sentence.charAt(i - 1);

                if (ch2 == ' ' && Character.isLetter(ch)) {
                    ch = Character.toUpperCase(ch);
                }
            }

            prevSentence += ch;
        }

        System.out.println(prevSentence);
    }
}