import java.util.*;
/*
10417:The Hotel with Infinite Rooms
correct(1.00)
 */
public class The_Hotel_with_Infinite_Rooms {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            long people=scanner.nextLong();
            long day=scanner.nextLong();
            long peopletmp=people;
            long count=people;
            while(peopletmp<day){
                count++;
                peopletmp+=count;
            }
            System.out.println(count);
        }

        /* TLE
        Scanner scanner=new Scanner(System.in);
        long people;
        long day;
        while (scanner.hasNext()){
            people=scanner.nextLong();
            day=scanner.nextLong();
            for(long i=1;i<=day;i+=people++);
            System.out.println(--people);
        }
         */
    }
}
