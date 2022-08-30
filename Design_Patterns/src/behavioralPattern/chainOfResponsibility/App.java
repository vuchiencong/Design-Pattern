package behavioralPattern.chainOfResponsibility;

/**
 *  ví dụ  là ứng dụng phê duyệt xin nghỉ phép.
 *  Nếu xin nghỉ <=3 ngày thì Supervisor có thể phê duyệt (approve).
 *  Nếu xin nghỉ <=5 ngày thì DeliveryManager có thể approve.
 *  Nếu xin nghỉ >5 ngày thì phải được approve bởi Director.
 *  Quy trình này có thể linh động tùy theo quy mô phát triển của công ty.
 */
public class App {
    public static void main(String[] args) {
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(2));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(5));
        System.out.println("---");
        LeaveRequestWorkFlow.getApprover().approveLeave(new LeaveRequest(7));
    }
}
