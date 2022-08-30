package behavioralPattern.Command;

/**
 * Một hệ thống ngân hàng cung cấp ứng dụng cho khách hàng (client) có thể mở (open) hoặc đóng (close) tài khoản trực tuyến.
 * Hệ thống này được thiết kế theo dạng module, mỗi module sẽ thực hiện một nhiệm vụ riêng của nó,
 * chẳng hạn mở tài khoản (OpenAccount), đóng tài khoản (CloseAccount).
 * Do hệ thống không biết mỗi module sẽ làm gì, nên khi có yêu cầu client (chẳng hạn clickOpenAccount, clickCloseAccount),
 * nó sẽ đóng gói yêu cầu này và gọi module xử lý.
 */
public class Client {
    public static void main(String[] args) {
        Account account = new Account("gpcoder");

        Command open = new OpenAccount(account);
        Command close = new CloseAccount(account);
        BankApp bankApp = new BankApp(open, close);

        bankApp.clickOpenAccount();
        bankApp.clickCloseAccount();
    }
}
