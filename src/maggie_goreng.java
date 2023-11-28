public class maggie_goreng {
    public static void main(String[] args) {
        maggie maggieObject = new maggie();
        System.out.println(maggieObject.toMilitary());
        System.out.println(maggieObject.toString());

        maggieObject.setTime(13, 27, 6);
          System.out.println(maggieObject.toMilitary());
        System.out.println(maggieObject.toString());
    }
}
