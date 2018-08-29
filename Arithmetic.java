public class Arithmetic
{
    public static void main (String [] args)
    {
        int a = 3;
        int b = 5;
        float x = 0.5f;
        float y = 1.5f;

        System.out.println();

        // AB
        System.out.println("AB");
        System.out.println(a + b);
        System.out.println((float) a / b);
        System.out.println((float) b / a);
        System.out.println();

        // AX
        System.out.println("AX");
        System.out.println(a + x);
        System.out.println((float) a / x);
        System.out.println(x / a);
        System.out.println();

        // AY
        System.out.println("AY");
        System.out.println(a + y);
        System.out.println((float) a / y);
        System.out.println(y / a);
        System.out.println();

        // BX
        System.out.println("BX");
        System.out.println(b + x);
        System.out.println(x / b);
        System.out.println((float) b / x);
        System.out.println();

        // BY
        System.out.println("BY");
        System.out.println(b + y);
        System.out.println(y / b);
        System.out.println((float) b / y);
        System.out.println();

        // XY
        System.out.println("XY");
        System.out.println(x + y);
        System.out.println(x / y);
        System.out.println(y / x);

    }
}
