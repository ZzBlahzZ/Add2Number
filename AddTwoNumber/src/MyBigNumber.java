package addnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Tác giả:  Nguyen Quoc Khanh
 * DesCription.
 * Class MyBigNumber là class that plus 2 number together
 * Hàm sum is a method to plus 2 string
 */

public class MyBigNumber {
    
    private IReceiver ireceiver;

    public MyBigNumber(final IReceiver ireceiver) {
        this.ireceiver = ireceiver;
    }

    /** 
     * Để thực hiện phép cộng 2 số, ta cần truyền 2 tham số là 2 chuỗi vào hàm sum.
     * Trong đó : 2 chuỗi chỉ được chứa các kí tự số từ '0' đến '9'.
     * <br/>
     * 
     * @param s1 chuỗi số thứ nhất.
     * @param s2 chuỗi số thứ hai.
     * @return 
     */
    public String sum(final String s1, final String s2) {
        //Lấy độ dài của 2 chuỗi 
        //Khai báo 

        String finalResult = "";
        String step = "";// Chuỗi step sẽ làm tham số cho hàm send của interface
        String conver = "";        
        Pattern p = Pattern.compile("\\D"); // Chuỗi đại diện cho kí tự số từ [0-9]
        final Matcher m1 = p.matcher(s1);
        final Matcher m2 = p.matcher(s2);
        int errorPos; // Vị trí của lỗi
        int length1 = s1.length();// Độ dài của chuỗi s1
        int length2 = s2.length();// Độ dài của chuỗi s2
        final int maxLen = (length1 > length2) ? length1 : length2; // Xác định độ dài lớn nhất của 2 chuỗi
        int index1; // chỉ số của kí tự đang xét của chuỗi 1
        int index2; // chỉ số của kí tự đang xét của chuỗi 2
        char c1;    // kí tự tại vị trí index1 của chuỗi s1
        char c2;    // kí tự tại vị trí index2 của chuỗi s2
        int d1;   // kí số của c1
        int d2;   // kí số của c2
        int t;  // tổng tạm của d1 và d2;
        int k;   // tổng tạm không có số nhớ
        int remember = 0;    // nhớ nếu t lớn hơn hoặc bằng 10
        int remember1 = 0; // biến tạm
         
        // Kiểm tra chuỗi null
        if ((s1 == null) || (s2.trim().isEmpty())) {
            s1 = "0";
        }

        if ((s2 == null) || (s2.trim().isEmpty())) {
            s2 = "0";
        }
        
        // Kiểm tra số âm
        if (s1.charAt(0) == '-') {
            errorPos = 1;
            this.ireceiver.send("Don't use negative number in s1 : " + s1);
            throw new ExNumberFormatException(errorPos);
        } 
        
        if (s2.charAt(0) == '-') {
            errorPos = 1;
            this.ireceiver.send("Don't use negative number in s2 : " + s2);
            throw new ExNumberFormatException(errorPos);
        }
        
        // Kiểm tra kí tự đặc biệt hoặc chữ
        if (m1.find()) {
            errorPos = m1.start() + 1;
            this.ireceiver.send("Don't use strange keywords in s1 : " + s1);
            throw new ExNumberFormatException(errorPos);   
        }
        
        if (m2.find()) {
            errorPos = m2.start() + 1;
            this.ireceiver.send("Don't use strange keywords in s2 : " + s2);
            throw new ExNumberFormatException(errorPos);
        }
        
        //// Lặp maxLen lần
        for (int i = 0; i < maxLen; i++) {
            index1 = length1 - i - 1;//lấy ra vị trí index1 phía bên phải của chuỗi 1
            index2 = length2 - i - 1;//lấy ra vị trí index2 phía bên phải của chuỗi 2

            c1 = (index1 >= 0) ? s1.charAt(index1) : '0'; 
            c2 = (index2 >= 0) ? s2.charAt(index2) : '0';

            d1 = c1 - '0';//Số tại vị trí index1
            d2 = c2 - '0';//Số tại vị trí index2

            remember1 = remember;
            t = d1 + d2 + remember;//Tổng tạm bằng số tại vị trí index1 + số tại vị trí index2 + số nhớ remember

            // Lấy hàng đơn vị của t ghép vào phía trước kết quả
            finalResult = (t % 10) + finalResult;
            remember = t / 10; // số nhớ

            if (i == 0) {
                conver = "Step " + i + " : take " + d1 + " plus " + d2 + " get " + (d1 + d2)
                    + " , " + " write " + (t % 10) + " , " + " remember " + remember + ", result : " + finalResult + "\n";
            } else if (i == (maxLen - 1) && t >= 10) {
                conver = "Step " + i + " : took " + d1 + " plus " + d2 + " plus " + remember1 
                    + " get " + t + " , " + "write " + t + " , " + "remember" + remember 
                    + ", result : 1" + finalResult + "\n";
            } else {
                conver = "Step " + i + " : took " + d1 + " plus " + d2 + " plus " + remember1 
                    + " get " + t + " , " + "write " + (t % 10) + " , " + "remember " + remember
                    + ", result : " + finalResult + "\n";
            }
            step = step + conver;
        }
        
        // Kết thúc vòng lặp, nếu biến nhớ remember có giá trị thì
        // ghép thêm remember vào phía trước kết quả
        if (remember > 0) {
            finalResult = remember + finalResult;
        }
        step = "\n" + s1 + " + " + s2 + " = " + finalResult + "\n" + "Process implementation : \n" + step;
        this.ireceiver.send(step);
        
        return finalResult;
    }
}
