package behavioralPattern.templateMethod;

/**
 * Cấu trúc của một website thông thường gồm các phần header, footer, navigation (menu), body.
 * Riêng phần body thường xuyên thay đổi, sẽ hiển thị riêng theo từng trang.
 * Những phần khác ít khi thay đổi, trừ khi có yêu cầu đặt biệt.
 * Thay vì phải viết tất cả các phần ở mỗi trang, chúng ta có thể gom chúng lại
 * và đặt trong một template để tái sử dụng mà không duplicate code ở nhiều nơi.
 */
public class TemplateMethodPatternExample {
    public static void main(String[] args) {

        PageTemplate homePage = new HomePage();
        homePage.showPage();

        System.out.println();
        PageTemplate detailPage = new DetailPage();
        detailPage.showPage();

        System.out.println();
        PageTemplate contactPage = new ContactPage();
        contactPage.showPage();
    }
}
