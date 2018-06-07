import org.junit.Assert;

public class HeapTest {
    @org.junit.Test
    public void test() {
        Heap<Integer> heap = new Heap<>(10);
        heap.insert(5);
        heap.insert(4);
        heap.insert(6);
        heap.insert(1);
        Assert.assertEquals(heap.size(), 4);
        Assert.assertTrue(heap.delMax() == 6);
        Assert.assertTrue(heap.delMax() == 5);
        Assert.assertTrue(heap.delMax() == 4);
        Assert.assertTrue(heap.delMax() == 1);
        Assert.assertTrue(heap.isEmpty());
    }
}