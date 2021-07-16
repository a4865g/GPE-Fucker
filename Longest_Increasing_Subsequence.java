import java.util.Scanner;
// 2015-09: Longest Increasing Subsequence
public class Longest_Increasing_Subsequence {
    public static void main(String[] arg){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=new int[n];
        int length[]=new int[n];
        for(int i=0;i<n;i++){//for reading array
            arr[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            length[i]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    length[i]=max(length[i],length[j]+1);
                }
            }
        }
        int l=0;
        for(int i=0;i<n;i++){
            l=max(l,length[i]);
        }
        System.out.println(l);
    }

    private static int max(int i, int i1) {
        if(i>i1){
            return i;
        }else{
            return i1;
        }
    }
}
