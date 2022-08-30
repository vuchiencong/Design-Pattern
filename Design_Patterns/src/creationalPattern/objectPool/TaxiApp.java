package creationalPattern.objectPool;

public class TaxiApp {
    public static final int NUM_OF_CLIENT = 8;

    public static void main(String[] args) {
        TaxiPool taxiPool = new TaxiPool();
        for (int i = 1; i <= NUM_OF_CLIENT; i++) {
            Runnable client = new ClientThread(taxiPool);
            Thread thread = new Thread(client);
            thread.start();
        }
    }
    /**
     * Một hãng taxi A chỉ hữu hạn N chiếc taxi,
     * hãng taxi chịu trách nhiệm quản lý trạng thái các xe (đang rảnh hay đang chở khách),
     * phân phối các xe đang rảnh đi đón khách, chăm sóc,
     * kéo dài thời gian chờ đợi của khách hàng cho trong trường hợp tất cả các xe đều đang bận
     * (để chờ một trong số các xe đó rảnh thì điều đi đón khách luôn),
     * hủy khi việc chờ đợi của khách hàng là quá lâu.
     */
}
