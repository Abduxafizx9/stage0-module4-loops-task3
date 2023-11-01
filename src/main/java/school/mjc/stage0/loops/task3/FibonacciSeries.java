package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int first=0,second=1;
        for(int i =0;i<lastFibonacci-2;i++){
            System.out.println(first);
            System.out.println(second);
            first+=second;
            second+=first;

        }
    }
}
