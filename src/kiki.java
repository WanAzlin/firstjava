public class kiki {
    public static void main(String[] args) {
        int azira[] = {23,43,54,24,54};
        change(azira);

        for(int y: azira)
            System.out.println(y);
    }

    public static void change (int x[]){
        for(int counter=0; counter<x.length; counter++){
            x[counter]+=5;
        }
    }




}
