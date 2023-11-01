package school.mjc.stage0.loops.task3;
import java.lang.Math;
public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum=0,num=10;
        for(int i =1;i<=lengthOfLastNumber;i++)
        {
            num=(int)(Math.pow(num,i))-1;
            sum+=num;

        }

    }
}
