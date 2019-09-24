import java.util.Scanner;

// Q 05

class StudentGrades{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students : ");
        int num = sc.nextInt();
        System.out.println();

        int[] grades = new int[num];
        int min = 100;
        int max  = 0;
        float total = 0;
        for(int i=0;i<num;i++){
            System.out.print("Enter the grade for student" + (i+1) +" : ");
            int score  = sc.nextInt();
            if( score < 0 || score > 100){
                System.out.println("ERROR : Invalid score! Please enter a value in rage 0-100");
                i--;
                continue;
            }
            grades[i] = score;
            total +=  score;
            if( score > max){
                max = score;
            }
            if( score < min ){
                min  = score;
            }
        }
        System.out.println("The average is : " + ( total / (num) ) );
        System.out.println("The minimum is : " + (min) );
        System.out.println("The maximum is : " + (max) );
    }

    
}