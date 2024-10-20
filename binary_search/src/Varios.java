abstract class Shape{
    abstract void draw();
}

public class Varios {

    public static void main(String[] args) {
        Shape shape = new Shape(){
            public void draw() {
                System.out.println("Triangle");
            }
        };
        shape.draw();
        //Example of switch expression, it's like to When in kotlin
        var value = 3;
        String test = switch (value) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            default -> null;
        };
        System.out.println(test);
    }


}
