package creationalPattern.builder.bank;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount
                .BankAccountBuilder("GP Coder", "0123456789")
                .withEmail("vuchiencong99@gmail.com")
                .wantNewsletter(true)
                .build();
        System.out.println(newAccount);
    }
}
