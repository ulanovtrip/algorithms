package jetbrains_academy.java.polymorphism;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    private final byte[] array;

    AsciiCharSequence(byte[] array) {
        this.array = array.clone();
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] chars = Arrays.copyOfRange(array, start, end);
        return new AsciiCharSequence(chars);
    }

    @Override
    public String toString() {
        return new String(array, StandardCharsets.UTF_8);
    }
}


