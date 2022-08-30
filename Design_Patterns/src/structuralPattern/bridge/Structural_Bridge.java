package structuralPattern.bridge;

/**
 * Ý tưởng của nó là tách tính trừu tượng (abstraction) ra khỏi tính hiện thực (implementation) của nó.
 * Từ đó có thể dễ dàng chỉnh sửa hoặc thay thế mà không làm ảnh hưởng đến những nơi có sử dụng lớp ban đầu.
 */
public class Structural_Bridge {
    /**
     * ví dụ
     * Một hệ thống ngân hàng cung cấp các loại tài khoản khác nhau cho khách hàng,
     * chẳng hạn: Checking account và Saving account.
     * nếu k dùng bridge thì cứ mỗi 1 ngân hàng sẽ có những thực thi giống nhau như thế
     * Với cách thiết kế như vậy, khi hệ thống cần cung cấp thêm một loại tài khoản khác,
     * chúng ta phải tạo class mới cho tất cả các ngân hàng, số lượng class tăng lên rất nhiều
     */


    /**
     * khi dùng bridge
     *
     * chúng ta sẽ dùng chung các thực thi implements ở interface acount, các ngân hàng sẽ implements abstrac bank
     * Với cấu trúc mới như vậy, khi có thêm một loại tài khoản mới,
     * chúng ta đơn chỉ việc thêm vào một implement mới cho Account,
     * các thành phần khác của Bank không bị ảnh hưởng.
     */
}
