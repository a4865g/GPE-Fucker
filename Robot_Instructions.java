import java.util.*;
/*
24911:Robot Instructions
correct(1.00)
 */
public class Robot_Instructions {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        int[] isarr;
        while(scanner.hasNext()){
            int t=scanner.nextInt();
            StringBuilder ans=new StringBuilder();
            for (int i=0;i<t;i++){
                int n=scanner.nextInt();
                isarr=new int[n+1];
                scanner.nextLine();
                for(int j=1;j<=n;j++){
                    String s=scanner.nextLine();
                    if(s.equals("LEFT")){
                        isarr[j]=-1;
                    }else if (s.equals("RIGHT")){
                        isarr[j]=1;
                    }else{
                        String s2=s.substring(8);
                        int index=Integer.parseInt(s2);
                        isarr[j]=isarr[index];
                    }
                }
                int sum=0;
                for(int j=1;j<=n;j++){
                    sum+=isarr[j];
                }
                ans.append(sum).append("\n");
            }
            System.out.print(ans);
        }
    }
}
