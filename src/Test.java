public class Test {

    public static void main(String[] args) {

        User user1 = new User("ali049", "Ali", "Atasoy", "29/05/1977", "ab0495ya", "aliatasoy01@gmail.com",
                "Ata Street Izmir/Turkey", "Gungoren APT Izmir/Turkey");
        CreditCard creditCard1 = new CreditCard("123456789", user1, "0046", "05/2030");

        User user2 = new User("salih5468", "Salih", "Gün", "26/02/1996", "562455aa", "saligün096@gmail.com",
                "Vega BLVD Istanbul/Turkey", "Maslak İstanbul/Turkey");
        CreditCard creditCard2 = new CreditCard("656838763", user2, "0523", "03/2024");

        User user3 = new User("ezgi5684", "Ezgi", "Yaman", "04/04/1989", "d55678c8", "ezgi553@gmail.com",
                "Palas APT Denizli/Turkey", "Manolya ST. Denizli/Turkey");
        CreditCard creditCard3 = new CreditCard("435256798", user3, "4987", "04/2029");

        Product apple = new Product("apple", "green", "fruit", 100, 10, "fresh apple");
        Product pear = new Product("pear", "yellow", "fruit", 250, 50, "yellow pear");
        Product lettuce = new Product("lettuce", "green", "vegetable", 500, 40, "fresh lettuce");
        Product aubergine = new Product("aubergine", "purple", "vegetable", 500, 60, "Purple aubergine");
        Product steak = new Product("steak", "red", "meat", 5000, 500, "500 grams of steak");

        user1.addFavouriteProducts(apple);
        user1.addFavouriteProducts(steak);

        Order order1 = new Order(apple, creditCard1, user1, 2);
        order1.processingOrder();

        System.out.println();

        user2.addFavouriteProducts(apple);
        user2.addFavouriteProducts(pear);
        user2.addFavouriteProducts(aubergine);

        Order order2 = new Order(apple, creditCard2, user2, 2);
        order2.processingOrder();

        Order order3 = new Order(pear, creditCard2, user2, 15);
        order3.processingOrder();

        System.out.println();

        user3.addFavouriteProducts(lettuce);
        user3.addFavouriteProducts(aubergine);

        Order order4 = new Order(lettuce, creditCard3, user3, 20);
        order4.processingOrder();

        Order order5 = new Order(aubergine, creditCard3, user3, 10);
        order5.processingOrder();

    }

}