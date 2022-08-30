package behavioralPattern.mediator.mediator1;

/**
 * Trong một ứng dụng chat, một user sẽ có thể send và recieve message.
 * Khi một user muốn send message đến group thì user đó phải tìm xem tất cả những người đang online
 * hoặc trong trạng thái có thể message để send.
 * Nếu bình thường user gửi tin phải tự làm hết mọi thứ, phải tự kiểm tra từng member và thực hiện việc gửi tin nhắn.
 *
 * Khi sử dụng Mediator: user không cần tự kiểm tra, không quan tâm ai có thể nhận message,
 * user chỉ việc gửi thông tin đến Mediator của group.
 * Mediator sẽ tự điều phối message này đến người nhận.
 */
public class ChatClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl("Java design pattern");

        User admin = new UserImpl(mediator, "Cong");
        User user1 = new UserImpl(mediator, "User 1");
        User user2 = new UserImpl(mediator, "User 2");
        User user3 = new UserImpl(mediator, "User 3");

        mediator.addUser(admin);
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        admin.send("Hi All");
        user1.send("Hi Admin");
    }
}
