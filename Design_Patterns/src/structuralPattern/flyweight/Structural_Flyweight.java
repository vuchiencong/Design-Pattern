package structuralPattern.flyweight;

/**
 * Nó cho phép tái sử dụng đối tượng tương tự đã tồn tại bằng cách lưu trữ chúng
 * hoặc tạo đối tượng mới khi không tìm thấy đối tượng phù hợp
 */
public class Structural_Flyweight {
    /**
     * Flyweight Pattern được sử dụng khi chúng ta cần tạo một số lượng lớn các đối tượng của 1 lớp nào đó.
     * Do mỗi đối tượng đều đòi hỏi chiếm giữ một khoảng không gian bộ nhớ,
     * nên với một số lượng lớn đối tượng được tạo ra có thể gây nên vấn đề nghiêm trọng
     * đặc biệt đối với các thiết bị có dung lượng nhớ thấp.
     * Flyweight Pattern có thể được áp dụng để giảm tải cho bộ nhớ thông qua cách chia sẻ các đối tượng.
     * Vì vậy performance của hệ thống được tối ưu.
     */

    /**
     * Sử dụng khi nào
     *
     * Khi có một số lớn các đối tượng được ứng dụng tạo ra một cách lặp đi lặp lại.
     * Khi việc tạo ra đối tượng đòi hỏi nhiều bộ nhớ và thời gian.
     * Khi muốn tái sử dụng đối tượng đã tồn tại thay vì phải tốn thời gian để tạo mới.
     * Khi nhóm đối tượng chứa nhiều đối tượng tương tự và hai đối tượng trong nhóm không khác nhau nhiều.
     */
}
