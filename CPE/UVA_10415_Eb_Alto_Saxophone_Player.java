import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		sc.nextLine();
		String[] finger={"c0111001111","d0111001110","e0111001100","f0111001000","g0111000000","a0110000000","b0100000000","C0010000000","D1111001110","E1111001100","F1111001000","G1111000000","A1110000000","B1100000000"};
		while((--case_cnt)>=0){
			int[] cnt=new int[10];
			String st=sc.nextLine();
			String current="0000000000";
			for(int i=0;i<st.length();i++){
				String tmp="";
				for(int j=0;j<finger.length;j++){
					if(st.charAt(i)==finger[j].charAt(0)){
						tmp=finger[j];
						break;
					}
				}
				tmp=tmp.substring(1);
				
				for(int j=0;j<10;j++){
					if(current.charAt(j)!=tmp.charAt(j)&&tmp.charAt(j)=='1'){
						cnt[j]++;
					}
				}
				
				current=tmp;
			}
			
			for(int i=0;i<10;i++){
				if(i<9){
					System.out.print(cnt[i]+" ");
				}else{
					System.out.println(cnt[i]);
				}
			}
		}
	}
}