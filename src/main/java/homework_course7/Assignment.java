package homework_course7;


import java.util.UUID;

public class Assignment implements Comparable<Assignment>{
    private UUID uniqueId;
    private int courseNumber;
    private String assignmentTitle;
    private String AssignmentDescription;
    private DifficultyLevel myLev;

    @Override
    public int compareTo(Assignment other) {
        int compareByCourseNumber = Integer.compare(this.courseNumber, other.getCourseNumber());
        if (compareByCourseNumber != 0) {
            return compareByCourseNumber;
        }
        int compareByTitle = this.assignmentTitle.compareTo(other.getAssignmentTitle());
        if (compareByTitle != 0) {
            return compareByTitle;
        }
       int compareByLevel =  this.myLev.compareTo(other.getMyLev());
        return compareByLevel;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "uniqueId=" + uniqueId +
                ", courseNumber=" + courseNumber +
                ", assignmentTitle='" + assignmentTitle + '\'' +
                '}';
    }


    public Assignment(UUID uniqueId, int courseNumber, String assignmentTitle) {
        this.uniqueId = uniqueId;
        this.courseNumber = courseNumber;
        this.assignmentTitle = assignmentTitle;
    }


    public UUID getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(UUID uniqueId) {
        this.uniqueId = uniqueId;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getAssignmentDescription() {
        return AssignmentDescription;
    }

    public void setAssignmentDescription(String assignmentDescription) {
        AssignmentDescription = assignmentDescription;
    }
    public DifficultyLevel getMyLev() {
        return myLev;
    }

    public void setMyLev(DifficultyLevel myLev) {
        this.myLev = myLev;
    }



}
