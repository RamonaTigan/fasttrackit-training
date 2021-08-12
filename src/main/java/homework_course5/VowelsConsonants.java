package homework_course5;

import java.util.Locale;

public class VowelsConsonants {
    public static void main(String[] args) {
        int v = 0, c = 0;
        String str = "Follow your dreams, keep sleeping";
        str = str.toLowerCase();
    for (int x = 0; x < str.length(); x++ ){
            char ch = str.charAt(x);

            switch (str.charAt(x)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    v++;
                    break;

                default:
                    c++;
                    break;
            }
            System.out.println(" Number of vowels: " + v);
            System.out.println(" Number of consonants: " + c);

        }

    }
}


