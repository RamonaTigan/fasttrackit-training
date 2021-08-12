package homework_course9;

import homework_course5.Professor;
import homework_course5.Student;



public class HumanService {
    private static final HumanRepository<Student> studentRepository = new HumanRepository<>();
    private static final HumanRepository<Professor> professorRepository = new HumanRepository<>();

    public static void main(String[] args)  {

        //3.1 Add 4 objects inside each repository
        System.out.println("\n Objects added in student repository");

        Student st1 = new Student("Anya", "Taylor", "16.04.1996", "01.10.2015",
                "College of Fine Arts", "Theatre", "512");
        Student st2 = new Student("Daniel", "DiMaggio", "30.07.2001", "01.10.2019",
                "Northwestern University", "Playwriting", "712");
        Student st3 = new Student("India", "Eisley", "29.10.1993", "01.10.2016",
                "American Conservatory Theatre", "Theatre", "295");
        Student st4 = new Student("Felix", "Mallard", "20.04.1998", "01.10.2018",
                "National Institute of Dramatic Arts", "Production", "381");

        studentRepository.add(st1);
        studentRepository.add(st2);
        studentRepository.add(st3);
        studentRepository.add(st4);

        System.out.println(studentRepository.getAll());

        System.out.println("\n Objects added in professor repository");

        Professor pf1 = new Professor("Kevin", "Alejandro", "07.04.1976",
                "01.10.2000", "Theatre", "148");
        Professor pf2 = new Professor("Aimee", "Garcia", "28.11.1978",
                "01.10.2001", "Directing", "365");
        Professor pf3 = new Professor("Thomas", "Welling", "26.04.1977",
                "01.10.2002", "Production", "215");
        Professor pf4 = new Professor("David ", "Woodside", "25.07.1969",
                "01.10.1996", "Playwriting", "695");

        professorRepository.add(pf1);
        professorRepository.add(pf2);
        professorRepository.add(pf3);
        professorRepository.add(pf4);

        System.out.println(professorRepository.getAll());

        //3.3. Modify 2 objects inside each repository
        System.out.println("\n Objects modified in student repository");
        studentRepository.updateById("512", new Student("Lesley", "Gore", "25.03.1999",
                "01.10.2018", "Northwestern University", "Acting", "815"));
        studentRepository.updateById("381", new Student("Paul", "Smith", "15.02.2001",
                "01.10.2019", "College of Fine Arts", "Directing", "298"));

        System.out.println(studentRepository.getAll());

        System.out.println("\n Objects modified in professor repository");
        professorRepository.updateById("215", new Professor("John", "Bennet", "11.11.1975",
                "01.10.2005", "Acting", "431"));
        professorRepository.updateById("365", new Professor("Tom", "Cruise", "25.10.1970",
                "01.10.2001,", "Theatre", "623"));

        System.out.println(professorRepository.getAll());

        //3.4  Delete 2 objects inside each repository (1 that was modified, 1 that wasn’t)
        System.out.println("\n Objects deleted in student repository");
        studentRepository.deleteById("712");
        studentRepository.deleteById("381");

        System.out.println(studentRepository.getAll());

        System.out.println("\n Objects deleted in professor repository");
        professorRepository.deleteById("431");
        professorRepository.deleteById("148");

        System.out.println(professorRepository.getAll());



        //3.6. Print a single element from each repository, retrieved by its name field
        System.out.println("\n Single element from student repository");
        System.out.println(studentRepository.getAllByName("Eisley"));

        System.out.println("\n Single element from professor repository");
        System.out.println(professorRepository.getAllByName("Woodside"));

        System.out.println("\n Student element retrieved by id");
        System.out.println(studentRepository.getById("295"));

        System.out.println("\n Professor element retrieved by id");
        System.out.println(professorRepository.getById("365"));




    }
}
