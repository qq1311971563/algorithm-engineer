package LeetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Top1Test {

    private Top1 top1 = new Top1();
    @Test
    public void isPalindrome() {
        System.out.println(top1.isPalindrome(-121));
        System.out.println(top1.isPalindrome(121));
        System.out.println(top1.isPalindrome(121));
        System.out.println(top1.isPalindrome(1212222));
        System.out.println(top1.isPalindrome(258852));
        System.out.println(top1.isPalindrome(1232));
    }

    @Test
    public void romanToInTt() {
        System.out.println(top1.romanToInTt("III"));
        /*System.out.println(top1.romanToInTt("II"));
        System.out.println(top1.romanToInTt("XIII"));
        System.out.println(top1.romanToInTt("III"));
        System.out.println(top1.romanToInTt("III"));*/
    }
}
