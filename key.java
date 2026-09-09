import java.util.Scanner;

public class key {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
    
        System.out.println("Enter key element: ");
        int key=sc.nextInt();

        

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Key element found at index: "+i);
                
            }
        }

        System.out.println("Key element not found.");
        sc.close();
      
    }
}
