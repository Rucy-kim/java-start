package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world";

        loopPrint(3, message);
        loopPrint(5, message);
        loopPrint(7, message);
    }

    public static void loopPrint(int max, String message) {
        for (int i = 0; i < max; i++) {
            System.out.println(message);
        }
    }
}
