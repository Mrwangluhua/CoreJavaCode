package Test4_1;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //int year = date.getYear();
        int mouth = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today-1);//减去指定的天数，当前是已经过去13天了 然后减去（13-1）天就是减去12天
                                        //得到的是当前月份的第一天即2018-11-01；
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1;i<value;i++){
            System.out.print("    ");
        }
        while(date.getMonthValue()==mouth){
            System.out.printf("%3dws",date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() ==1){
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
}
