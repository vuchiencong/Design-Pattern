package creationalPattern.prototype;

/**
 * Prototype pattern có nhiệm vụ khởi tạo một đối tượng bằng cách clone một đối tượng đã tồn tại
 * thay vì khởi tạo với từ khoá new. Đối tượng mới là một bản sao có thể giống 100% với đối tượng gốc,
 * chúng ta có thể thay đổi dữ liệu của nó mà không ảnh hưởng đến đối tượng gốc.
 */
public class Creational_Prototype {

    /**
     * sử dụng khi nào?
     *
     * ta có một object và cần phải tạo 1 ọbject mới khác dựa trên object bạn đầu mà không thể sử dụng toán tử new hay các hàm contructor để khởi tạo.
     * Vì sao vậy? Lý do đơn giản là ở đây chúng ta ko hề được biết thông tin nội tại của object đó hoặc object đó đã có thể bị che dấu đi nhiều thông tin khác mà chỉ cho ta một thông tin rất giới hạn không đủ để hiểu được.
     * Do vậy ta ko thể dùng toán tử new để khởi tạo nó được. Giải pháp: để cho chính object mẫu tự xác định thông tin và dữ liệu sao chép.
     * Khởi tạo đối tượng lúc run-time: chúng ta có thể xác định đối tượng cụ thể sẽ được khởi tạo lúc runtime nếu class được implement / extend từ một Prototype.
     * Cấu hình một ứng dụng với dynamic class.
     * Muốn truyền đối tượng vào một hàm nào đó để xử lý, thay vì truyền đối tượng gốc có thể ảnh hưởng dữ liệu thì ta có thể truyền đối tượng sao chép.
     * Chi phí của việc tạo mới đối tượng (bằng cách sử dụng toán tử new) là lớn.
     * Ẩn độ phức tạp của việc khởi tạo đối tượng từ phía Client.
     */
}
