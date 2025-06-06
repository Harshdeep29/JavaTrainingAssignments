package Assignment_01_PowerCalculator;

public class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        }
        return (long) Math.pow(n, p);
    }
}
