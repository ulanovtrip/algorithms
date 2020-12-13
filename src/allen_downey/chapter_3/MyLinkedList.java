/**
 *
 */
package allen_downey.chapter_3;

import java.util.*;

public class MyLinkedList<E> implements List<E> {

    private class Node {
        public E data;
        public Node next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }

        @SuppressWarnings("unused")
        public Node(E data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String toString() {
            return "Node(" + data.toString() + ")";
        }
    }

    private int size;            // keeps track of the number of elements
    private Node head;           // reference to the first node

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public static void main(String[] args) {
        // run a few simple tests
        List<Integer> mll = new MyLinkedList<Integer>();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());

        mll.remove(new Integer(2));
        System.out.println(Arrays.toString(mll.toArray()) + " size = " + mll.size());
    }

    @Override
    public boolean add(E element) {
        if (head == null) {
            head = new Node(element);
        } else {
            Node node = head;
            // loop until the last node
            for (; node.next != null; node = node.next) {
            }
            node.next = new Node(element);
        }
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index == 0) {
            // тогда просто создаётся узел, с новым значением и он будет ссылаться на головной.
            head = new Node(element, head);
        } else {
            // если уже есть узлы, то находим узел в предыдущей позиции до index,
            Node tempNode = getNode(index - 1);

            //изначально tempNode.next ссылается на узел в позиции "index".
            // нужно чтобы поле next эл-та "index-1" ссылалось на новый элемент "index"
            // создаётся новый узел, его поле "next" ссылается на узел с номером "index".
            Node newNode = new Node(element, tempNode.next);

            // теперь ссылаем "index-1" узел на новый узел newNode
            tempNode.next = newNode;
        }
        // т.к. добавлен элемент, то нужно увеличить размер size
        size += 1;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean flag = true;
        for (E element : collection) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        head = null;
        size = 0;
    }

    @Override
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public E get(int index) {
        Node node = getNode(index);
        return node.data;
    }


    private Node getNode(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // начинаем цикл с головного узла
        Node node = head;
        // идём по узлам и находим в позиции равной index
        for (int i = 0; i < index; i++) {
            //каждый проход выбирается следующий узел.
            node = node.next;
        }
        return node;
    }

    @Override
    public int indexOf(Object target) {
        // Returns the index of the first occurrence of the specified element in this list

        // определяем головной узел
        Node tempNode = head;
        for (int i = 0; i < size; i++) {
            if (equals(target, tempNode.data)) {
                return i;
            }
            // двигаемся каждую итерацию к следующему узлу, если target != tempNode.data
            tempNode = tempNode.next;
        }
        return -1;
    }

    private boolean equals(Object target, Object element) {
        if (target == null) {
            return element == null;
        } else {
            return target.equals(element);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Iterator<E> iterator() {
        E[] array = (E[]) toArray();
        return Arrays.asList(array).iterator();
    }

    @Override
    public int lastIndexOf(Object target) {
        Node node = head;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (equals(target, node.data)) {
                index = i;
            }
            node = node.next;
        }
        return index;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public boolean remove(Object obj) {
        int index = indexOf(obj);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    @Override
    public E remove(int index) {
        // сохраним узел под index
        E savedElem = get(index);

        if (index == 0) {
            head = head.next;
        } else {
            // сохраняем во временную ссылку предыдущий узел перед удаляемым
            Node beforeDelete = getNode(index - 1);
            //затем ссылаем предстоящий на следующий после удаляемого, так мы удалим узел из списка
            beforeDelete.next = beforeDelete.next.next;
        }
        // после удаления нужно декрементировать size
        size -= 1;
        return savedElem;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean flag = true;
        for (Object obj : collection) {
            flag &= remove(obj);
        }
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E set(int index, E element) {
        Node node = getNode(index);
        E old = node.data;
        node.data = element;
        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        if (fromIndex < 0 || toIndex >= size || fromIndex > toIndex) {
            throw new IndexOutOfBoundsException();
        }
        // TODO: classify this and improve it.
        int i = 0;
        MyLinkedList<E> list = new MyLinkedList<E>();
        for (Node node = head; node != null; node = node.next) {
            if (i >= fromIndex && i <= toIndex) {
                list.add(node.data);
            }
            i++;
        }
        return list;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        int i = 0;
        for (Node node = head; node != null; node = node.next) {
            // System.out.println(node);
            array[i] = node.data;
            i++;
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }
}
