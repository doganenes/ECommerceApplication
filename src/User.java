import java.util.*;

public class User {

    // defining variables
    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favouriteProducts;
    private ArrayList<CreditCard> creditCards;

    public User(String userName, String name, String surname, String dateOfBirth, String password, String email,
            String homeAddress, String workAddress) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;

        this.orderedProducts = new ArrayList<>();
        this.favouriteProducts = new ArrayList<>();
        this.creditCards = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;

    }

    public void setOrderedProducts(ArrayList<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public ArrayList<Product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setFavouriteProducts(ArrayList<Product> favouriteProducts) {
        this.favouriteProducts = favouriteProducts;
    }

    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }

    public void addFavouriteProducts(Product favouriteProduct) {
        this.favouriteProducts.add(favouriteProduct);
        System.out.println(favouriteProduct.getProductName() + " is added to the system.");
    }

    public void purchasingOrderingProduct(Product orderingProduct) {
        this.orderedProducts.add(orderingProduct);
        System.out.println("Ordering product is added to system.");
    }
}
