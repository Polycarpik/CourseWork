package Tests;

import Classes.MergeSort;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

/**
 * Created by Polina on 12/22/13.
 */

@RunWith(Parameterized.class)
public class MergeSortTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    private int[] phrase;
    private int[] match;

    public MergeSortTest(int[] phrase, int[] match) {
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
        MergeSort A = new MergeSort();
        A.sort(phrase);
        assertTrue(Arrays.equals(phrase, match));
    }

}
