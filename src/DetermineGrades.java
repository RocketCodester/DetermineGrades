/* 
   12/14/14
   JDK 1.7
   Array Program to input/output grades using JOptionPane
 */
import javax.swing.JOptionPane;

public class DetermineGrades {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "Enter how many scores:");
        int number = Integer.parseInt(input);
        int scores[] = new int[number];
        for (int i = 0; i < scores.length; i++) {
            input = JOptionPane.showInputDialog(null, "Enter score");
            scores[i] = Integer.parseInt(input);
        }
        int sum = 0;
        int max = scores[0];
        int min = scores[0];
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;
        int gradeF = 0;
        int error = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if (scores[i] > max) {
                max = scores[i];
            }
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] <= 100 && scores[i] >= 90) {
                gradeA++;
            } else if (scores[i] >= 80 && scores[i] < 90) {
                gradeB++;
            } else if (scores[i] >= 70 && scores[i] < 80) {
                gradeC++;
            } else if (scores[i] >= 60 && scores[i] < 70) {
                gradeD++;
            } else if (scores[i] >= 0 && scores[i] < 60) {
                gradeF++;
            } else {
                error++;
            }
        }
        JOptionPane.showMessageDialog(null, "The sum is " + sum
                + "\nThe average is " + sum / scores.length
                + "\nThe largest test score is " + max
                + "\nThe lowest test score is " + min
                + "\nThe number of students with scores of 90-100 (A) is " + gradeA
                + "\nThe number of students with scores of 80-89 (B) is " + gradeB
                + "\nThe number of students with scores of 70-79 (C) is " + gradeC
                + "\nThe number of students with scores of 60-69 (D) is " + gradeD
                + "\nThe number of students with scores below 60 (F) is " + gradeF
                + "\nThe number of sturdents with erroneous scores is " + error);
    }
}
