import java.util.*;
/*
10621:Luggage
correct(1.00)
 */
public class Luggage {
    static int[]w;
    static int[]f;
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s;
        s=scanner.nextLine();
        while(n>0){
            w=new int[22];
            f=new int[202];
            s=scanner.nextLine();
//                System.out.println("AAA:"+s);
            int sum=0;
            int index=0;
            int cnt=1;
            char ch;
            while(index<s.length()){
                ch=s.charAt(index);
                if(isnum(ch)){
                    int num=0;
                    while (isnum(ch)){
                        num=num*10+Integer.parseInt(String.valueOf(ch));
                        index++;
                        if(index==s.length())break;
                        ch=s.charAt(index);
//                            System.out.println(num);
                    }
                    w[cnt]=num;
                    sum+=w[cnt];
                    cnt++;
                    index++;
                }
            }
            for(int i=0;i<=sum;i++){
                f[i]=0;
            }
            f[0]=1;
            for(int i=0;i<cnt;i++){
                for(int j=sum;j>=w[i];j--){
                    if(f[j-w[i]]==1){
                        f[j]=1;
                    }
                }
            }
            if(sum%2==1||f[sum/2]==0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
            n--;
        }
    }

    private static boolean isnum(char ch) {
        return '0'<=ch &&ch<='9';
    }
}
