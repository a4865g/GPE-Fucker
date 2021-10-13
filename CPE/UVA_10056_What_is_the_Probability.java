import java.util.*;

/*
����v==
n������ �X�ӤH�� �C�HĹ�����v �D��k��Ĺ

Round_1�G
�Ĥ@�ӤH��Ӫ����v�Gp
�ĤG�ӤH��Ӫ����v�Gq*p
�ĤT�ӤH��Ӫ����v�G(q^2)*p
��k�ӤH��Ӫ����v�G(q^(k-1))*p
Round_2�G
�Ĥ@�ӤH��Ӫ����v�G(q^n)*p
�ĤG�ӤH��Ӫ����v�G(q^n)*q*p
�ĤT�ӤH��Ӫ����v�G(q^n)*(q^2)*p
��k�ӤH��Ӫ����v�G(q^n)*(q^(k-1))*p
Round_R�G
�Ĥ@�ӤH��Ӫ����v�G(q^(R-1)*n)*p
�ĤG�ӤH��Ӫ����v�G(q^(R-1)*n)*q*p
�ĤT�ӤH��Ӫ����v�G(q^(R-1)*n)*(q^2)*p
��k�ӤH��Ӫ����v�G(q^(R-1)*n)*(q^(k-1))*p

�ϥε���żƾ�z�C�Ӧ^�X��Ӫ����v�i�H�o���G(q^(k-1)*p) * (1-(q^n^R)) / (1-q^n)
(�����G(q^(k-1)*p)�B����Gq^n)
*/

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		
		int cnt=sc.nextInt();
		int R=50;
		
		while(cnt>0){
			int n=sc.nextInt();
			double p=sc.nextDouble();
			double q=1-p;
			int k=sc.nextInt();
			
			double a=Math.pow(q,k-1)*p;
			double r=Math.pow(q,n);
			
			if(p==0){
				System.out.println("0.0000");
			}else{
				System.out.printf("%.4f\r\n",a*(1-Math.pow(r,R))/(1-r));
			}
			
			cnt--;
		}
	}
}