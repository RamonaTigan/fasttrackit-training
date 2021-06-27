package homework_course5;

import java.util.Objects;

public class Student implements Human{
    String firstName;
    String lastName;
    String dateOfBirth;
    String  dateOfEnrollment;
    String facultyName;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfEnrollment=" + dateOfEnrollment +
                ", facultyName='" + facultyName + '\'' +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    String specializationName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfEnrollment() {
        return dateOfEnrollment;
    }

    public void setDateOfEnrollment(String dateOfEnrollment) {
        this.dateOfEnrollment = dateOfEnrollment;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }



    @Override
    public void listen() {

    }

    @Override
    public String talks() {
        return null;
    }

    @Override
    public boolean isPresentToday() {
        return false;
    }

    public static void main(String[] args) {
        Student stud1 = new Student();
        stud1.setFirstName("Tom");
        stud1.setLastName("Ellis");
        stud1.setDateOfBirth("17.11.1978");
        stud1.setDateOfEnrollment("01.10.2000");
        stud1.setFacultyName("Acting Faculty");
        stud1.setSpecializationName("Acting");
        Student stud2 = new Student();
        stud2.setFirstName("Tom");
        stud2.setLastName("Ellis");
        stud2.setDateOfBirth("17.11.1978");
        stud2.setDateOfEnrollment("01.10.2000");
        stud2.setFacultyName("Acting Faculty");
        stud2.setSpecializationName("Acting");
        System.out.println(stud1.toString());
        System.out.println(stud1.equals(stud2));
        System.out.println(stud2.hashCode());


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(dateOfBirth, student.dateOfBirth) && Objects.equals(dateOfEnrollment, student.dateOfEnrollment) && Objects.equals(facultyName, student.facultyName) && Objects.equals(specializationName, student.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfEnrollment, facultyName, specializationName);
    }
}
