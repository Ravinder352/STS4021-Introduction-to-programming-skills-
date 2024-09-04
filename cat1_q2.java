import java.util.*;
class cat1_q2{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int in,out,a1,a2;
        System.out.print("Enter a number :");
        in =sc.nextInt();
        a2=sum(in);
        a1=1;
        while(a2>=10){
            a2=sum(a2);
        }
        while(a2>0){
            a1=a1*a2;
            a2--;
        }
        System.out.println(a1);
    }
    private static int sum(int a){
        int s=0;
        while(a>0){
            s=s+a%10;
            a=a/10;
        }
        return s;
    }
}