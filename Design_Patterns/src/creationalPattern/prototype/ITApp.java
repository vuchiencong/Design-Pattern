package creationalPattern.prototype;

public class ITApp {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Window 10", "Word 2013", "BKAV", "Chrome v69", "Skype");
        Computer computer2 = computer1.clone();
        computer2.setOthers("Skype, Teamviewer, FileZilla Client");

        System.out.println(computer1);
        System.out.println(computer2);
    }

    /**
     * Ví dụ: Một công ty có cấu hình máy tính đều giống nhau cho tất cả nhân viên,
     * bao gồm: Hệ điều hành (os), Phần mềm văn phòng (office), Phần mềm diệt virus (antivirus),
     * Trình duyệt (Browser), và một số phần mềm khác (others) tùy theo nhu cầu của mỗi nhân viên sẽ được cài đặt thêm.
     * Việc cài đặt tất cả phần mềm trên rất tốn thời gian,
     * nên anh IT đã nghĩ ra một cách là sẽ tạo ra một bản chuẩn cho một máy tính
     * và có thể clone() lại cấu hình đó cho một nhân viên khác mà không cần phải cài đặt lại từ đầu.
     */
}
