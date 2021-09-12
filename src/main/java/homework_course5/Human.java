package homework_course5;


public interface Human {
    void listen();
    String talks();
    boolean isPresentToday();


    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    String getDateOfBirth();

    void setDateOfBirth(String dateOfBirth);

    ScholarType getType();

    String getUniqueId();
    void setUniqueId(String uniqueId);

}

