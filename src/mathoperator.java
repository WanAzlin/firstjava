import java.util.Scanner;

public class mathoperator {
    public static void main(String[] args) {
        Scanner azlin = new Scanner (System.in);
        int girls, boys, people;

        girls =11;
        boys =3;
        people = girls % boys;

        System.out.println(people);
    }
}
