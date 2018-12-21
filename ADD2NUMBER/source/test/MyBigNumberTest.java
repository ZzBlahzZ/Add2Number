import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 AUTHOR NGUYEN QUOC KHANH
 */
public class MyBigNumberTest {
    
    public MyBigNumberTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum1() {
        System.out.println("\n#Testcase 1:");
        String s1 = "A";
        String s2 = "0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum2() {
        System.out.println("\n#Testcase 2:");
        String s1 = "0";
        String s2 = "B";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum3() {
        System.out.println("\n#Testcase 3:");
        String s1 = "C";
        String s2 = "D";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum4() {
        System.out.println("\n#Testcase 4:");
        String s1 = "10.";
        String s2 = "10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum5() {
        System.out.println("\n#Testcase 5:");
        String s1 = "10";
        String s2 = ".10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum6() {
        System.out.println("\n#Testcase 6:");
        String s1 = ".10";
        String s2 = "?10";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "0";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum7() {
        System.out.println("\n#Testcase 7:");
        String s1 = "-123";
        String s2 = "123";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "246";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }

    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum8() {
        System.out.println("\n#Testcase 8:");
        String s1 = "1996";
        String s2 = "-2018";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "4014";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test (expected = NumberFormatException.class)
    public void testSum9() {
        System.out.println("\n#Testcase 9:");
        String s1 = "-20";
        String s2 = "-30";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        //String expResult = "10999";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        //assertEquals(expResult, result);
    }
    
    /**
     * Test of sum method, of class MyBigNumber.
     */
    @Test
    public void testSum10() {
        System.out.println("\n#Testcase 10:");
        String s1 = "0111";
        String s2 = "111";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "222";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testSum11() {
        System.out.println("\n#Testcase 11:");
        String s1 = "222";
        String s2 = "0222";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "444";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testSum12() {
        System.out.println("\n#Testcase 12:");
        String s1 = "0345";
        String s2 = "0567";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "912";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testSum13() {
        System.out.println("\n#Testcase 13:");
        String s1 = "0";
        String s2 = "999";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "999";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testSum14() {
        System.out.println("\n#Testcase 14:");
        String s1 = "888";
        String s2 = "0";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "888";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    @Test
    public void testSum15() {
        System.out.println("\n#Testcase 15:");
        String s1 = "888";
        String s2 = "999";
        System.out.println("A = " + s1);
        System.out.println("B = " + s2);
        MyBigNumber instance = new MyBigNumber();
        String expResult = "1887";
        String result = instance.sum(s1, s2);
        System.out.println(instance.getS1() + " + " + instance.getS2() + " = " + result);
        assertEquals(expResult, result);
    }
    
    
}
        