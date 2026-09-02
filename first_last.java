 class first_last{
    public static void main(String[] args) {
        int num=1234567;
        int last=num%10;
        int first=0;
        while(num!=0){
            first=num%10;
            num=num/10;
        }
        int sum=first+last;
        System.out.println("Sum of first and last digit: "+sum);
    }
    
}
