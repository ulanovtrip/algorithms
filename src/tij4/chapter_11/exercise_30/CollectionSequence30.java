package tij4.chapter_11.exercise_30;

import tij4.examples.holding.InterfaceVsIterator;
import tij4.examples.typeinfo.pets.Pet;
import tij4.examples.typeinfo.pets.Pets;

import java.util.Collection;
import java.util.Iterator;


public class CollectionSequence30 implements Collection<Pet> {

    private Pet[] pets = Pets.createArray(8);

    @Override
    public int size() {
        return pets.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < pets.length;
            }

            @Override
            public Pet next() {
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Pet pet) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        if (this.size() != 0) {
            for (Pet p : pets) {
                p = null;
            }
        }
    }

    public static void main(String[] args) {
        CollectionSequence30 collectionSequence30 = new CollectionSequence30();
        InterfaceVsIterator.display(collectionSequence30);
        InterfaceVsIterator.display(collectionSequence30.iterator());
    }
}
