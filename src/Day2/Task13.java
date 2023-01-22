package Day2;

public class Task13 {
    public static void main(String[] args) {
    int[] inputs = {4, 5, 17};

    System.out.println(getMinValue(inputs));
    System.out.println(getMaxValue(inputs));
    System.out.println(sum(inputs));
    }
    private static int getMinValue(int[] inputs) {
        int minValue = Integer.MAX_VALUE;
        for(int element : inputs) {
            if(minValue > element) {
                minValue = element;
            }
        }
        return minValue;
    }
    private static int getMaxValue(int[] inputs) {
        int maxValue = Integer.MIN_VALUE;
        for(int element : inputs) {
            if(maxValue < element) {
                maxValue = element;
            }
        }
        return maxValue;
    }
    private static int sum(int[] inputs) {
        int sum = 0;
        for(int element :inputs) {
            sum += element;
        }
        return sum;
    }
}
