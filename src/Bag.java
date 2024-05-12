
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Bag<T> {
    private Map<T, Integer> elementsCount;

    public Bag() {
        elementsCount = new HashMap<>();
    }

    public void add(T item) {
        elementsCount.put(item, elementsCount.getOrDefault(item, 0) + 1);
    }

    public int size() {
        int size = 0;
        for (int count : elementsCount.values()) {
            size += count;
        }
        return size;
    }

    public void merge(Bag<T> otherBag) {
        for (Map.Entry<T, Integer> entry : otherBag.elementsCount.entrySet()) {
            T item = entry.getKey();
            int count = entry.getValue();
            elementsCount.put(item, elementsCount.getOrDefault(item, 0) + count);
        }
    }

    public Bag<T> distinct() {
        Bag<T> distinctBag = new Bag<>();
        for (T item : elementsCount.keySet()) {
            distinctBag.add(item);
        }
        return distinctBag;
    }

    public void printBagContents() {
        System.out.println("Contenet inside the bag");
        for (Map.Entry<T, Integer> entry : elementsCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
