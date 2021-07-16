import java.util.*;
//2009-24:Unique lines
//correct(1.00)
public class Sumsets {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=scanner.nextInt();
            }
            Arrays.sort(arr);
            int ans=Ans(arr);
            if(ans==Integer.MAX_VALUE){
                System.out.println("no solution");
            }else{
                System.out.println(ans);
            }
        }
    }

    private static int Ans(int[] arr) {
        for(int d=arr.length-1;d>=0;d--){
            for(int a=0;a<arr.length;a++){
                for(int b=a+1;b<arr.length;b++){
                    for(int c=b+1;c<arr.length;c++){
                        if(arr[d]==arr[a]+arr[b]+arr[c]&&arr[d]!=arr[a]&&arr[d]!=arr[b]&&arr[d]!=arr[c]){
                            return arr[d];
                        }
                    }
                }
            }
        }
        return Integer.MAX_VALUE;
    }
}
