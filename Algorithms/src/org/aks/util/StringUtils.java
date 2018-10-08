package org.aks.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static int stringToInt(String s){
        return Integer.parseInt(s);
    }

    public static List<Integer> stringToInt(List<String> strings){
        List<Integer> integers = new ArrayList<>();
        for(String s : strings){
            integers.add(stringToInt(s));
        }
        return integers;
    }

    public static List<String> splitWithSeparator(String str,String separator){
        String [] strArray = str.split(separator);
        return Arrays.asList(strArray);
    }
}
