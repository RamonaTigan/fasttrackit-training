package homework_course7;

public class PasswordCheck {
    public static void main(String[] args) {
        String pass = "!rOMEO2001!";

        if (isValid(pass)) {
            System.out.println(pass + " is valid ");
        } else {
            System.out.println(pass + " is not valid ");
        }

    }

    public static boolean isValid(String pass) {

        char[] ch = pass.toCharArray();
        int len = ch.length;
        if (len < 12) {
            System.out.println(" Your password should contain at least 12 characters ");

        }
        for (int i = 0; i < len; i++) {

            if (ch[i] <= 47 && ch[i] >= 58 || ch[i] <= 64 && ch[i] >= 91 ||
                    ch[i] <= 97 && ch[i] >= 122)
                System.out.println(" Your password should contain only letters and digits");
            if (!Character.isUpperCase(ch[i]))
                System.out.println(" Your password should contain upper case characters");

            if (!Character.isLowerCase(ch[i])) {
                System.out.println(" Your password should contain lower case characters");
            return false;}

        }
        return true;
    }
}









