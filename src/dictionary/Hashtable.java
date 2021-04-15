/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Kelash
 */
public class Hashtable implements Map {

    public Entry entries[];

    public int size = 0;

    public float loadFactor;

    public Hashtable(int capacity, float loadFactor) {
        entries = new Entry[capacity];
        this.loadFactor = loadFactor;
    }

    public Hashtable(int capacity) {
        this(capacity, 0.75F);
    }

    public Hashtable() {
        this(101);
    }

    public class Entry {

        Object value, key;
        Entry next;

        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.next = next;
            this.value = value;
        }
    }

    public int hash(Object key) {
        if (key == null) {
            throw new IllegalArgumentException();
        }

        return (key.hashCode() & 0x7FFFFFFF) % entries.length;
    }

    @Override
    public Object get(Object key) {

        int h = hash(key);

        for (Entry e = entries[h]; e != null; e = e.next) {

            if (e.key.equals(key)) {
                return e.value;
            }

        }

        return null;
    }

    @Override
    public Object remove(Object key) {
        int h = hash(key);

        for (Entry e = entries[h], prev = null; e != null; prev = e, e = e.next) {

            if (e.key.equals(key)) {

                Object oldValue = e.value;
                if (prev == null) {
                    entries[h] = e.next;
                } else {
                    prev.next = e.next;
                }
                size--;

                return oldValue;
            }

        }

        return null;
    }

    @Override
    public Object put(Object key, Object value) {

        int h = hash(key);

        for (Entry e = entries[h]; e != null; e = e.next) {

            if (e.key.equals(key)) {
                Object oldValue = e.value;
                e.value = value;
                return oldValue;
            }

        }

        entries[h] = new Entry(key, value, entries[h]);
        ++size;

        if (size > loadFactor * entries.length) {
            rehash();
        }

        return null;
    }

    private void rehash() {

        Entry oldEntries[] = entries;

        entries = new Entry[2 * oldEntries.length + 1];

        for (int k = 0; k < oldEntries.length; k++) {
            for (Entry old = oldEntries[k]; old != null;) {
                Entry e = old;
                old = old.next;
                int h = hash(e.key);
                e.next = entries[h];
                entries[h] = e;
            }
        }

    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {

        Hashtable table = new Hashtable();

        table.put("cat", "A small pet animal ... speak as meow meow");

        table.put("lad", "simply means a boy");

        table.put("orange", "a juicy citrious fruit");

        table.put("book", "a guide of people");

        table.put("teacher", "a man or woman who teached students!");

        System.out.println();

        System.out.println(" lad   :   " + table.get("lad"));

        System.out.println(" book   :   " + table.get("book"));

        System.out.println();

    }

}
