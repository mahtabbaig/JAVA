class sales{
    String brand;
    String model;
    int price;
}
class mobile{
    public static void main(String[] args) {
        sales m1 = new sales();
        m1.brand = "Samsung";
        m1.model = "Galaxy S25";
        m1.price = 79900;

        System.out.println(m1.brand);
        System.out.println(m1.model);
        System.out.println(m1.price);
    }
}
