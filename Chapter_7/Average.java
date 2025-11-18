public class Average {
    public static int countGreaterThanAverage(int[] arr) {
        int count = 0;
        double total = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                double avg = total / i;
                if (arr[i] > avg) {
                    count++;
                }
            }
            total += arr[i];
        }
        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        System.out.println(countGreaterThanAverage(responseTimes));
    }
}
