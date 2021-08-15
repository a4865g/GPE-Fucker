import java.util.*;

/*
10645:Euclid Problem

 */
public class Euclid_Problem {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            long a=scanner.nextLong();
            long b=scanner.nextLong();
            long x=0;
            long y=1;
            long pre_x=1;
            long pre_y=0;
            while(b!=0){
                long q=a/b;

                long tmp=b;
                b=a%b;
                a=tmp;

                long next_x=pre_x-q*x;
                pre_x=x;
                x=next_x;

                long next_y=pre_y-q*y;
                pre_y=y;
                y=next_y;
            }
            System.out.println(pre_x+" "+pre_y+" "+a);
        }
    }
}
