package homework_course5;

public class VowelsConsonants {
    public static void main(String[] args) {
        int v = 0, c = 0;
        String str = "Follow your dreams, keep sleeping";
        for (int i = 0; i < str.length(); i++ ){
            switch (str.charAt(i)) {
                case 1:
                    ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')
                    v++;
                    break;
                case 2:
                    ((str.charAt(i) >= 'a') && (str.charAt(i) <= 'z' );
                    c++;
                    break;
            }
            System.out.println(" Number of vowels: " + v);
            System.out.println(" Number of consonants: " + c);

        }

    }
}


