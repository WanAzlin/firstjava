import java.util.Scanner;
public class tuna {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        ikan ikanObject = new ikan();

        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        ikanObject.setName(temp);
        ikanObject.saying();
    }
}
