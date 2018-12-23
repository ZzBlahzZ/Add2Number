package addnumber;
public interface IReceiver {
    /**
     * Để chạy in từng bước cộng 2 chuỗi số
     * thì lớp nào implements interface này thì phải hiện thực
     * hàm send của IReceiver
     * <br/>
     *
     */
    /**
     *
     * @param msg
     */
    void send(String msg);
}