public class SharedDigit {
    public static void main(String[] args) {
        //System.out.println(hasSharedDigit(12,42));
       // System.out.println(hasSharedDigit(9,99));
        System.out.println(hasSharedDigit(51,55));

    }
    public static boolean hasSharedDigit(int num1, int num2)
    {
        boolean check= num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99;
        int digit1, digit2, holder = num2;
        if(!check)
            return false;
        else
        {
            while(num1 != 0)
            {
                digit1 = num1 % 10;
                while(num2 != 0)
                {
                    digit2 = num2 % 10;
                    if(digit1==digit2)
                        return true;
                    num2/=10;
                }
                num1/=10;
                num2 = holder;
            }
            return false;
        }
    }
}
