package ro.fasttrackit.course3;

public class HomeworkRunner {
    public static void main(String[] args) {

        Professor englishProfessor = new Professor();
        Professor mathProfessor = new Professor();

        englishProfessor.setFirstName("Smith");
        mathProfessor.setFirstName("Grace");

        System.out.println("English professor is: " + englishProfessor.getFirstName());
        System.out.println("Math professor is: " + mathProfessor.getFirstName());
        System.out.println("Stop program");


    }
}
