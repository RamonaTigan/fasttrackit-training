package homework_course5;

public class VowelsConsonants {
    public static void main(String[] args) {
        int v = 0, c = 0;
        String str = "Follow your dreams, keep sleeping";
        for (int x = 0; x < str.length(); ++x ){
            char ch = str.charAt(x);
            switch (str.charAt(x)) {
                case 'a':
                    ch = 'a';

                case 'e':
                    ch = 'e';

                case 'i':
                    ch = 'i';

                case 'o':
                    ch = 'o';

                case 'u':
                    ch = 'u';
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


