package org.aks.algo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Executable;

/**
 * @author akshay
 */

public class JUnit {

    @Test
    public void testNullPointerException() {
        String s = null;
        Assertions.assertThrows(NullPointerException.class,()->getLength(s),"string is null");
    }

    public int getLength(String s){
        return s.length();
    }

    @Test
    public void testPrintPascalsTriangle() {
        PascalsTriangle.printTriangle(9);
    }

}
