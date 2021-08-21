package surefire1266;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

@Category(SampleTestCategory.class)
public class SampleImplTest {

    @Test
    public void testAdd() {
        SampleApi api = new SampleImpl();
        assertEquals(3, api.add(1, 2));
    }

}