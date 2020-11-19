package tij4.chapter_9.exercise_12;

import java.io.IOException;
import java.nio.CharBuffer;

public class CharGenerator implements Readable{
    public Character[] sequence(int m) {
        Character[] seq = new Character[m];

        for (int i = 0; i < m; i++) {
            seq[i] = 's';
        }
        return seq;
    }

    @Override
    public int read(CharBuffer cb) throws IOException {
        return 777;
    }
}
