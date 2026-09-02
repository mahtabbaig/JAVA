import java.util.Scanner;
class calc {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        char symbol=  sc.next().charAt(0);
        int a=sc.nextInt();
        int b=sc.nextInt();
        switch (symbol) {
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                if(b!=0){
                    System.out.print(a/b);

                }
                else{
                    System.out.print("zero");
                } 
                break;


            
                
                
        
            default:
                System.out.print("invalid");
                break;
        }
        sc.close();

    }
    
}
