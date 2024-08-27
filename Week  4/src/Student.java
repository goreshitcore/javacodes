import java.util.Scanner;

public class Student {
    String name;
    int ID;
    double score;

    public Student(String name, int ID, double score) {
        this.name = name;
        this.ID = ID;
        this.score = score;
    }

    public String checkGrade() {
        if (score < 0 || score > 100) {
            return "DNC";
        } else if (score >= 79.5 && score <= 100) {
            return "A";
        } else if (score >= 64.5 && score < 79.5) {
            return "B";
        } else if (score >= 49.5 && score < 64.5) {
            return "C";
        } else {
            return "D";
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scan.nextLine();

        System.out.print("Enter student ID: ");
        int ID = scan.nextInt();
        scan.nextLine();

        System.out.print("Enter student score: ");
        double score = scan.nextDouble();
        scan.nextLine(); 

        Student student = new Student(name, ID, score);

        System.out.println("Name = " + student.name);
        System.out.println("ID = " + student.ID);
        System.out.println("Score = " + student.score);
        System.out.println("Grade = " + student.checkGrade());
    }
}