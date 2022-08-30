package creationalPattern.singleton;

/**
 * cách làm này sẽ tạo ra static nested class với vai trò 1 Helper
 * khi muốn tách biệt chức năng cho 1 class function rõ ràng hơn.
 *
 * cách làm này được đánh giá là cách triển khai Singleton nhanh và hiệu quả nhất.
 */
public class BillPughSingletonImplementation {

//    private BillPughSingleton() {
//    }
//
//    public static BillPughSingleton getInstance() {
//        return SingletonHelper.INSTANCE;
//    }
//
//    private static class SingletonHelper {
//        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
//    }
}
