public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int num)
    {
        int sum = 0;
        if(num < 0)
        {
            return -1;
        }
        else
        {
            while(num !=0)
            {
                if((num % 10) % 2 == 0 ) //if the last digit is even
                {
                    sum += (num%10);
                }
                num/=10;
            }
        }
        return sum;
    }
}
