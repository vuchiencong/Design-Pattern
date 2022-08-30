package creationalPattern.factory;

/**
 * Trong Factory Pattern, chúng ta tạo đối tượng mà không để lộ logic tạo đối tượng ở phía người dùng
 * và tham chiếu đến đối tượng mới được tạo ra bằng cách sử dụng một interface chung.
 */
public class creational_Factory {

    /**
     * Một Factory Pattern bao gồm các thành phần cơ bản sau
     *
     * Super Class: môt supper class trong Factory Pattern có thể là một interface,
     *              abstract class hay một class thông thường.
     * Sub Classes: các sub class sẽ implement các phương thức của supper class theo nghiệp vụ riêng của nó.
     * Factory Class: một class chịu tránh nhiệm khởi tạo các đối tượng sub class dựa theo tham số đầu vào.
     * Lưu ý: lớp này là Singleton hoặc cung cấp một public static method cho việc truy xuất và khởi tạo đối tượng.
     * Factory class sử dụng if-else hoặc switch-case để xác định class con đầu ra.
     */
}
