public class Main {

    public static void main(String[] args) {
        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();

        System.out.println(numberOfDaysInMonth.isLeapYear(-1600));
        System.out.println(numberOfDaysInMonth.isLeapYear(1600));
        System.out.println(numberOfDaysInMonth.isLeapYear(2017));
        System.out.println(numberOfDaysInMonth.isLeapYear(2020));

        System.out.println();
        System.out.println();


       // numberOfDaysInMonth.getDaysInMonth(1,2020);
      //  numberOfDaysInMonth.getDaysInMonth(2,2020);
       // numberOfDaysInMonth.getDaysInMonth(2, 2018);
       // numberOfDaysInMonth.getDaysInMonth(-1, 2020);
       // numberOfDaysInMonth.getDaysInMonth(1, -2020);

       System.out.println(numberOfDaysInMonth.getDaysInMonth(1,2020));
       System.out.println(numberOfDaysInMonth.getDaysInMonth(2,2020));
       System.out.println(numberOfDaysInMonth.getDaysInMonth(2, 2018));
       System.out.println(numberOfDaysInMonth.getDaysInMonth(-1, 2020));
       System.out.println(numberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
