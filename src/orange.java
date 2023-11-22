public class orange {
    public static void main(String[] args) {
        int  bucky [] = { 12,21,43,12,43};
        int sum =0;

        for (int counter=0; counter<bucky.length; counter++){
            sum += bucky[counter];
        }

        System.out.println("The sum of these numbers is " +sum);

    }
}
