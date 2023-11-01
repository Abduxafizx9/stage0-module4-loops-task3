package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    //public static void main(String[] args) {
    public void printFibonacci(int lastFibonacci) {
        int first=0,second=1;
        int n=0;
        System.out.println(first);
        System.out.println(second);
        for(int i =0;i<lastFibonacci-2;i++){

            n=n+second;

         System.out.println(n);
         if(i>=2){
             second=n-second;
         }



        }
    }
}
