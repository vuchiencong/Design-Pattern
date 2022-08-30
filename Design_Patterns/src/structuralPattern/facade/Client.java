package structuralPattern.facade;

/**
 *  Một công ty bán hàng online, chẳng hạn Tiki cung cấp nhiều lựa chọn cho khách hàng khi mua sản phẩm.
 *  Khi một sản phẩm được mua, nó sẽ qua các bước xử lý:
 *  lấy thông tin về tài khoản mua hàng, thanh toán, vận chuyển, gửi Email/ SMS thông báo.
 */
public class Client {
    public static void main(String[] args) {
        ShopFacade.getInstance().buyProductByCashWithFreeShipping("vuchiencong99@gmail.com");
        ShopFacade.getInstance().buyProductByPaypalWithStandardShipping("vuchiencong99@gmail.com", "0999.999.999");
    }
    /**
     * Thông tin về tài khoản (AccountService) : lấy thông tin cơ bản của khách hàng thông qua email được cung cấp.
     * Dịch vụ thanh toán (PaymentService) : có thể thanh toán thông qua Paypal, thẻ tín dụng (Credit Card), tài khoản ngân hàng trực tuyến (E-banking), Tiền mặt (cash).
     * Dịch vụ vận chuyển (ShippingService) : có thể chọn Free Shipping, Standard Shipping, Express Shipping.
     * Dịch vụ email (EmailService) : có thể gửi mail cho khách hàng về tình hình đặt hàng, thanh toán, vận chuyển, nhận hàng.
     * Dịch vụ tin nhắn (SMS) : có thể gửi thông báo SMS cho khách hàng khi thanh toán online.
     * ShopFacade : là một Facade Pattern, class này bao gồm các dịch vụ có bên trong hệ thống.
     *             Nó cung cấp một vài phương thức để Client có thể dễ dàng mua hàng.
     *             Tùy vào nghiệp vụ mà nó sẽ sử dụng những dịch tương ứng,
     *             chẳng hạn dịch vụ SMS chỉ được sử dụng nếu khách hàng đăng ký mua hàng thông qua hình thức thanh toán online (Paypal, E-banking, …).
     * Client : là người dùng cuối sử dụng ShopFacade để mua hàng.
     */
}
