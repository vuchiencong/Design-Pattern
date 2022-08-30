package behavioralPattern.memento;

/**
 *  Memento là mẫu thiết kế có thể lưu lại trạng thái của một đối tượng
 *  để khôi phục lại sau này mà không vi phạm nguyên tắc đóng gói.
 *
 * Dữ liệu trạng thái đã lưu trong đối tượng memento
 * không thể truy cập bên ngoài đối tượng được lưu và khôi phục.
 * Điều này bảo vệ tính toàn vẹn của dữ liệu trạng thái đã lưu
 */
public class Behavioral_Mementor {

    /**
     * Sử dụng khi nào ?
     *
     * Các ứng dụng cần chức năng cần Undo/ Redo:
     * lưu trạng thái của một đối tượng bên ngoài và có thể restore/ rollback sau này.
     *
     * Thích hợp với các ứng dụng cần quản lý transaction.
     */
}
