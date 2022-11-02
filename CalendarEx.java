import java.util.Calendar;
class CalendarEx{
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Present Date & Time : " + calendar.getTime());
        System.out.println("Present Year : " + calendar.get(calendar.YEAR));
        System.out.println("Present Date : " + calendar.get(calendar.DATE));
        System.out.println("Present Month : " + calendar.get(calendar.MONTH));
        System.out.println("Present DAY : " + calendar.get(calendar.DATE));
    }
}
