package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int cur = 0;
        int sum = 0;
        for(int i = 1; i <= lengthOfLastNumber; i++) {
            cur = cur * 10 + 9;
            sum += cur;
        }
        System.out.println(sum);
    }
}
