import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import static java.lang.StrictMath.abs;

//2009-24:Unique lines
//wrong-answer(0.4)
public class Unique_lines {
    public static void main(String[] argv){
        try{
            Scanner scanner=new Scanner(System.in);
            int in_line=scanner.nextInt();
            int cnt=0;
            int[] ans=new int[in_line];
            while(in_line!=0){
                in_line--;
                int count=scanner.nextInt();
                int x[]=new int[count];
                int y[]=new int[count];
                for(int i=0;i<count;i++){
                    x[i]=scanner.nextInt();
                    y[i]=scanner.nextInt();
                }
                ans[cnt]= Print_ans(x,y,count);
//                System.out.println(Print_ans(x,y,count));
                cnt++;
            }
            for(int i=0;i<cnt;i++){
                System.out.println(ans[i]);
            }

        }catch (Exception e){

        }


    }
    static int Print_ans(int[] x, int[] y, int range){
        int ans=0;
        double line;
        double[] line_a=new double[range*range];
        int[] x1=new int[range*range];
        int[] y1=new int[range*range];
        int line_index=0;
        for(int i=0;i<range;i++){
            for(int j=i+1;j<range;j++) {
                if(x[i]-x[j]==0){
                    line=Double.MAX_VALUE;
                }else{
                    line=(double)(y[i]-y[j])/(x[i]-x[j]);
                }
                if(not_in(line,x1,y1,line_a,x[j],y[j])){
                    ans++;
                    line_a[line_index]=line;
                    x1[line_index]=x[i];
                    y1[line_index]=y[i];
                    line_index++;
                }
            }
//            System.out.println(ans);
        }
        return ans;
    }
    static boolean not_in(double line,int[] x1,int[] y1,double[] line_a,int x,int y){
        double line1;
        int index=-1;
        for (int i=0;i<line_a.length;i++){
            if(Double.compare(line,line_a[i])==0){
                index=i;
                break;
            }
        }
        if(index!=-1){
            if(x-x1[index]==0){
                line1=Double.MAX_VALUE;
            }else{
                line1=(double)(y-y1[index])/(x-x1[index]);
            }
            if(Double.compare(line1,line)==0)
                return false;
            else
                return true;
        }else{
            return true;
        }


    }
}
