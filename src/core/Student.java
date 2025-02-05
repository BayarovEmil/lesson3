package core;

public class Student extends User {
    private double stpendiya;
    private double gpa;
    private String groupName;

    public Student(int id, String username, String password, double stpendiya, double gpa, String groupName) {
        super(id, username, password);
        this.stpendiya = stpendiya;
        this.gpa = gpa;
        this.groupName = groupName;
    }

    public double getStpendiya() {
        return stpendiya;
    }

    public void setStpendiya(double stpendiya) {
        this.stpendiya = stpendiya;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "core.Student{" +
                "stpendiya=" + stpendiya +
                ", gpa=" + gpa +
                ", groupName='" + groupName + '\'' +
                '}';
    }
}
