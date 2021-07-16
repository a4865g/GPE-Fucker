import java.io.IOException;
import java.util.*;

public class Oil_Deposits {
    static boolean visited[][];
    static char[][] input;
    static int col,raw;
    public static void main(String[] argv)throws IOException {
        Scanner scanner=new Scanner(System.in);
        StringBuilder ans=new StringBuilder();
        while(scanner.hasNext()){
            col=scanner.nextInt();
            raw=scanner.nextInt();
            if(col==0 &&raw==0){
                break;
            }
            input=new char[col][raw];
            visited=new boolean[col][raw];
            for(int i=0;i<col;i++){
                String in=scanner.next();
                for(int j=0;j<raw;j++){
                    input[i][j]=in.charAt(j);
                }
            }
            int cnt=0;
            for(int i=0;i<col;i++){
                for(int j=0;j<raw;j++){
                    if(!visited[i][j]&&input[i][j]=='@'){
                      cnt++;
                      floodFill(i,j);
                    }
                }
            }
            ans.append(cnt).append("\n");
        }
        System.out.print(ans.toString());
    }

    public static void floodFill(int i, int j) {
        if(!valid(i,j)||input[i][j]!='@'||visited[i][j])
            return;
        visited[i][j]=true;

        floodFill(i,j-1);
        floodFill(i,j+1);
        floodFill(i+1,j-1);
        floodFill(i+1,j);
        floodFill(i+1,j+1);
        floodFill(i-1,j-1);
        floodFill(i-1,j);
        floodFill(i-1,j+1);
    }

    private static boolean valid(int i, int j) {
        return ((i >= 0 && i < col) && (j >= 0 && j < raw));
    }
}
