package Day1;

public class Task6 {
    public static void main(String[] args) {
        int multiplier = 6;
        int multiplicandMin = 2;
        int multiplicandMax = 5;

        forLoop(multiplier, multiplicandMin, multiplicandMax);
        System.out.println();
        whileLoop(multiplier, multiplicandMin, multiplicandMax);
    }

    public static void forLoop(int multiplier,
                             int multiplicandMin, int multiplicandMax) {
        for (;multiplicandMin <= multiplicandMax; multiplicandMin++) {
            int sum = multiplier * multiplicandMin;
            System.out.println(multiplier +" x " + multiplicandMin + " = " + sum );
        }
    }
    public static void whileLoop(int multiplier,
                                 int multiplicandMin, int multiplicandMax) {
        while (multiplicandMin <= multiplicandMax) {
            int sum = multiplier * multiplicandMin;
            System.out.println(multiplier +" x " + multiplicandMin + " = " + sum );
            multiplicandMin++;
        }
    }
}
