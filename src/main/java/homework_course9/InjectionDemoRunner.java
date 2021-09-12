package homework_course9;

import homework_course5.Professor;
import homework_course5.Student;

public class InjectionDemoRunner {
    public static void main(String[] args) {
        HumanRepository<Student> studentRepositoryToInject = new HumanRepository<>();
        HumanRepository<Professor> professorRepositoryToInject = new HumanRepository<>();
        HumanService humanService = new HumanService(studentRepositoryToInject,
                professorRepositoryToInject);

        humanService.getAllHuman();
        humanService.exercise1(studentRepositoryToInject);
    }
}
