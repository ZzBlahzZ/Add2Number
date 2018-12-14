public static String MyBigNumber(String s1, String s2) {
        String result = "";
        int str1 = s1.length(); //lay do dai 2 chuoi
        int str2 = s2.length();
        int max = str1;
		if (str1 > str2) { //so sanh 2 chuoi, de lay gia tri max cua loop
            max = str1;
        } else {
            max = str2;
        }

        int flag = 0; //bien luu gia tri du
        for (int i = 0; i < max; i++) {
            int num1 = str1 - i - 1;//vi tri cuoi cung cua chuoi so 1,2
            int num2 = str2 - i - 1;
            char digit1 = '0';//bien luu ki tu khi duoc lay ra 
            char digit2 = '0';
            if (num1 >= 0) {
                digit1 = s1.charAt(num1); //ham lay ki tu ra
            }
            if (num2 >= 0) {
                digit2 = s2.charAt(num2);
            }
			int temp1 = digit1 - '0';
			int temp2 = digit2 - '0';
            int sum1_2 = temp1 + temp2 + flag; //tong 2 ki tu duoc lay ra,  " - '0'   <---> " - 48" + bien du
            
            if (num1 > 0) { //khi chua ve ki tu cuoi cung cua chuoi
                result += (sum1_2 % 10);
            } else {//khi tro ve ki tu cuoi cung cua chuoi
                result = sum1_2 + result;
            }
            flag = sum1_2 / 10;
        }
        return result;
    }