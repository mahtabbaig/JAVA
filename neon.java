class neon {
    public static void main(String[] args) {
        int num = 45, sum = 0, sq = num * num, temp = sq;
        while(temp > 0){
            sum += temp % 10; 
            temp /= 10;
        }
        if(sum==num){
            System.out.println(num + " is a NEON number");
        }
        else{
            System.out.println(num + " is not a NEON number");
        }
    
    }
} 


 
