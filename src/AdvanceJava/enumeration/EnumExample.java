package AdvanceJava.enumeration;

enum Color{
    RED("red"), GREEN("green"), Blue("blue");

    private final String value;
    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class EnumExample {
    public static void main(String[] args) {
        Color c1 = Color.Blue;

        System.out.println("Name : " + c1.name());
        System.out.println("Value : " + c1.getValue() );

        for( Color color : Color.values()){
            System.out.println("Enum Value " + color.getValue());
            System.out.println("Enum name " + color.name());
        }
    }

}
