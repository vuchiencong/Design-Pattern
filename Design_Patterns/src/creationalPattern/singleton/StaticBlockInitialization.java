package creationalPattern.singleton;

/**
 * StaticBlockInitialization là cải tiến của EagerInitialization
 * giống với Eager initialization
 *  static block cung cấp thêm lựa chọn cho việc handle exception hay các xử lý khác.
 */
public class StaticBlockInitialization {

//    private static final StaticBlockSingleton INSTANCE;
//
//    private StaticBlockSingleton() {
//    }
//
//
//    static {
//        try {
//            INSTANCE = new StaticBlockSingleton();
//        } catch (Exception e) {
//            throw new RuntimeException("Exception occured in creating singleton instance");
//        }
//    }
//
//    public static StaticBlockSingleton getInstance() {
//        return INSTANCE;
//    }
}
