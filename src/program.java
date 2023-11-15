import java.util.Scanner;
public class program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //allows to input numbers
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while(counter <10){
            grade = input.nextInt(); //allows whatever input  you put and update the new value for grade
            total = total + grade;
            counter++;

        }
        average = total/10;
        System.out.println("your average is "+average);
    }
}
