import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
11174:Homer Simpson
correct(1.00)
 */

public class Homer_Simpson {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out=new StringBuilder();
        String l;
        String[] sp;
        int m,n,t;
        int[] f=new int[10005];
        while((l=br.readLine())!=null){
            sp=l.split(" ");
            m=Integer.parseInt(sp[0]);
            n=Integer.parseInt(sp[1]);
            t=Integer.parseInt(sp[2]);
            int min=Math.min(m,n);
            Arrays.fill(f,-1);
            f[0]=0;
            f[m]=1;
            f[n]=1;
            for(int i=min;i<=t;i++){
                if(f[i] != - 1 && i + m <= t)
                    f[i + m] = Math.max(f[i+m], 1 + f[i]);

                if(f[i] != - 1 && i + n <= t)
                    f[i + n] = Math.max(f[i+n], 1 + f[i]);
            }

            if(f[t]!=-1)
                out.append(f[t]+"\n");
            else{
                int i=t-1;
                while (f[i]==-1)
                    i--;
                out.append(f[i]+" "+(t-i)+"\n");
            }
        }
        System.out.print(out);
    }
}
