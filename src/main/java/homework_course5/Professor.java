package homework_course5;

import java.util.Objects;

public class Professor implements Human {
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfHiring=" + dateOfHiring +
                ", specializationName='" + specializationName + '\'' +
                '}';
    }

    String dateOfBirth;
    String dateOfHiring;
    String specializationName;
    ProfessorType type;


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

    @Override
    public ScholarType getType() {
        return type;
    }

    public String getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(String dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public String getSpecializationName() {
        return specializationName;
    }

    public void setSpecializationName(String specializationName) {
        this.specializationName = specializationName;
    }



    @Override
    public void listen() {
        System.out.println("The professor listens");
    }

    @Override
    public String talks() {
        return "Good morning";
    }

    @Override
    public boolean isPresentToday() {
        return false;
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setFirstName("Lesley-Ann");
        prof1.setLastName("Brandt");
        prof1.setDateOfBirth("02.12.1981");
        prof1.setDateOfHiring("15.09.2000");
        prof1.setSpecializationName("Acting");
        Professor prof2 = new Professor();
        prof2.setFirstName("Johnny");
        prof2.setLastName("Depp");
        prof2.setDateOfBirth("09.06.1963");
        prof2.setDateOfHiring("15.09.2000");
        prof2.setSpecializationName("Acting");
        System.out.println(prof1.toString());
        System.out.println(prof1.equals(prof2));
        System.out.println(prof2.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName);
    }


}



