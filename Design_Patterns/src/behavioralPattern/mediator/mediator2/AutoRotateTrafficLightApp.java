package behavioralPattern.mediator.mediator2;

import java.util.concurrent.TimeUnit;

/**
 * Đèn giao thông có 3 màu: đỏ, vàng, xanh. Khi một đèn được mở thì những đèn còn lại sẽ tắt.
 *
 * Chương trình của chúng ta như sau:
 *<ul>
 *  Light: lớp chứa thông tin đèn giao thông, trạng thái (ON/OFF),
 *          giữ bộ thông tin bộ điều khiển tín hiệu đèn (Mediator).
 *  LightMediator : bộ điều khiển đèn thông thông, nhận thông báo khi một tín hiệu đèn được mở,
 *                  thực hiện tắt những đèn còn lại.
 *  TrafficLightApp : khởi tạo Mediator, đăng ký các Light với Mediator.
 *                     Thực hiện bật các đèn theo khoảng thời gian 3 giây.
 *</ul>
 *
 */
public class AutoRotateTrafficLightApp {
    public static void main(String[] args) {

        LightMediator lightMediator = new LightMediator();
        Light[] lights = {
                new Light("Red", lightMediator),
                new Light("Green", lightMediator),
                new Light("Yellow", lightMediator)
        };

        int currentLightIndex = 0;
        Light light;
        while (true) {
            if (currentLightIndex >= lights.length) {
                currentLightIndex = 0;
            }
            light = lights[currentLightIndex];
            light.turnOn();
            timer();
            currentLightIndex++;
        }
    }

    private static void timer() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
