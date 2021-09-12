package homework_course5;

import java.util.Objects;


public class Professor implements Human {
    String firstName;
    String lastName;
    String dateOfBirth;
    String dateOfHiring;
    String specializationName;
    ProfessorType type;
    String uniqueId;

    public Professor(String firstName, String lastName, String dateOfBirth, String dateOfHiring, String specializationName, String uniqueId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.dateOfHiring = dateOfHiring;
        this.specializationName = specializationName;
        this.uniqueId = uniqueId;
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Professor professor = (Professor) o;
        return Objects.equals(firstName, professor.firstName) && Objects.equals(lastName, professor.lastName) && Objects.equals(dateOfBirth, professor.dateOfBirth) && Objects.equals(dateOfHiring, professor.dateOfHiring) && Objects.equals(specializationName, professor.specializationName) && type == professor.type && Objects.equals(uniqueId, professor.uniqueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, dateOfHiring, specializationName, type, uniqueId);
    }



    public void setType(ProfessorType type) { this.type = type; }

    public String getUniqueId() { return uniqueId; }

    public void setUniqueId(String uniqueId) { this.uniqueId = uniqueId; }

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


    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", dateOfHiring='" + dateOfHiring + '\'' +
                ", specializationName='" + specializationName + '\'' +
                ", type=" + type +
                ", uniqueId=" + uniqueId +
                '}';
    }

    public static void main(String[] args) {
        Professor prof1 = new Professor("Lesley-Ann", "Brandt", "02.12.1981", "15.09.2000", "Acting", "687");
        Professor prof2 = new Professor("Johnny", "Depp", "09.06.1963", "15.09.2000", "Acting", "254" );
        System.out.println(prof1.toString());
        System.out.println(prof1.equals(prof2));
        System.out.println(prof2.hashCode());
    }
}





