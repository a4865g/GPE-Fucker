import java.util.*;

public class main{
	public static void main(String[] argvs){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextDouble()){
			double[][] point=new double[4][2];
			double[] same=new double[2];
			for(int i=0;i<4;i++){
				point[i][0]=sc.nextDouble();
				point[i][1]=sc.nextDouble();
			}
			
			for(int i=0;i<4;i++){
				for(int j=i+1;j<4;j++){
					if(point[i][0]==point[j][0]&&point[i][1]==point[j][1]){
						same[0]=point[i][0];
						same[1]=point[i][1];
					}
				}
			}
			
			double x=0,y=0;
			for(int i=0;i<4;i++){
				if(!(point[i][0]==same[0]&&point[i][1]==same[1])){
					x+=point[i][0];
					y+=point[i][1];
				}
			}
			System.out.printf("%.3f %.3f",x-same[0],y-same[1]);
			System.out.println("");
		}
		
	}
}