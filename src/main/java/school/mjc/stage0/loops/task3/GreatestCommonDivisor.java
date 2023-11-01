package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first>=second)
        {
            for(;second<=1;second--) {
                if (first % second == 0) {
                    System.out.println(second);
                    break;
                }
            }

        }
        else if(first == 0 || second == 0)
            System.out.println(0);
        else
        {
            for(;first<=1;first--) {
                if (second % first == 0) {
                    System.out.println(first);
                    break;
                }
            }
        }
    }
}
