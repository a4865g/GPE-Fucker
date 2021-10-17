import java.util.*;

public class main {
	public static void main(String[] argv) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		boolean first = true;
		while(N-- > 0) {
			if (!first)
				System.out.println();
			int M = sc.nextInt();
			int ans[] = new int [M+1];
			for (int i = 1; i <= M; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				ans[i] = a + b;
			}
			
			for (int i = M; i >= 1; i--) {
				ans[i-1] += ans[i]/10;
				ans[i] %= 10;
			}
			
			StringBuilder sb = new StringBuilder();
			if (ans[0] != 0)
				sb.append(ans[0]); 
			
			for (int i = 1; i <= M; i++) 
				sb.append(ans[i]);
			
			System.out.println(sb.toString());
			first = false;
		}
	}
}