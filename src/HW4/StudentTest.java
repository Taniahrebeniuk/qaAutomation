package HW4;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.mathAverageScore = 3;
        student1.economicAverageScore = 4;
        student1.languageAverageScore = 5;
        student1.student_name = "Ivan";
        student1.student_surname = "Ivanov";
        student1.student_ID = 678354;

        int num = 3;
        int sum1 = (student1.mathAverageScore + student1.economicAverageScore + student1.languageAverageScore) / num;
        System.out.println("HW4.Student ID - " + student1.student_ID + "," + " " + student1.student_name + " " + student1.student_surname + " has average score: " + sum1);

        Student student2 = new Student();
        student2.mathAverageScore = 5;
        student2.economicAverageScore = 3;
        student2.languageAverageScore = 3;
        student2.student_name = "Maria";
        student2.student_surname = "Lugova";
        student2.student_ID = 643268;

        int sum2 = (student2.mathAverageScore + student2.economicAverageScore + student2.languageAverageScore) / num;
        System.out.println("HW4.Student ID - " + student2.student_ID + "," + " " + student2.student_name + " " + student2.student_surname + " has average score: " + sum2);

        Student student3 = new Student();
        student3.mathAverageScore = 3;
        student3.economicAverageScore = 2;
        student3.languageAverageScore = 3;
        student3.student_name = "Oleksandr";
        student3.student_surname = "Stepanenko";
        student3.student_ID = 698231;

        int sum3 = (student3.mathAverageScore + student3.economicAverageScore + student3.languageAverageScore) / num;
        System.out.println("HW4.Student ID - " + student3.student_ID + "," + " " + student3.student_name + " " + student3.student_surname + " has average score: " + sum3);
    }
}