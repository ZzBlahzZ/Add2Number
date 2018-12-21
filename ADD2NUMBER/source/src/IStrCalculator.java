import java.util.ArrayList;

/**
	Author Nguyen Quoc Khanh
 */
public interface IStrCalculator {
    
    /**
     * Hàm sum trả về giá trị tổng 2 số tương ứng với 2 tham số dưới dạng chuỗi
     * @param s1 chuỗi số thứ 1
     * @param s2 chuỗi số thứ 2
     * @return chuỗi số thể hiện giá trị tổng của s1 và s2
     */
    public String sum(String s1, String s2);
    
    /**
     * Hàm xuất các bước tính ra màn hình
     * @param msg chứa các phần tử là chuỗi diễn giải mỗi bước tính
     */
    public void show(ArrayList<String> msg);
}
