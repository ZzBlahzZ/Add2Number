import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
	Author: Nguyen Quoc Khanh
 */

public class MyBigNumberTester {
    public static void main(String[] args) throws Exception{
        
        String s1,s2;

        BufferedReader reader; // Lớp đọc giá trị nhập vào
        reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\t\t\t~ CONG 2 SO ~");
        System.out.print("Nhap vao so A = ");
        s1 = reader.readLine();
        System.out.print("Nhap vao so B = ");
        s2 = reader.readLine();
        System.out.println("\t\t\t   ~ Bai giai ~");
        MyBigNumber myBigNumber = new MyBigNumber();
        String result = myBigNumber.sum(s1,s2);
        if (!result.equals("")) {
            System.out.println(myBigNumber.getS1() + " + " + myBigNumber.getS2() + " = " + result);
        }
    }
}

