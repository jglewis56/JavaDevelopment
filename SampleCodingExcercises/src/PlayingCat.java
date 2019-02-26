public class PlayingCat {
    public static void main(String[] args) {

    }
    public static boolean isPlaying(boolean summer, int temperature)
    {
        boolean notSummerTimePlay = temperature >= 25 && temperature <= 35;
        boolean summerTimePlay =  temperature >= 25 && temperature <= 45;
        if(summer) {
            if (summerTimePlay)
                return true;
            else
                return false;
        }
        else
        {
            if(notSummerTimePlay)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
