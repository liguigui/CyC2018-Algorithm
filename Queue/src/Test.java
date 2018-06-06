import org.junit.Assert;

public class Test {
    @org.junit.Test
    public void ListStackTest() throws Exception {
        MyQueue<Integer> queue = new ListQueue<>();
        queue.add(1).add(2).add(3).add(4);
        for (Integer item : queue)
            System.out.println(item);
        Assert.assertEquals(queue.size(), 4);
        Assert.assertFalse(queue.isEmpty());
        Assert.assertTrue(queue.remove() == 1);
        Assert.assertTrue(queue.remove() == 2);
        Assert.assertTrue(queue.remove() == 3);
        Assert.assertTrue(queue.remove() == 4);
        Assert.assertTrue(queue.isEmpty());
    }
}
