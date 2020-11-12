package petrs.beforeOOP;

import petrs.Utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;

/**
 * Уроки по математике проводятся через день.
 * Если урок попадает на воскресенье, то переносится на понедельник.
 * Пользователь вводит дату первого урока.
 * Сгенерируйте расписание из дат на текущий месяц.
 */

public class Task_8 {
    public static void main(String[] args) {
        Date date = new Date();
        createSchedule(date);
    }

    private static void createSchedule(Date date) {
        LinkedList<String> schedule = new LinkedList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Calendar calendar = Calendar.getInstance();
        int currentMonth = calendar.get(Calendar.MONTH);
        String currentDate = dateFormat.format(date);
        schedule.add(currentDate);

        while (calendar.get(Calendar.MONTH) == currentMonth) {
            calendar.add(Calendar.DAY_OF_WEEK, 2);
            int nextDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
            if (nextDayOfWeek == 1) {
                calendar.add(Calendar.DAY_OF_WEEK, 1);
                String nextDate = dateFormat.format(calendar.getTimeInMillis());
                schedule.add(nextDate);
            } else {
                String nextDate = dateFormat.format(calendar.getTimeInMillis());
                schedule.add(nextDate);
            }
        }

        int count = 0;
        while (!schedule.isEmpty()) {
            if (count == schedule.size()) break;
            Utils.println(schedule.get(count++));
        }
    }
}
