import java.util.*;

//
public class Prefix_expression_evaluation {
    public static void main(String[] argv){

        Scanner scanner=new Scanner(System.in);
        while(true){
            Stack<Integer> stack=new Stack<>();
            boolean ck=true;
            String line=scanner.nextLine();
            if(line.equals("."))break;
            char[] ch=new char[1025];
            int ch_i=0;
            for(int i=line.length()-1;i>=0;i--){
                ch[ch_i]=line.charAt(i);
                ch_i++;
            }
            for (int i=0;i<line.length();i++){
                if(is_op(ch[i])){
                    if(stack.empty()){
                        ck=false;
                        break;
                    }else{
                        int num1= stack.pop();
                        if(stack.empty()){
                            ck=false;
                            break;
                        }
                        int num2= stack.pop();
                        switch (ch[i]){
                            case '+':
                                stack.push(num1+num2);
                                break;
                            case '-':
                                stack.push(num1-num2);
                                break;
                            case '*':
                                stack.push(num1*num2);
                                break;
                            case '/':
                                stack.push(num1/num2);
                                break;
                            case '%':
                                stack.push(num1%num2);
                                break;
                        }
                    }
                } else if(is_num(ch[i])){
                    int num=Integer.parseInt(String.valueOf(ch[i]));
                    i++;
                    int w=10;
                    while(i<ch_i&&is_num(ch[i])){
                        num=num+w*Integer.parseInt(String.valueOf(ch[i]));
                        i++;
                        w=w*10;
                    }
                    stack.push(num);
                    i--;
                }

            }
            if(ck){
                if(stack.empty()){
                    System.out.println("illegal");
                }else{
                    int ans= stack.pop();
                    if(!stack.empty()){
                        System.out.println("illegal");
                    }else{
                        System.out.println(ans);
                    }
                }

            }else{
                System.out.println("illegal");
            }
        }
    }

    private static boolean is_num(char ch) {
        return ('0'<=ch&&ch<='9');
    }

    private static boolean is_op(char ch) {
        return (ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%');
    }
}
