package tij4.chapter_11.exercise_31;

import tij4.examples.shape.Circle;
import tij4.examples.shape.Shape;
import tij4.examples.shape.Square;
import tij4.examples.shape.Triangle;

import java.util.Iterator;
import java.util.Random;

public class Ex31_11 implements Iterable<Shape> {
    private Random rand = new Random(47);

    private Shape[] shapes;

    Ex31_11(int count) {
        shapes = new Shape[count];
        for (int i = 0; i < count; i++) {
            shapes[i] = create();
        }
    }

    public Shape create() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }

    @Override
    public Iterator<Shape> iterator() {
        return new Iterator<Shape>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[index++];
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        Ex31_11 ex31_11 = new Ex31_11(3);

        for (Shape s : ex31_11) {
            System.out.println(s);
        }
    }
}
