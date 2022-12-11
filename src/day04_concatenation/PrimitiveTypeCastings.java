package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {
        // Implicit casting ----------
        // smaller Primitive type casting to bigger primitive
        // byte => short => int => long => float => double
        byte a = 12;
        int c = a;// implicit casting
        long d = 3000L;
        float f = d; // implicit casting

        // Explicit casting--------
        // assign larger primitive type to the smaller primitive types.
        // has to be done manually,every time

        int h = 100;
        byte b = (byte) a;

        long x = 2000;
        short y = (short)x;

        float z = 20.3f;
        short q = (short)z;
        System.out.println(q);

        double n1 = 2.5;
        byte n2 = (byte) n1;

        int r = 50000;
        short t = (short) r;

        System.out.println(t);





    }
}
