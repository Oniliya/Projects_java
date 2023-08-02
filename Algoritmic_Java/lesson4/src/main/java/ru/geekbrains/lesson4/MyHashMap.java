package ru.geekbrains.lesson4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.swing.RowFilter.Entry;
import ru.geekbrains.lesson4.HashMap.Bucket;


public class MyHashMap<K, V>  implements Iterable<MyHashMap.Entry<K, V>> {
    private Entry<K, V>[] table;
    private int capacity;
    private int size;



    public MyHashMap(int capacity) {
        this.capacity=capacity;
        table = new Entry[capacity];
    }

    @Override
    public Iterator<Entry<K, V>> iterator() {
        return new MyHashMapIterator();
    }

    private class MyHashMapIterator implements Iterator<Entry<K, V>> {
        private int index;
        private Entry<K, V> currentEntry;
        private Entry<K, V> lastReturned;

        public MyHashMapIterator() {
            index =0;
            currentEntry = null;
            lastReturned = null;
        }

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            // throw new UnsupportedOperationException("Unimplemented method 'hasNext'");
            if (currentEntry != null && currentEntry.next != null) {
                return true;
            }
            while (index < capacity) {
                if (table[index] != null) {
                    return true;
                }
                index++;
            }
            return false;
        }

        @Override
        public Entry<K, V> next() {
            if (!hasNext()) {
                return null;
                // throw NoSuchElementException("----------");
            }
            if (currentEntry == null || currentEntry.next == null) {
                while (table[index] == null) {
                    index++;
                }
                currentEntry = table[index];
            }
            else {
                currentEntry = currentEntry.next;
            }
            lastReturned = currentEntry;
            return currentEntry;
        }
    }

        public static class Entry<K, V> {
            private K key;
            private V value;
            private Entry<K, V> next;

            public Entry(K key, V value, Entry<K, V> next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }

            public K getKey() {
                return key;
            }

            public void setKey(K key) {
                this.key = key;
            }

            public V getValue() {
                return value;
            }

            public void setValue(V value) {
                this.value = value;
            }

            public Entry<K, V> getNext() {
                return next;
            }

            public void setNext(Entry<K, V> next) {
                this.next = next;
            }


            
        }

        // public void put(K key, V value) {
        //     int index = calculateIndex(key);
        //     // Entry<K, V> tablePlace = table[index];
        //     // if (tablePlace == null) {
        //     //     tablePlace = new Entry<K, V>(key, value , null);
        //     // }

        //     Entry<K, V> newElem = new Entry<K, V>(null, null , null);
        //     // int newIndex = calculateIndex(key);
        //     if (table[index]== null) {
        //         return simpleAdd(index, newElem);
        //     }

        // }

        // private boolean simpleAdd(int index, Entry<K, V> newElem) {
        //     table[index] = new Entry<K,V>(null, null, null);
        //     table[index].getEntry().add(newElem);
        //     return true;
        // }


        // private int calculateIndex(K key){
        //     return Math.abs(key.hashCode()) % table.length;
        // }


    //  /**
    //  * добавление элемента в наш, созданный hashMap
    //  * @param key ключ
    //  * @param value значение
    //  * @return возвращает 
    //  */
    // public V put(K key, V value){

    //     if (buckets.length *LOAD_FACTOR <= size){ /*проверка при добавлении нового элемента , чтобы проверить "загрузку" списка*/
    //         recalculate(); /*сделать рекалькуляцию и изменить длинну списка */
    //     }

    //     int index = calculateBucketIndex(key);
    //     Bucket bucket = buckets[index];

    //     if (bucket == null) { // инициализируем новый элемент списка (если он был пустой)
    //         bucket = new Bucket();
    //         buckets[index] = bucket;
    //     }

    //     Entity entity = new Entity(); // создаем элемент , который нужно положить в список
    //     entity.key = key;
    //     entity.value = value;

    //     V res = (V)bucket.add(entity); //добавляем entity в список (для этого нужно создать add на самом списке (бакете))

    //     if (res == null) { /* bucket.add(выше) возвращает null, если список был расширен (такого элемента там не еще было)  */
    //         size++;         /*поэтому мы изменяем длинну списка (количество элементов в списке)*/
    //     }
    //     return res; /*возвращаем список */
    // }
        
}

    
    

