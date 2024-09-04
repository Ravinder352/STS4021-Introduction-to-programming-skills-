import java.util.*;
class cat1_q1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //ABcd@3 to abCD@3
        System.out.println("Enter string :");
        String in = sc.nextLine();
        String out="";
        for(int i=0;i<in.length();i++){
            char c=in.charAt(i);
            if(c<='z' && c>='a'){
                out=out+Character.toUpperCase(c);
            }else if(c<='Z' && c>='A'){
                out=out+Character.toLowerCase(c);
            }else{
                out=out+c;
            }
        }
        System.out.println(out);

        sc.close();
    }
}