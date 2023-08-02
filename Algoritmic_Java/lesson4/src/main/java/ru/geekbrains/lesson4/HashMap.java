package ru.geekbrains.lesson4;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

// public class HashMap<K, V> implements Iterable<HashMap.Entity> {
public class HashMap<K, V> implements Iterable<HashMap<K, V>.Entity> {


    private static final int INIT_BUCKET_COUNT = 16; /*указываем первоначальное значение для количества элементов, константа */
    private static final double LOAD_FACTOR = 0.5; /*дополнительная переменная, указывающая уровень заполнения списка, для расширения его размерности */
    private int size = 0; /*вспомогательная переменная, хранит истинное количество переменных (пар ключ-значение) в нашей таблице */

    //  hashMap состоит из массива Bucket-ов (из связных списков)
    private Bucket<K, V>[] buckets;
    

    // создаем свой hashMap два конструктора с указанной размерностью
    // или с заранее указанной размерностью - 16 (константа INIT_BUCKET_COUNT)
    public HashMap(){
        buckets = new Bucket[INIT_BUCKET_COUNT];
    }
    // создаем свой hashMap два конструктора с указанной размерностью
    // или с заранее указанной размерностью - 16 (константа INIT_BUCKET_COUNT)
    public HashMap(int initCount){
        buckets = new Bucket[initCount];
    }

    @Override
    public Iterator<HashMap<K, V>.Entity> iterator() {
        return new Iterator<>() {

            private Iterator<HashMap<K, V>.Entity> currentBuсketIterator;

            private Iterator<Bucket<K, V>> notEmptyBucketIterator = Arrays.stream(buckets).filter(Objects::nonNull).toList().iterator();

            @Override
            public boolean hasNext() {
                return notEmptyBucketIterator.hasNext() || currentBuсketIterator.hasNext() ;
            }

            @Override
            public Entity next() {
                if (currentBuсketIterator!=null && currentBuсketIterator.hasNext()) 
                    return currentBuсketIterator.next();
                else if (notEmptyBucketIterator.hasNext()) {
                    currentBuсketIterator = notEmptyBucketIterator.next().iterator();
                    return currentBuсketIterator.next();
                }
                else throw new NoSuchElementException();
            }
        };
    }    



    // class HashMapIterator implements Iterator<HashMap.Entity>{
    //     private int counter;

    //     @Override
    //     public boolean hasNext() {/*есть ли следующий элемент */
    //         //TODO: Подумать головой, ведь это домашнее задание
    //         if (counter<buckets.length) {
    //             return true;
    //         }
    //         else {
    //             return false;
    //         }
    //     }

    //     @Override
    //     public Entity next() { /*возврат следующего элемента */
    //         //TODO: Подумать головой, ведь это домашнее задание

    //         return null;
    //         // // return buckets.entity(counter++);
    //         // if (!hasNext()){
    //         //     return null;
    //         // }
    //         // return buckets[counter++];

    //     }
    // }



   
    
    @Override
    public String toString() {
        
        for (int i = 0; i < buckets.length; i++) {
            System.out.println(buckets[i]);
        }

        return "HashMap [size=" + size + ", buckets=" + Arrays.toString(buckets) + "]";
    }

    /**
     * добавление элемента в наш, созданный hashMap
     * @param key ключ
     * @param value значение
     * @return возвращает 
     */
    public V put(K key, V value){

        if (buckets.length *LOAD_FACTOR <= size){ /*проверка при добавлении нового элемента , чтобы проверить "загрузку" списка*/
            recalculate(); /*сделать рекалькуляцию и изменить длинну списка */
        }

        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];

        if (bucket == null) { // инициализируем новый элемент списка (если он был пустой)
            bucket = new Bucket();
            buckets[index] = bucket;
        }

        Entity entity = new Entity(); // создаем элемент , который нужно положить в список
        entity.key = key;
        entity.value = value;

        V res = (V)bucket.add(entity); //добавляем entity в список (для этого нужно создать add на самом списке (бакете))

