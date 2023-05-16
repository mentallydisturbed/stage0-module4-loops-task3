package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int fi = 1;
        int se = 1;

        System.out.println(fi);
        if(lastFibonacci > 1) System.out.println(se);

        for(int i = 3; i <= lastFibonacci; i++) {
            int th = fi + se;
            fi = se;
            se = th;
            System.out.println(se);
        }
    }
}
