package creationalPattern.builder;

/**
 * Builder pattern là mẫu thiết kế đối tượng được tạo ra để xây dựng một đôi tượng phức tạp
 * bằng cách sử dụng các đối tượng đơn giản và sử dụng tiếp cận từng bước,
 * việc xây dựng các đối tượng đôc lập với các đối tượng khác.
 */
public class Creational_Builder {

    /**
     * Lợi ích của Builder Pattern là gì?
     *
     * Hỗ trợ, loại bớt việc phải viết nhiều constructor.
     * Code dễ đọc, dễ bảo trì hơn khi số lượng thuộc tính (propery) bắt buộc để tạo một object từ 4 hoặc 5 propery.
     * Giảm bớt số lượng constructor, không cần truyền giá trị null cho các tham số không sử dụng.
     * Ít bị lỗi do việc gán sai tham số khi mà có nhiều tham số trong constructor: bởi vì người dùng đã biết được chính xác giá trị gì khi gọi phương thức tương ứng.
     * Đối tượng được xây dựng an toàn hơn: bởi vì nó đã được tạo hoàn chỉnh trước khi sử dụng.
     * Cung cấp cho bạn kiểm soát tốt hơn quá trình xây dựng: chúng ta có thể thêm xử lý kiểm tra ràng buộc trước khi đối tượng được trả về người dùng.
     * Có thể tạo đối tượng immutable.
     */
}
