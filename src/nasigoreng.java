public class nasigoreng {
    private String boyName;
    public nasigoreng(String name){ //constructor
        boyName = name;
    }
    public void setName(String name){
        boyName = name;
    }
    public String getName(){
        return boyName;
    }
    public void saying(){
        System.out.printf("my first bf was %s\n", getName());
    }
}
