package creationalPattern.singleton;

/**
 *  trong quá trình phân tích thiết kế một hệ thống
 *  ta mong muốn có những đối tượng cần tồn tại duy nhất và có thể truy xuất mọi lúc mọi nơi
 *  ta có thể nghĩ tới việc sử dụng một biến toàn cục
 *  Tuy nhiên, việc sử dụng biến toàn cục nó phá vỡ quy tắc của OOP (encapsulation).
 *  =>  hướng đến một giải pháp là sử dụng Singleton pattern.
 */
public class creational_Singleton {

    /**
     * Singleton đảm bảo chỉ duy nhất một thể hiện (instance) được tạo ra
     * và nó sẽ cung cấp cho bạn một method để có thể truy xuất được thể hiện duy nhất đó
     * mọi lúc mọi nơi trong chương trình.
     */


    /**
     *  nguyên tắc cơ bản Implement Singleton Pattern
     *
     *  1. private constructor để hạn chế truy cập từ class bên ngoài.
     *  2. Đặt private static final variable đảm bảo biến chỉ được khởi tạo trong class.
     *  3. Có một method public static để return instance được khởi tạo ở trên.
     */

    /**
     * Vì class dùng Singleton chỉ tồn tại 1 Instance (thể hiện)
     * nên nó thường được dùng cho các trường hợp giải quyết các bài toán
     * cần truy cập vào các ứng dụng như: Shared resource, Logger, Configuration, Caching, Thread pool, …
     */
}
