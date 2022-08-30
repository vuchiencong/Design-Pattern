package structuralPattern.proxy;

/**
 * Mục đích xây dựng Proxy pattern cũng chính
 * vì muốn tạo ra một đối tượng sẽ ủy quyền, thay thế cho một đối tượng khác.
 */
public class Structural_Proxy {

    /**
     * sử dụng khi nào?
     *
     * Khi muốn bảo vệ quyền truy xuất vào các phương thức của object thực.
     * Khi cần một số thao tác bổ sung trước khi thực hiện phương thức của object thực.
     * Khi tạo đối tượng ban đầu là theo yêu cầu hoặc hệ thống yêu cầu sự chậm trễ khi tải một số tài nguyên nhất định (lazy loading).
     * Khi có nhiều truy cập vào đối tượng có chi phí khởi tạo ban đầu lớn.
     * Khi đối tượng gốc tồn tại trong môi trường từ xa (remote).
     * Khi đối tượng gốc nằm trong một hệ thống cũ hoặc thư viện của bên thứ ba.
     * Khi muốn theo dõi trạng thái và vòng đời đối tượng.
     */
}
