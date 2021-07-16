import java.util.Scanner;

// 2009-02:Line Overlap Problem

// timelimit e04
public class Line_Overlap_Problem {
    public static void main (String[] args){
        try {
            Scanner scanner=new Scanner(System.in);
            int i[]=new int[100000];
            int j[]=new int[100000];
            int cnt=0;
            while(scanner.hasNext()){
                String in=scanner.next();
                if(in.equals(".")){
                    break;
                }
                i[cnt]=Integer.parseInt(in);
                j[cnt]=scanner.nextInt();
                cnt++;
            }
            long length=0;
            for(int k=0;k<cnt-1;k++){
                for (int z=k+1;z<cnt;z++){
                    if(i[k]<=j[z]&&j[k]>=i[z]){
                        if(i[k]>=i[z]&&j[k]<=j[z]){
                            length+=j[k]-i[k];
                            continue;
                        }
                        if(i[k]<i[z]&&j[k]>j[z]){
                            length+=j[z]-i[z];
                            continue;
                        }
                        if(i[k]>=i[z]&&j[k]>j[z]){
                            length+=j[z]-i[k];
                            continue;
                        }
                        if (i[k] < i[z] && j[k] <= j[z]){
                            length+=j[k]-i[z];
                            continue;
                        }
                    }
                }

            }
            System.out.println(length);

        }catch (Exception e){
        }

    }
}
