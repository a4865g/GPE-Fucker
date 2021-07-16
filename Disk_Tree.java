import java.util.*;

//Not done.
//Fuck u

public class Disk_Tree {
    public static void main(String[] argv){
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int numm=num;
        int[] s_index=new int[num];
        String[][] strings=new String[num][100];
        for(int i=0;i<num;i++){
            for(int j=0;j<100;j++){
                strings[i][j]="";
            }
        }
        while(num>0){
            String line=scanner.next();
            int index=0;
            for (int i=0;i<line.length();i++){
                if(line.charAt(i)=='\\'){
                    index++;
                    for(int j=0;j<index;j++)
                        strings[numm-num][index]+=" ";
                }else{
                    strings[numm-num][index]+=line.charAt(i);
                }
            }
            s_index[numm-num]=index;
            num--;
        }
//        for(int i=0;i<numm;i++)
//            for(int j=0;j<=s_index[i];j++)
//                System.out.println(strings[i][j]);
        String[][] ans=new String[numm][100];
        for(int i=0;i<numm;i++){
            for(int j=0;j<100;j++){
                ans[i][j]="";
            }
        }
        if(numm!=0)ans[0]=strings[0];
        int ans_index=1;
        int level=max(s_index,numm);
//        System.out.print(label);
        int level_ck=0;
        for (int i=1;i<numm;i++){
            for(int j=0;j<ans_index;j++){
                level_ck=0;
                for(int k=0;k<level;k++){
                    if(ans[j][k].equals(strings[i][k]) && !ans[j][k].equals("") && !strings[i][k].equals("")){
//                        System.out.println(i+" "+j+" "+k+" "+ans[j][k]);
                        level_ck++;
                    }else{
                        if(level_ck==0){
                            if(j==ans_index-1){
                                ans[ans_index]=strings[i];
                                ans_index++;
                            }
                            break;
                        }
                    }
                }

                if(level_ck!=0) {
                    int ans_null_index = 0;
                    for (int k = 0; k < 100; k++) {
                        if (ans[j][k].equals("")) {
                            ans_null_index = k;
                            break;
                        }
                    }
                    for (int z = level_ck; z <= s_index[i]; z++) {
                        ans[j][ans_null_index] = strings[i][z];
                        ans_null_index++;
                    }
                    break;
                }

            }

        }

        for(int i=0;i<numm;i++)
            for(int j=0;j<100;j++)
                if(ans[i][j]=="")
                    break;
                else
                    System.out.println("A:"+i+" "+j+" "+ans[i][j]);

    }

    private static int max(int[] s_index,int num) {
        int max=0;
        for(int i=0;i<num;i++){
            if(max<s_index[i]){
                max=s_index[i];
            }
        }
        return max;
    }
}