        if (res == null) { /* bucket.add(выше) возвращает null, если список был расширен (такого элемента там не еще было)  */
            size++;         /*поэтому мы изменяем длинну списка (количество элементов в списке)*/
        }
        return res; /*возвращаем список */
    }

    /**
     * удаление элемента из нашего, созданного hashMap
     * @param key ключ
     * @return возвращает, удаляемое значание (по заданному ключу) или null
     */
    public V remove(K key){
        int index = calculateBucketIndex(key); /*находим элемент */
        Bucket bucket = buckets[index]; /*  */
        if (bucket == null) /*если бакет не создан, то удалять нечего */
            return null;

        V res = (V)bucket.remove(key); /*удаляем элемент и возвращаем его значение (необходимо реализовать метод remove на самом списке (бакете))*/
        if (res != null){ /*если вернувшееся значение не null, то небходимо изменить размер  */
            size--;
        }
        return res; /*возвращаем значение удаленного элемента */
    }

    /**
     * нахождение (поиск) элемента по ключу
     * @param key ключ элемента для поиска
     * @return возвращает значение по клюу или null
     */
    public V get(K key){
        int index = calculateBucketIndex(key); /*находим элемент */
        Bucket bucket = buckets[index]; /* */
        if (bucket == null) /*если бакет не найден  - искать чнечего */
            return null; /*возвращаем null */
        return (V)bucket.get(key); /*иначе находим элемент и возвращаем его (необходимо реализовать метод get на самом списке (бакете)) */
    }



    /**
     * вспомогательный метод для нахождения индекса элемента массива
     * @param key ключ
     * @return возвращает индекс
     */
    private int calculateBucketIndex(K key){
        // берем ключ и высчитываем от него хеш-код (модуль чтобы избежать отрицательнго хеш-кода)
        // берем длинну массива и делим на нее хеш-код -> индекс
        return Math.abs(key.hashCode()) % buckets.length;
    }

    /**
     * метод ребалансировки(рекалькуляции) длинный списка
     */
    private void recalculate(){
        size = 0;
        Bucket<K, V>[] old = buckets; /*сохраняем старый список */
        buckets = new Bucket[old.length * 2]; /*пересоздаем новый массив с увеличенной длинной в два раза */
        for (int i = 0; i < old.length; i++){ /*все элементы старого массива записываем в новый */
            Bucket<K, V> bucket = old[i];
            if (bucket != null){
                Bucket.Node node = bucket.head;
                while (node != null){
                    put((K)node.value.key, (V)node.value.value);
                    node = node.next;
                }
            }
        }
    }




 // создадим сущность(тип данных с двумя полями) для узла (хранит в себе ключ и значение)
    public class Entity{
        K key; /*ключ */
        V value; /*значение */
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

    }

    // структура связного списка для нашей HashMap, назовем ее Bucket
    class Bucket<K, V> implements Iterable<Entity> {
        
        private Node head; /* ссылка на первый элемент */

        @Override
        public Iterator<Entity> iterator() {
            return new Iterator<>() {

                private Node currentNode = head;

                @Override
                public boolean hasNext() {
                    return currentNode != null;
                }
                @Override
                public Entity next() {
                    if (currentNode != null) {
                        var result =currentNode;
                        currentNode = currentNode.next;
                        return result.value;
                    }
                    else {
                        throw new NoSuchElementException();
                    }
                }
            };
        }        

        // узел для связного списка Node (указывает на следуюший и хранит в себе значение и ключ)
        class Node{
            Node next;
            Entity value;
        }

        /**
         * метод добавления нового элемента в связный список
         * @param entity что добавляем 
         * @return возвращаем старое значение ключа (если ключ был) или null
         */
        public V add(Entity entity){
            Node node = new Node(); /*создаем новую node */
            node.value = entity; /*значание node - entity */

            if (head == null) { /*если список пуст, то добавляем ноду на голову - первый элемент */
                head = node;
                return null; // если ключа не было - то возвращаем null
            }

            Node currentNode = head; /*если список не пуст, то начиная с головы проходим по всем элементам и сверяем его по ключу */
            while (true){
                if (currentNode.value.key.equals(entity.key)){ /*если ключ был - то для него перезаписываем значение и старое значение возвращаем */
                    V buf = (V)currentNode.value.value; /*временная переменная, содержащая старое значение для ключа */
                    currentNode.value.value = entity.value; /*перезаписываем значение на новое из entity */
                    return buf;/*возвращаем старое значение */
                }
                if (currentNode.next != null){ /*если ключ не совпал - то вопрос - есть ли следующее значение */
                    currentNode = currentNode.next; /*переходим к след значения */
                }
                else { /*если это последний элемент и у него не совпал ключ */
                    currentNode.next = node; /*добавляем в конец новый элемент */
                    return null;/*возвращаем null */
                }
            }

        }
        /**
         * метод удаления элемента из связного списка
         * @param key ключ элемента, который хотим удалить
         * @return возвращает значение удаленного элемента или null
         */
        public V remove(K key) {
            if (head == null) /*если список пуст (голова = null), то удалять нечего */
                return null; /* возвращаем  null*/

            if (head.value.key.equals(key)) { /*если элемент один, то его удаляем и возвращаем результат */
                V buf = (V)head.value.value; /*вспмогательная переменная, чтобы вернуть знаачение */
                head = head.next; /*удаляем первый элемент */
                return buf; /*возвращаем его значение */
            }
            else { /*иначе найти элемент */
                Node node = head;
                while (node.next != null){ /*перебираем все элементы */
                    if (node.next.value.key.equals(key)) {
                        V buf = (V)node.next.value.value; /*сохраняем в буфер найденный элемент */
                        node.next = node.next.next; /*удаляем его */
                        return buf; /*возвращаем значение удаленного элемента */
                    }
                    node = node.next;
                }
                return null; /*если ключ не найден - то удалять нечего , возврат null */
            }
        }

        /**
         * метод поиска элемента в всязном списке
         * @param key ключ для поиска
         * @return возвращает значение найденного элемента или null
         */
        public V get(K key){ 
            Node node = head; /* */
            while (node != null) { /*перебираем все элементы */
                if (node.value.key.equals(key)) /*сравниваем по значению */
                    return (V)node.value.value; /*возвращаем его , если нашли */
                node = node.next;
            }
            return null; /*если не найдено, возвращаем null */
        }

    }













}
