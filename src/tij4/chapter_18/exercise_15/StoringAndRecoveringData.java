package tij4.chapter_18.exercise_15;//: io/StoringAndRecoveringData.java

import java.io.*;

import static petrs.Utils.println;

public class StoringAndRecoveringData {
    public static void main(String[] args)
            throws IOException {
        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Data.txt")));
        out.writeBoolean(true);
        out.writeByte((int) 1000000);
        out.writeBytes((String) "hi");
        out.writeChar(120);
        out.writeChars("hi");
        out.writeDouble(3.14159);
        out.writeFloat(2.1f);
        out.writeInt(1057);
        out.writeLong(123456789L);
        out.writeShort(123);
        out.writeUTF("Nice piece of work");
        out.close();

        DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("Data.txt")));
        println("in.readBoolean() = " + in.readBoolean());
        println("in.readByte() = " + in.readByte());
        println("in.readChar() = " + in.readChar());
        println("in.readChar() = " + in.readChar());
        println("in.readDouble() = " + in.readDouble());
        println("in.readFloat() = " + in.readFloat());
        println("in.readInt() = " + in.readInt());
        println("in.readLong() = " + in.readLong());
        println("in.readShort() = " + in.readShort());
        //println("in.readUTF() = " + in.readUTF());
    }
}