package ro.fasttrackit.course3;

public class HomeworkPalindrome {
    public static void main(String[] args) {
        int r, p = 0, x;
        int n = 292;
        x = n;
        while (n > 0) {
            r = n % 10;
            p = (p * 10) + r;
            n = n / 10;
        }
        if (x == p){
            System.out.println(" Number " + p + " is palindrome ");
        }else {
            System.out.println(" Number " + p + " is not palindrome ");
        }
    }
}
