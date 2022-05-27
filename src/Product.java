public class Product {

    // defining variables
    private String productName;
    private String productColor;
    private String productCategory;
    private int productStock;
    private int productWeight;
    private String productDescription;

    public Product(String productName, String productColor, String productCategory, int productStock, int productWeight, String productDescription) {

        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.productStock = productStock;
        this.productWeight = productWeight;
        this.productDescription = productDescription;

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductStock() {
        return productStock;
    }

    public void setProductStock(int productStock) {
        this.productStock = productStock;
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        this.productWeight = productWeight;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    // reduced = azalan, azaltılmış
    public boolean reducedStock(int numberOfPurchasedProduct) {

        if (numberOfPurchasedProduct > this.productStock) {
            System.out.println("There isn't enough product.");
            return false;
        } else {

            this.setProductStock(this.productStock - numberOfPurchasedProduct);
            System.out.println(this.productStock + " " + this.productName + "left in the stock.");
            return true;
        }

    }
}
