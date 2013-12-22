package Tests;

import Classes.QuickSort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

import java.util.Arrays;

/**
 * Created by Polina on 12/22/13.
 */
@RunWith(Parameterized.class)
public class QuickSortTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    private int[] phrase;
    private int[] match;

    public QuickSortTest(int[] phrase, int[] match) {
        this.match = match;
        this.phrase = phrase;
    }

    @Parameterized.Parameters
    public static java.util.Collection regExValues() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 0, 0}, new int[]{0, 0, 0}},
                {new int[]{5, 6, 2}, new int[]{2, 5, 6}},
                {new int[]{20, 65, 21}, new int[]{20, 21, 65}},
                {new int[]{85, -5, 0}, new int[]{-5, 0, 85}}
        });
    }

    @Test(timeout = 50)
    public void testQuickSort() {
        QuickSort A = new QuickSort();
        A.sort(phrase);
        assertTrue(Arrays.equals(phrase, match));
    }

}
