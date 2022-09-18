import java.util.Scanner;
public class checkPassword{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String inStr=sc.next();
        int n=inStr.length();
        char str[]=inStr.toCharArray();
        System.out.print(CheckPassword(str, n));
    }
    public static int CheckPassword(char str[], int n){
        int num=0, caps=0, sym=1;
        for(int i=0;i<n;i++){
            if(str[i]>='0' && str[i]<='9'){
                num=1;
            }else if(str[i]>='A' && str[i]<='Z'){
                caps=1;
            }else if(str[i]==' ' || str[i]=='/'){
                sym=0;
            }
        }
        if(!(str[0]>='0' && str[0]<='9') && n>=4 && sym==1 && num==1 && caps==1){
            return 1;
        }else{
            return 0;
        }
    }
}