package nyc.c4q.hoshikoo;

/**
 * Created by Hoshiko on 3/19/15.
 */

import java.util.Scanner;
import java.util.Calendar;

    public class BirthdayCalculator {
        public static void main(String[] args){
/*
        Calendar rightNow = Calendar.getInstance();
        java.text.SimpleDateFormat df1 = new java.text.SimpleDateFormat("MM");
        System.out.println(df1.format(rightNow.getTime()));



        int year = c.get(Calendar.YEAR);
        System.out.println(year);
        int month = c.get(Calendar.MONTH);
        System.out.println(month);
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
*/
        Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_YEAR);
        System.out.println(day);

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter your birthday: ");
        System.out.print("What is the month (1-12): ");
        int birthMonth = input.nextInt();
        System.out.print("What is the day (1-31): ");
        int birthDay = input.nextInt();

        int january = 31;
        int february = 28;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july =31;
        int august = 31;
        int september = 30;
        int october =31;
        int november = 30;
        int december =31;

        if (birthMonth == 1){
            birthDay=birthDay;
        }else if (birthMonth == 2){
            birthDay=january+birthDay;
        }else if (birthMonth == 3){
            birthDay=birthDay+january+february;
        }else if (birthMonth == 4){
            birthDay=birthDay+january+february+march;
        }else if (birthMonth == 5){
            birthDay=birthDay+january+february+march+april;
        }else if (birthMonth == 6){
            birthDay=birthDay+january+february+march+april+may;
        }else if (birthMonth == 7){
            birthDay=birthDay+january+february+march+april+may+june;
        }else if (birthMonth == 8){
            birthDay=birthDay+january+february+march+april+may+june+july;
        }else if (birthMonth == 9){
            birthDay=birthDay+january+february+march+april+may+june+july+august;
        }else if (birthMonth == 10){
            birthDay=birthDay+january+february+march+april+may+june+july+august+september;
        }else if (birthMonth == 11){
            birthDay=birthDay+january+february+march+april+may+june+july+august+september+october;
        }else if (birthMonth == 12){
            birthDay=birthDay+january+february+march+april+may+june+july+august+september+october+november;
        }
            System.out.println(birthDay);
            //System.out.println(day);

            if ((birthDay-day)<0){
                System.out.print((birthDay-day)+365);
            }else{
                System.out.print(birthDay-day);
            }
    }

}
