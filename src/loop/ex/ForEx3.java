package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1, max = 100; i <= max; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
