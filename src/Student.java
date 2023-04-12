public class Student {

    private String name;
    private int course;
    private int grade;

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String str) {
        if (str.length() >= 3)
            name = str;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course1) {
        if (course1 <= 4)
            course = course1;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade1) {
        if (grade1 <= 10)
            grade = grade1;
    }

    public void showInfo() {
        System.out.println("Student: " + getName());
        System.out.println("Course: " + getCourse());
        System.out.println("Grade: " + getGrade());
    }
}