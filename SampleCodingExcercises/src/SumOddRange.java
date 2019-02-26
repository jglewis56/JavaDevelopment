public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));
    }

    public static boolean isOdd(int num)
    {
        if(num<0)
            return false;
        else
            if(num % 2 != 0)
            return true;

            else
            return false;
    }

    public static int sumOdd(int start, int end)
    {
        boolean check = end >= start && start > 0 && end > 0;
        int sum=0;
        if(check)
        {
            for(int i = start; i <= end; i++)
            {
                if(isOdd(i))
                {
                    sum+=i;
                }
                else
                    continue;
            }
            return sum;
        }
        else
            return -1;
    }
}
