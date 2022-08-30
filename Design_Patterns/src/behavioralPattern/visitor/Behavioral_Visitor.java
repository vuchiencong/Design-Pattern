package behavioralPattern.visitor;

/**
 * Visitor cho phép định nghĩa các thao tác (operations) trên một tập hợp các đối tượng (objects)
 * không đồng nhất (về kiểu) mà không làm thay đổi định nghĩa về lớp (classes) của các đối tượng đó.
 * Để đạt được điều này, trong mẫu thiết kế visitor ta định nghĩa các thao tác trên các lớp tách biệt gọi các lớp visitors,
 * các lớp này cho phép tách rời các thao tác với các đối tượng mà nó tác động đến.
 * Với mỗi thao tác được thêm vào, một lớp visitor tương ứng được tạo ra.
 *
 * Đây là một kỹ thuật giúp chúng ta phục hồi lại kiểu dữ liệu bị mất (thay vì dùng instanceof).
 * Nó thực hiện đúng thao tác dựa trên tên của phương thức, kiểu của cả đối tượng gọi và kiểu của đối số truyền vào.
 */
public class Behavioral_Visitor {

    /**
     * Khi có một cấu trúc đối tượng phức tạp với nhiều class và interface.
     * Người dùng cần thực hiện một số hành vi cụ thể của riêng đối tượng, tùy thuộc vào concrete class của chúng.
     * Khi chúng ta phải thực hiện một thao tác trên một nhóm các loại đối tượng tương tự.
     * Chúng ta có thể di chuyển logic hành vi từ các đối tượng sang một lớp khác.
     * Khi cấu trúc dữ liệu của đối tượng ít khi thay đổi nhưng hành vi của chúng được thay đổi thường xuyên.
     * Khi muốn tránh sử dụng toán tử instanceof.
     */
}
