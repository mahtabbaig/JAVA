import java.util.Scanner;
class area {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double pi = 3.14;
        double area=pi*r*r;
        System.out.print(area);
        sc.close();
    }
    
}
