public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    // Declaración de un constructor vacío, o constructor por defecto.
    public Account(){
        this("9999", 2.50, "Default name", "Default address", "Default phone");
        System.out.println("Emtpy constructor called");
    }

    public Account(String number, double balance, String customerName, String email, String phone) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
        System.out.println("Account constructor with parameters called");
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 2.50, customerName, customerEmail, customerPhone);
        System.out.println("New Account constructor with parameters called");
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number='" + number + '\'' +
                ", balance=" + balance +
                ", customerName='" + customerName + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                '}';
    }
}
