package school.mjc.stage0.loops.task3;
import java.lang.Math;
public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
    //public static void main(String[] args) {
        //int lengthOfLastNumber=6;
     int sum=0,num;
        for(int i =1;i<=lengthOfLastNumber;i++)
        {
            num=10;
            num=(int)Math.pow(num,i)-1;
            sum+=num;
            //System.out.println(num);

        }
        System.out.println(sum);

    }
}
