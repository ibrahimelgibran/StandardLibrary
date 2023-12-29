package iegcode.standard.classes;

import java.util.Calendar;
import java.util.Date;

public class DataApp {
    public static void main(String[] args) {

        Date tanggal = new Date(1082134800000L);
        System.out.println(tanggal);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, Calendar.APRIL);
        calendar.set(Calendar.HOUR_OF_DAY, 17);

        Date result = calendar.getTime();
        System.out.println(result);

    }
}
