/**
 *
 */
package allen_downey.chapter_3;

import allen_downey.chapter_2.MyArrayListTest;
import org.junit.Before;

import java.util.ArrayList;

public class MyLinkedListTest extends MyArrayListTest {

    @Before
    public void setUp() throws Exception {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        mylist = new MyLinkedList<>();
        mylist.addAll(list);
    }
}
