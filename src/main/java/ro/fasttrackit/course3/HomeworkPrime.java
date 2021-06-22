package ro.fasttrackit.course3;

public class HomeworkPrime {
    public static void main(String[] args) {
        int x = 103;
        int k = 2;
        boolean isPrime = true;
        for (k = 2; k < (x / 2); k++)
            if (x % k == 0) {
                isPrime = false;
                break;
            }
            System.out.println("Number is prime ");


        }
    }

