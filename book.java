class market {
    String title;
    String author;
    int price;
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class book {
    public static void main(String[] args) {
        market b1 = new market();
        b1.title = "ATOMIC HABITS";
        b1.author = "James Clear";
        b1.price = 180;

        market b2 = new market();
        b2.title = "RICH DAD POOR DAD";
        b2.author = "MP SINGH";
        b2.price = 150;

        b1.display();
        b2.display();

    }
}
