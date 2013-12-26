package Tests;

import Classes.BubbleSort;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Polina on 12/22/13.
 */
@RunWith(Parameterized.class)
public class BubbleSortTest {
    private int[] phrase;
    private int[] match;

    public BubbleSortTest(int[] phrase, int[] match) {
        this.match = match;
        this.phrase = phrase;
    }

    @Parameterized.Parameters
    public static Collection regExValues() {
        return Arrays.asList(new Object[][]{
                {new int[]{0, 0, 0}, new int[]{0, 0, 0}},
                {new int[]{5, 6, 2}, new int[]{2, 5, 6}},
                {new int[]{20, 65, 21}, new int[]{20, 21, 65}},
                {new int[]{85, -5, 0}, new int[]{-5, 0, 85}}
        });
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Test(timeout = 50)
    public void testBubbleSort() {
        System.out.println("BubbleSort");
        BubbleSort A = new BubbleSort();
        A.sort(phrase);
        assertTrue(Arrays.equals(phrase, match));

    }
}