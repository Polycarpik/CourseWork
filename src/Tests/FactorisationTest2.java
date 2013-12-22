package Tests;

import Classes.Factorisation;
import org.junit.After;
import org.junit.Before;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertTrue;

/**
 * Created by Polina on 12/22/13.
 */

@RunWith(Theories.class)
public class FactorisationTest2 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @DataPoint
    public static Factorisation fact1 = new Factorisation(23);
    @DataPoint
    public static Factorisation fact2 = new Factorisation(13);
    @DataPoint
    public static Factorisation fact3 = new Factorisation(17);
    @DataPoint
    public static Factorisation fact4 = new Factorisation(113);

    @Theory
    public void testPrimeFactors2(Factorisation A) {
        assertTrue(A.primeCheck());
    }

}
