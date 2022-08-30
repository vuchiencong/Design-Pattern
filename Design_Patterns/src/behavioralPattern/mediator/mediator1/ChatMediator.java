package behavioralPattern.mediator.mediator1;

public interface ChatMediator {
    void sendMessage(String msg, User user);

    void addUser(User user);
}
