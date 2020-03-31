import java.time.Month;
import java.util.List;


public class Calendar {

    public static void printCalendar(Month month){

        List<Day> printList = Day.createDays(month);

        System.out.println(" Mo Tu We Th Fr" + "\u001B[31m" + " Sa Su" + "\u001B[0m");
        String defaultPrintParameter = "%3d";

        for (Day day:printList) {

            if(day.isFirstDayOfMonth()){
                day.printFirstDayOfMonth();
                continue;
            }
            if(day.isToday()){
                day.printToday(defaultPrintParameter);
                continue;
            }
            if (day.isWeekend()){
                day.printWeekend(defaultPrintParameter);
                continue;
            }
            System.out.printf(defaultPrintParameter,day.getPrintValue());
        }
    }
}