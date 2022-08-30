package behavioralPattern.observer;

/**
 * Giả sử hệ thống của chúng ta cần theo dõi về tài khoản của người dùng.
 * Mọi thao tác của người dùng đều cần được ghi log lại,
 * sẽ thực hiện gửi mail thông báo khi tài khoản hết hạn,
 * thực hiện chặn người dùng nếu truy cập không hợp lệ, …
 */
public class ObserverPatternExample {
    public static void main(String[] args) {
        AccountService account1 = createAccount("vuchiencong99@.com", "127.0.0.1");
        account1.login();
        account1.changeStatus(LoginStatus.EXPIRED);

        System.out.println("---");
        AccountService account2 = createAccount("vuchiencong99@.com", "116.108.77.231");
        account2.login();
    }

    private static AccountService createAccount(String email, String ip) {
        AccountService account = new AccountService(email, ip);
        account.attach(new Logger());
        account.attach(new Mailer());
        account.attach(new Protector());
        return account;
    }
}
