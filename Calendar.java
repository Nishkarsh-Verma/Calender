import java.util.Scanner;
public class Calendar
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int days=0;
        System.out.println("Enter the date in the format of date.month.year");
        String s=sc.nextLine();
        int a[]={0,31,59,90,120,151,181,212,243,273,304,334};
        int b[]={0,31,60,91,121,152,182,213,244,274,305,335};
            String d=s.substring(0,2);
            String m=s.substring(3,5);
            String y=s.substring(6,10);
            int date=Integer.valueOf(d);
            int month=Integer.valueOf(m);
            int year=Integer.valueOf(y);
            if(year!=2001 && year>2001 && year<3000 )
            {
                days = days+(year-2001) * 365;
                days = days + (((year-2001) % 400) / 4);
                days = days + date;
               if(year%4==0)
                   days=days+b[month-1];
               else
                   days=days+a[month-1];
            }
            else if (year==2001)
            {
                days=days+a[month-1];
                days=days+date;
            }
            else
                System.out.println("Invalid year");
            if(days!=0)
            {
                   String arr[] ={"SUNDAY","MONDAY","TUESDAY","WEDNEDAY","THURSDAY","FRIDAY","SATURDAY"};
                System.out.println(arr[days%7]);
            }
    }
}
