import java.util.Scanner;

public class milo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nasilemak nasilemakObject = new nasilemak ();

        System.out.println("Enter your name here: ");
        String name = input.nextLine();

        nasilemakObject.simpleMessage(name);

    }
}
