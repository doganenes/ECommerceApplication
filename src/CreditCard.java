public class CreditCard {
    // defining variables

    private String creditCardNumber;
    private User creditCardUser;
    private String securityCode;
    private String expDateOfCard;


    public CreditCard(String creditCardNumber, User creditCardUser, String securityCode, String expDateOfCard) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expDateOfCard = expDateOfCard;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public User getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(User creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpDateOfCard() {
        return expDateOfCard;
    }

    public void setExpDateOfCard(String expDateOfCard) {
        this.expDateOfCard = expDateOfCard;
    }
}
