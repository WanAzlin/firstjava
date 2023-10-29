import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        Scanner azlin = new Scanner (System.in);
        double fnum, snum, answer;
        System.out.println("Enter first number:  ");
        fnum = azlin.nextDouble();
        System.out.println("Enter second number:  ");
        snum = azlin.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);



    }
}
