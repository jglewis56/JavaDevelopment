public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));

    }

    public static int sumFirstAndLastDigit(int num)
    {
        int lastDigit, firstDigit = 0;
        if(num < 0)
            return -1;
        else {
            lastDigit = num % 10;
            int number = num;
            while(number != 0)
            {
                firstDigit = number;
                number/=10;
            }
        }
        return firstDigit + lastDigit;

    }
}
