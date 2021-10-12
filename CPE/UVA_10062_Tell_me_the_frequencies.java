import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int n=0;
		while(sc.hasNextLine()){
			if(n!=0){
				System.out.println("");
			}
			String st=sc.nextLine();
			int[] arr=new int[128];
			int max=0;
			for(int i=0;i<st.length();i++){
				arr[st.charAt(i)]++;
			}
			
			for(int i=0;i<128;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			
			for(int i=1;i<=max;i++){
				for(int j=127;j>=0;j--){
					if(arr[j]==i){
						System.out.println(j+" "+i);
					}
				}
			}
			n++;
		}
	}
}