package Javabymanvimaampw.java;
/*
public class _26b_HashMapImplementations {
    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();
        MyHashMap<String, String> mp2 = new MyHashMap<>();
    }

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private void intitBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int Hashfunc(K key) {
            int hc = key.hashCode();
            return (Math.abs(hc)) % buckets.length;
        }

        private int searchInBuckets(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key == key) {
                    return i;
                }
            }
            return -1;
        }

    }

    public MyHashMap() {
        initBuckets(DEFAUL_CAPACITY);
    }

    public int size() {
        return n;
    }

    public void put(K key, V value) {
        int bi = HashFunc(key);
        LinkedList<Node> currBuckets = buckets[bi];
        int ei = searchInBuckets(currBuckets, key);
        if (ei == -1) {
            Node node = new Node(key, value);
            currBucket.add(node);
            n++;
        } else {
            Node currNode = currBucket.get(ei);
            currNode.value = value;
        }

    }
}



        public V get(K key) {
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket,key);
        if(ei!= -1){
            Node currNode = currbucket.get(ei);
            return currNode.value;
        }
            return null;
        }
        public V remove(K key) {
    int bi = HashFun(key);
    LinkedList<Node> currbucket = buckets[i];
    int ei = searchInBucket(currBucket,key);
    if(ei!= -1){
        Node currNode = currBucket.get(ei);
        V val = currNode.value;
        currBucket.remove(ei);
        n--;
        return val;
    }
    return null;
        }
        }

public static void main(String[] args) {
    MyHashMap<String, Integer> mp = new MyHashMap<>();
    System.out.println("Testing put");
    mp.put("a", 1);
    mp.put("b", 2);
    mp.put("c", 3);
    System.out.println("Testing size" + mp.size());

}

*/






