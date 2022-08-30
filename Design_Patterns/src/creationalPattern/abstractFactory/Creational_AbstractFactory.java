package creationalPattern.abstractFactory;

/**
 * Nó là phương pháp tạo ra một Super-factory dùng để tạo ra các Factory khác
 *
 * Hãy tưởng tượng, Abstract factory như là một nhà máy lớn chứa nhiều nhà máy nhỏ,
 * trong các nhà máy đó có những xưởng sản xuất, các xưởng đó tạo ra những sản phẩm khác nhau.
 */
public class Creational_AbstractFactory {

    /**
     * Một Abstract Factory Pattern bao gồm các thành phần cơ bản sau
     *
     * AbstractFactory: Khai báo dạng interface hoặc abstract class chứa các phương thức để tạo ra các đối tượng abstract.
     * ConcreteFactory: Xây dựng, cài đặt các phương thức tạo các đối tượng cụ thể.
     * AbstractProduct: Khai báo dạng interface hoặc abstract class để định nghĩa đối tượng abstract.
     * Product: Cài đặt của các đối tượng cụ thể, cài đặt các phương thức được quy định tại AbstractProduct.
     * Client: là đối tượng sử dụng AbstractFactory và các AbstractProduct.
     */
}
