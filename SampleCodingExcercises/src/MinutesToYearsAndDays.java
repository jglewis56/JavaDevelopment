public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(581760);
    }

    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }

        else {
            long years;
            long days = minutes / (60 * 24);
            years = days / 365;
            days = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
     }
}
