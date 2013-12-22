package Tests;

import Classes.Factorisation;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertTrue;

/**
* Created by Polina on 12/22/13.
*/

@RunWith(Parameterized.class)
public class FactorisationTest {

    private int number;
    private List<Integer> factors;

    public FactorisationTest(int number, List<Integer> factors) {
        this.number = number;
        this.factors = factors;
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Parameterized.Parameters
    public static java.util.Collection someValues() {
        return Arrays.asList(new Object[][]{{
                new Integer(44), Arrays.asList(2, 2, 11)},
                {new Integer(13), Arrays.asList(13)},
                {new Integer(221), Arrays.asList(13,17)},
                {new Integer(1), Arrays.asList()}

        });
    }

    @Test (timeout = 50)
    public void testFactorisation(){
        Factorisation A = new Factorisation(number);
        assertTrue(A.primeFactors().equals(factors));
    }

}
