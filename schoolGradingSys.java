package grade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subject done");
        String subject = scanner.nextLine();
        System.out.println("enter number of students");
        int numberOfStudents=scanner.nextInt();
        System.out.println("enter tests done");
        int tests=scanner.nextInt();
        int[][] marks = new int[numberOfStudents][tests];

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                marks[i][j]=scanner.nextInt();
            }

        }

        Grade grade = new Grade(subject,marks);
        System.out.printf("CS12 %s\n",subject);
        grade.getCourseName();
        grade.processResults();
    }
}
package grade;

public class Grade {
    private String courseName;
    private int[][] grades;

    public Grade(String courseName, int[][] grades){
        this.courseName=courseName;
        this.grades=grades;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }
   public void processResults(){
        output();
       System.out.printf("the highest grade is: %3d\n",getHighest());
       System.out.printf("the lowest grade is: %3d\n",getLowest());

       outputBarChart();
       qualify();
   }

    private void qualify() {
        int count = 0;
        int occ = 0;
        for (int j= 0; j <grades.length;j++) {


            for (int i = 0; i < grades[j].length; i++) {
                if (grades[j][i] > 70) {
                    count = 1;
                    break;
                }
            }
                if (count == 1)
                    occ++;


        }


            System.out.println(occ+" Students passed atleast one test!");
    }

    private void outputBarChart() {
        int[] frequency=new int[11];
        for (int[] grade:grades) {
            for (int grad : grade) {
                ++frequency[grad/ 10];
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if(i==10)
                System.out.printf("%5d",100);
            else
                System.out.printf("%02d-%02d",i*10,i*10 +9);

            for (int j = 0; j < frequency[i]; j++) {
                System.out.printf(" *");
            }
            System.out.println();
        }
    }

    private double getAverage(int[] marks) {
        int count=0;
        for(int grade:marks){
            count+=grade;
        }
        return (double)count/marks.length;
    }

    private int getLowest() {
        int low=grades[0][0];
        for(int[] grade:grades){
            for(int grad:grade) {
                if (grad < low)
                    low = grad;
            }
        }
        return low;
    }

    private int getHighest() {
        int max=grades[0][0];
        for(int[] grade:grades) {
            for (int grad : grade) {
                if (grad > max)
                    max = grad;
            }
        }
        return max;
    }

    private void output() {

        System.out.println("The grades are\n");
        System.out.printf("            ");
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test%d  ",test+1);
        System.out.println("Average      GRADE");

            for (int i = 0; i < grades.length; i++) {
                System.out.printf("Student %d",i+1);
                for (int test:grades[i]){
                    System.out.printf("%8d",test);
                }
                double average = getAverage(grades[i]);

                System.out.printf("%9.2f",average);

                switch ((int)average/10){
                    case 10:
                    case 9:
                    case 8:
                        System.out.println("     A");
                        break;
                    case 7:
                    case 6:
                        System.out.println("     B");
                        break;
                    case 5:
                    case 4:
                        System.out.println("     C");
                        break;
                    case 3:
                    case 2:
                        System.out.println("     D");
                        break;
                    default:
                        System.out.println("     F");
                        break;
                }
            }

    }
}

