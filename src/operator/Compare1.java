package operator;

public class Compare1
{
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // 결과를 booleam형 변수에 담기
        boolean result = a == b;
        System.out.println(result);
    }
}
