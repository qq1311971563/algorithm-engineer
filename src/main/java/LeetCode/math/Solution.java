package LeetCode.math;

public class Solution {

    public int countPrimes(int n) {
        int sum = 0;
        for (int i = 2; i < n; i++) {
            if (n > 10) {
                if (n % 10 == 1 || n % 10 == 3 || n % 10 == 7 || n % 10 == 9) {
                    if (isPrimeNumber(n)) {
                        sum++;
                    }
                } else {
                    continue;
                }
            } else {
                if (isPrimeNumber(i))
                    sum++;
            }
        }

        return sum;
    }

    public boolean isPrimeNumber(int x) {
        for (int i = 2; i * i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countPrimes(10));
    }
}
