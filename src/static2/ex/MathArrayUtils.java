package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int result = 0;

        for (int i : array) {
            result += i;
        }

        return result;
    }

    public static double average(int[] array) {
        double sum = sum(array);

        return sum / array.length;
    }

    public static int min(int[] array) {
        int result = array[0];

        for (int i=1; i < array.length; i++) {
            int x = array[i];

            if (result > x) {
                result = x;
            }
        }

        return result;
    }

    public static int max(int[] array) {
        int result = array[0];

        for (int i=1; i < array.length; i++) {
            int x = array[i];

            if (result < x) {
                result = x;
            }
        }

        return result;
    }
}
