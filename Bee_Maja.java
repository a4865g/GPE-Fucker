import java.util.Scanner;
// 10551: Bee Maja
public class Bee_Maja {
    static int x;
    static int y;
    static int varv;
    static int input;
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);
        while(sn.hasNextInt()){
            input=sn.nextInt();
            x=0;
            y=0;
            varv=0;
            solve();
            System.out.println(x+" "+y);
        }
    }
    private static void solve(){
        while(true){
            if(input==1){
                return;
            }
            varv++;
            y++;
            input--;
            if(input==1){
                return;
            }
            for (int i=0;i<varv-1;i++){
                x--;
                y++;
                if(--input==1){
                    return;
                }
            }
            for (int i=0;i<varv;i++){
                x--;
                if(--input==1){
                    return;
                }
            }
            for (int i=0;i<varv;i++){
                y--;
                if(--input==1){
                    return;
                }
            }
            for (int i=0;i<varv;i++){
                x++;
                y--;
                if(--input==1){
                    return;
                }
            }
            for (int i=0;i<varv;i++){
                x++;
                if(--input==1){
                    return;
                }
            }
            for (int i=0;i<varv;i++){
                y++;
                if(--input==1){
                    return;
                }
            }

        }
    }
}
