public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("====================================");

        Account bobAccount = new Account("12345", 1000.0, "Bob Brown",
                "bob@email.com", "056 9 51166647");
        System.out.println("====================================");

        System.out.println(bobAccount);
        System.out.println("====================================");

        System.out.println(bobAccount.getCustomerName());
        System.out.println(bobAccount.getNumber());
        System.out.println(bobAccount.getBalance());
        System.out.println(bobAccount.getCustomerEmail());
        System.out.println(bobAccount.getCustomerPhone());
        System.out.println("====================================");

        bobAccount.setBalance(500.0);
        System.out.println(bobAccount.getBalance());
        System.out.println("====================================");

        Account saraAccount = new Account();
        System.out.println(saraAccount);
        System.out.println("====================================");

        Account estebanAccount = new Account("Esteban Saez", "esteban@email.com",
                "056 9 88763352");
        System.out.println(estebanAccount);
        System.out.println("====================================");
    }
}
