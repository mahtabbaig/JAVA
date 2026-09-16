class choice{
    String name;
    int balance;
        public void displayBalance(){
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    
    public void deposit(int amount){

        balance += amount;
    }

} public class bank{
    public static void main(String[] args) {
        choice b1 = new choice();
        b1.name = "Mahtab Azeez Baig";
        b1.balance = 1000;

      
        b1.displayBalance();
        b1.deposit(500);
      
        System.out.println("Balance after deposit: " + b1.balance);
    }
    
}

