import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class LRU<K, V> implements Iterable
{
    private HashMap<K, V> map;

    private LinkedList<K> list;

    private int maxSize;

    public LRU(int maxSize)
    {
        this.maxSize = maxSize;
        this.map = new HashMap<>(maxSize * 4 / 3);  /* 避免扩容操作 */
        this.list = new LinkedList<>();
    }

    public V get(K key)
    {
        V value = map.get(key);
        if (value != null) {
            list.remove(key);
            list.addFirst(key);
        }
        return value;
    }

    public void put(K key, V value)
    {
        if (map.containsKey(key)) {
            list.remove(key);
        }
        list.addFirst(key);
        map.put(key, value);
        if (map.size() > maxSize) {
            K toRemoveKey = list.removeLast();
            map.remove(toRemoveKey);
        }
    }

    @Override
    public Iterator iterator()
    {
        return list.iterator();
    }
}
