/**
 *
 */
package org.aks.algo;

import org.junit.Test;

/**
 * @author akshay
 */

public class JUnit {

    @Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        final String s = null;
        final int stringLength = s.length();
    }

    @Test
    public void testPrintPascalsTriangle() {
        PascalsTriangle.printTriangle(9);
    }

}
