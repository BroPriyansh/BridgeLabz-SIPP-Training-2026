import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double physics = sc.nextDouble();
        double chemistry = sc.nextDouble();
        double maths = sc.nextDouble();

        double avg = (physics + chemistry + maths) / 3;

        String grade, remark;

        if (avg >= 80) {
            grade = "A"; remark = "Level 4";
        } else if (avg >= 70) {
            grade = "B"; remark = "Level 3";
        } else if (avg >= 60) {
            grade = "C"; remark = "Level 2";
        } else if (avg >= 50) {
            grade = "D"; remark = "Level 1";
        } else if (avg >= 40) {
            grade = "E"; remark = "Below Level 1";
        } else {
            grade = "R"; remark = "Remedial";
        }

        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
        System.out.println("Remark = " + remark);
    }
}