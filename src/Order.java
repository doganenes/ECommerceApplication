public class Order {

    private Product orderedProduct;
    private CreditCard userCreditCard;
    private User orderingUser;
    private int numberOfProducts;

    public Order(Product orderedProduct, CreditCard userCreditCard, User orderingUser, int numberOfProducts) {

        this.orderedProduct = orderedProduct;
        this.userCreditCard = userCreditCard;
        this.orderingUser = orderingUser;
        this.numberOfProducts = numberOfProducts;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public CreditCard getUserCreditCard() {
        return userCreditCard;
    }

    public void setUserCreditCard(CreditCard userCreditCard) {
        this.userCreditCard = userCreditCard;
    }

    // satın alma işleminde ürünün var olup olmadığını kontrol etme işlemi.
    /*public void processingOrder() {

        if (orderedProduct.reducedStock(numberOfProducts)) {

            orderingUser.purchasingOrderingProduct(orderedProduct);

        } else {
            System.out.println("Process is failed");
        }

    }*/

    public void processingOrder() {

        try {
            if (orderedProduct.reducedStock(numberOfProducts)) {
                orderingUser.purchasingOrderingProduct(orderedProduct);
            }
        } catch (Exception NullPointerException) {
            System.out.println("Process is failed");
        }

    }

}
