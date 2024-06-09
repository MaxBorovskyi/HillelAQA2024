package org.example.hw14;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class QuadraticEquationTest {
    @DataProvider(name = "equations")
    public static Object[][] equations() {
        return new Object[][]{
                {1, -3, 2, new double[]{2, 1}},  // two roots
                {1, -2, 1, new double[]{1}},  // one root
                {1, 0, 1, new double[]{}}  // no real roots
        };
    }

    @Test(dataProvider = "equations")
    public void testSolve(double a, double b, double c, double[] expectedRoots) {
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double[] roots = equation.solve();
        Assert.assertEquals(roots, expectedRoots);
    }

    @Test
    public void testTwoRealRoots() {
        QuadraticEquation solver = new QuadraticEquation(1, -3, 2);
        double[] roots = solver.solve();
        Assert.assertEquals(roots.length, 2);
        Assert.assertEquals(roots[0], 2.0, 0.0001);
        Assert.assertEquals(roots[1], 1.0, 0.0001);
    }

    @Test
    public void testOneRealRoot() {
        QuadraticEquation solver = new QuadraticEquation(1, -2, 1);
        double[] roots = solver.solve();
        Assert.assertEquals(roots.length, 1);
        Assert.assertEquals(roots[0], 1.0, 0.0001);
    }

    @Test
    public void testNoRealRoots() {
        QuadraticEquation solver = new QuadraticEquation(1, 0, 1);
        double[] roots = solver.solve();
        Assert.assertEquals(roots.length, 0);
    }
}
