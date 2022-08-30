package behavioralPattern.chainOfResponsibility;

/**
 * Chain of Responsiblity cho phép một đối tượng gửi một yêu cầu
 * nhưng không biết đối tượng nào sẽ nhận và xử lý nó.
 * Điều này được thực hiện bằng cách kết nối các đối tượng nhận yêu cầu thành một chuỗi (chain)
 * và gửi yêu cầu theo chuỗi đó cho đến khi có một đối tượng xử lý nó.
 */
public class behavioral_ChainOfResponsibility {
    /**
     * Sử dụng khi nào
     *
     * Có nhiều hơn một đối tượng có khả thực xử lý một yêu cầu trong khi đối tượng cụ thể nào xử lý yêu cầu đó lại phụ thuộc vào ngữ cảnh sử dụng.
     * Muốn gửi yêu cầu đến một trong số vài đối tượng nhưng không xác định đối tượng cụ thể nào sẽ xử lý yêu cầu đó.
     * Khi cần phải thực thi các trình xử lý theo một thứ tự nhất định..
     * Khi một tập hợp các đối tượng xử lý có thể thay đổi động: tập hợp các đối tượng có khả năng xử lý yêu cầu có thể không biết trước, có thể thêm bớt hay thay đổi thứ tự sau này.
     */
}
