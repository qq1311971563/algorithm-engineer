package LeetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class Top7Test {

    @Test
    public void toLowerCase() {
        Top7 top7 = new Top7();
        System.out.println(top7.toLowerCase("Hello"));
        System.out.println(top7.toLowerCase("HEllo"));
        System.out.println(top7.toLowerCase("HelLo"));
        System.out.println(top7.toLowerCase("hello"));
        System.out.println(top7.toLowerCase("HELLO"));
        System.out.println(top7.toLowerCase("HELLo"));
    }
}