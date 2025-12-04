package it.univr.util;

import org.junit.Assert;
import org.junit.Test;

public class StackTester {
    @Test
    public void testEmptyStack() {
        Stack stack = new Stack();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPushEmpty() {
        Stack stack = new Stack();
        stack.push(3);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void testPopEmpty() {
        Stack stack = new Stack();
        stack.push(3);
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }
}
