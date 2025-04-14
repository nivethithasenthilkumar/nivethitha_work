


import java.util.*;

class date_day_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();

        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        boolean isLeapYear = checkYear(year);
        if (isLeapYear) {
            daysInMonth[2] = 29;
        }

        System.out.println(daysOfWeek[day - 1] + ", " + months[month - 1] + " " + daysInMonth[month] + ", " + year);
    }

    static boolean checkYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
}
}
