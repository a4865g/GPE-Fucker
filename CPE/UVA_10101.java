import java.util.*;
/*
100 shata
1000 hajar
100000 lakh
10000000 kuti
1000000000 shata
10000000000 hajar
...
*/
public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		int num=0;
		while(sc.hasNextLong()){
			long in=sc.nextLong();
			num++;
			System.out.printf("%4d.",num);
			if(in==0){
				System.out.print(" 0");
			}else{
				change(in);
			}
			System.out.println("");
		}
	
	}
	public static void change(long num){
		if(num>=10000000){
			change(num/10000000);
			System.out.print(" kuti");
			num=num%10000000;
		}
		if(num>=100000){
			change(num/100000);
			System.out.print(" lakh");
			num=num%100000;
		}
		if(num>=1000){
			change(num/1000);
			System.out.print(" hajar");
			num=num%1000;
		}
		if(num>=100){
			change(num/100);
			System.out.print(" shata");
			num=num%100;
		}
		if(num>0){
			System.out.print(" "+num);
		}
	}
}