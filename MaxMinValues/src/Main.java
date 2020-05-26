public class Main
{
    public static void main(String args[])
    {
        Byte byteMax = Byte.MAX_VALUE;
        Byte byteMin = Byte.MIN_VALUE;
        System.out.println("Максимальное значение byte = " + byteMax.toString());
        System.out.println("Минимальное значение byte = " + byteMin.toString());

        System.out.println();

        Integer intMax = Integer.MAX_VALUE;
        Integer intMin = Integer.MIN_VALUE;
        System.out.println("Максимальное значение Integer = " + intMax.toString());
        System.out.println("Минимальное значение Integer = " + intMin.toString());

        System.out.println();

        Short shortMax = Short.MAX_VALUE;
        Short shortMin = Short.MIN_VALUE;
        System.out.println("Максимальное значение Short = " + shortMax.toString());
        System.out.println("Минимальное значение Short = " + shortMin.toString());

        System.out.println();

        Long longMax = Long.MAX_VALUE;
        Long longMin = Long.MIN_VALUE;
        System.out.println("Максимальное значение Long = " + longMax.toString());
        System.out.println("Минимальное значение Long = " + longMin.toString());

        System.out.println();

        Float floatMax = Float.MAX_VALUE;
        Float floatMin = -(Float.MAX_VALUE);
        System.out.println("Максимальное значение Float = " + floatMax.toString());
        System.out.println("Минимальное значение Float = " + floatMin.toString());

        System.out.println();

        Double doubleMax = Double.MAX_VALUE;
        Double doubleMin = -(Double.MAX_VALUE);
        System.out.println("Максимальное значение Double = " + doubleMax.toString());
        System.out.println("Минимальное значение Double = " + doubleMin.toString());
    }
}
