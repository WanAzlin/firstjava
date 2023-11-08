public class ikan {
    private String girlName; //public = any class can use variable but private only method inside class can use it
    public void setName(String name){
        girlName = name;
    }
    public String getName(){
        return girlName;
    }

    public void saying(){
        System.err.printf("your first gf was %s ", getName());
    }

}
