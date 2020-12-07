package tij4.chapter_18;//: io/FormattedMemoryInput.java

import java.io.*;

public class FormattedMemoryInput {
    public static void main(String[] args)
            throws IOException {
        try {
            byte[] bytes = BufferedInputFile.read("src/tij4/chapter_18/FormattedMemoryInput.java").getBytes();
            DataInputStream in = new DataInputStream(new ByteArrayInputStream(bytes));

            while (true)
                System.out.print((char) in.readByte());
        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
