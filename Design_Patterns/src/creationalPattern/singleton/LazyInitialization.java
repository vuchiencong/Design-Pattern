package creationalPattern.singleton;

/**
 * LazyInitialization là cải tiến của StaticBlockInitialization
 * cách này chỉ khi nào getInstance() được gọi thì instance mới được khởi tạo
 * cách này chỉ sử dụng tốt trong trường hợp đơn luồng (single-thread)
 */
public class LazyInitialization {

//    private static LazyInitializedSingleton instance;
//
//    private LazyInitializedSingleton() {
//    }
//
//    public static LazyInitializedSingleton getInstance() {
//        if (instance == null) {
//            instance = new LazyInitializedSingleton();
//        }
//        return instance;
//    }
}
