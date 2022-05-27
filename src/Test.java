public class Test {

    public static void main(String[] args) {

        User user1 = new User("ali041", "Ali", "Atabey", "12/05/1970", "1235", "aliatabey@gmail.com",
                "İzmir/Türkiye", "İstanbul/Türkiye");

        CreditCard creditCard1 = new CreditCard("123456789", user1, "9885", "2020");

        Product tshirt = new Product("tshirt", "green", "clothes", 500, 100, "100 gram green tshirt");
        user1.addFavouriteProducts(tshirt);

        Order order1 = new Order(tshirt, creditCard1, user1, 50);
        order1.processingOrder();


    }

}
