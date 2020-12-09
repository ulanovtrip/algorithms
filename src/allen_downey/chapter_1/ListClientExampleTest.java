package allen_downey.chapter_1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class ListClientExampleTest {
    @Test
    public void testListClientExample() {
        ListClientExample lce = new ListClientExample();
        @SuppressWarnings("rawtypes")
        List list = lce.getList();
        assertThat(list, instanceOf(ArrayList.class));
    }

}
