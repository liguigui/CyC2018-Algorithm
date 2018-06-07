import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void ResizingArrayStackTest() throws Exception {
        test(new ArrayStack<>());
    }

    @org.junit.Test
    public void ListStackTest() throws Exception {
        test(new ListStack<>());
    }

    private static void test(MyStack<Integer> stack) throws Exception {
        stack.push(1).push(2).push(3).push(4);
        Assert.assertEquals(stack.size(), 4);
        Assert.assertFalse(stack.isEmpty());
        for (Integer item : stack)
            System.out.println(item);
        Assert.assertTrue(stack.pop() == 4);
        Assert.assertTrue(stack.pop() == 3);
        Assert.assertTrue(stack.pop() == 2);
        Assert.assertTrue(stack.pop() == 1);
        Assert.assertTrue(stack.isEmpty());
    }
}
