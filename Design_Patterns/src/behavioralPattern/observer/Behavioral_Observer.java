package behavioralPattern.observer;

/**
 * Nó định nghĩa mối phụ thuộc một – nhiều giữa các đối tượng
 * để khi mà một đối tượng có sự thay đổi trạng thái,
 * tất các thành phần phụ thuộc của nó sẽ được thông báo và cập nhật một cách tự động.
 *
 * Observer có thể đăng ký với hệ thống.
 * Khi hệ thống có sự thay đổi,
 * hệ thống sẽ thông báo cho Observer biết.
 * Khi không cần nữa, mẫu Observer sẽ được gỡ khỏi hệ thống.
 */
public class Behavioral_Observer {

    /**
     * Thường được sử dụng trong mối quan hệ 1-n giữa các object với nhau.
     * Trong đó một đối tượng thay đổi và muốn thông báo cho tất cả các object liên quan biết về sự thay đổi đó.
     * Khi thay đổi một đối tượng, yêu cầu thay đổi đối tượng khác và chúng ta không biết có bao nhiêu đối tượng cần thay đổi,
     * những đối tượng này là ai.
     * Sử dụng trong ứng dụng broadcast-type communication.
     * Sử dụng để quản lý sự kiện (Event management).
     * Sử dụng trong mẫu mô hình MVC (Model View Controller Pattern) : trong MVC, mẫu này được sử dụng để tách Model khỏi View.
     * View đại diện cho Observer và Model là đối tượng Observable.
     */
}
