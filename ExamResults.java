import java.util.Random;

class Student {
    int studentID;
    char cppScore;
    char javaScore;

    public Student(int id) {
        this.studentID = id;
        this.cppScore = generateRandomGrade();
        this.javaScore = generateRandomGrade();
    }

    char generateRandomGrade() {
        Random rand = new Random();
        int randomNum = rand.nextInt(5); // Generates a random number between 0 and 4
        char[] grades = {'A', 'B', 'C', 'D', 'F'};
        return grades[randomNum];
    }

    void printInfo() {
        System.out.println(studentID + "\t\t" + cppScore + "\t\t" + javaScore);
    }
}

public class ExamResults {
    public static void main(String[] args) {
        int numStudents = 10;
        Student[] students = new Student[numStudents];

        // Populate students array
        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student(i + 1);
        }

        // Print the table header
        System.out.println("Student ID\tC++ Score\tJava Score");

        // Print the table rows
        for (Student student : students) {
            student.printInfo();
        }
    }
}
