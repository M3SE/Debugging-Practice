public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5};
        double average = calculateAverage(testArray);
        System.out.println("The average is: " + average);

        try {
            int[] nullArray = null;
            calculateAverage(nullArray);
        } catch (Exception e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }

        try {
            int[] smallArray = {1};
            System.out.println(smallArray[1]);
        } catch (Exception e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }

        try {
            int[] wrongAverageArray = {10, 20, 30};
            double wrongAverage = calculateAverage(wrongAverageArray);
            System.out.println("The wrong average is: " + wrongAverage);
        } catch (Exception e) {
            System.out.println("Logic Error: " + e.getMessage());
        }
    }
}
