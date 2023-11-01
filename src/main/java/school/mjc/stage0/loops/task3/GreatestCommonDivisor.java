package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
    //public static void main(String[] args) {
        //int first = 100,second= 0;
        int divider;
        if(first == 0 || second == 0)
            System.out.println(0);
        else if(first>=second)
        {

            divider=second;
            for(;divider>=1;divider--) {
                if (first % divider == 0 && second %divider==0) {
                    System.out.println(divider);
                    break;
                }
            }
        }

        else
            {
                divider=first;
                for(;divider>=1;divider--) {
                    if (second % divider == 0 && first %divider==0) {
                        System.out.println(divider);
                        break;
                    }
                }
            }

        }
    }

