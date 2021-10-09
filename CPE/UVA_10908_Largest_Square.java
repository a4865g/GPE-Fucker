import java.util.*;

public class main{
	public static void main(String[] argv){
		Scanner sc=new Scanner(System.in);
		int case_cnt=sc.nextInt();
		for(int x=0;x<case_cnt;x++){
			int m=sc.nextInt();
			int n=sc.nextInt();
			int q=sc.nextInt();
			System.out.println(m+" "+n+" "+q);
			char[][] grid=new char[m][n];
			for(int i=0;i<m;i++){
				String tmp=sc.next();
				for(int j=0;j<n;j++){
					grid[i][j]=tmp.charAt(j);
				}
			}

			for(int y=0;y<q;y++){
				int m2=sc.nextInt();
				int n2=sc.nextInt();
				char ch=grid[m2][n2];
				int i;
				
				for(i=0;i<m;i++){
					boolean flag=true;
					for(int j=m2-i;j<=m2+i&&flag;j++){
						for(int k=n2-i;k<=n2+i;k++){
							if(j<0||k<0||j>=m||k>=n||ch!=grid[j][k]){
								flag=false;
								break;
							}
						}
					}
					if(!flag){
						break;
					}
				}
				
				System.out.println(i*2-1);
				
				
			}
		}
	}
	
}