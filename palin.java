 import java.util.Scanner;
 class palin {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);;
        }
        if(str.equals(rev)){
            System.out.print("plaindrome");
        }
        else{
            System.out.print("not palindrome");
        }
        sc.close();


    }
    
}
