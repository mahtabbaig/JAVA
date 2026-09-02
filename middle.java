 class middle {
    public static void main(String[] args) {
        String num = "456789";
        int len = num.length();
        int mid = len / 2;
        int sum = 0;
        
        if(len % 2 == 0) {
            sum = (num.charAt(mid-1) - '0') + (num.charAt(mid) - '0');
        } else {
            sum = num.charAt(mid) - '0';
        }
        
        System.out.println("Sum of middle digit(s): " + sum);
    }
}
