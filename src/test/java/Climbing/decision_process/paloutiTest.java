package Climbing.decision_process;

import org.junit.Test;

import static org.junit.Assert.*;

public class paloutiTest {

    @Test
    public void answer() {
        palouti p = new palouti();
        System.out.println(p.answer(1));
        System.out.println(p.answer(2));
        System.out.println(p.answer(3));
        System.out.println(p.answer(4));
        System.out.println(p.answer(5));
    }
}