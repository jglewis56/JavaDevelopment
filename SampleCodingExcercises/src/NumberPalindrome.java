public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }
    public static boolean isPalindrome(int num)
    {
        if(num < 0)
            num = Math.abs(num);
        int number = num;
        int reverse = 0;
        int lastDigit;
        while(number > 0)
        {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /=10 ;
        }
        if (reverse == num)
            return true;
        else
            return false;
    }
}
