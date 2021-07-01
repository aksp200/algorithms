package org.aks.probsolve;

import java.io.*;

public class DayOfProgrammer {

    // Complete the dayOfProgrammer function below.
    static String dayOfProgrammer(int year) {
        if(is1918(year)){
            return calculateFor1918();
        }
        if(year<1918){
            if(isJulianLeap(year)){
                return calculateForLeap(year);
            }
            else {
                return calculateForNonLeap(year);
            }
        }
        if(year>1918){
            if(isGregLeap(year)){
                return calculateForLeap(year);
            }
            else {
                return calculateForNonLeap(year);
            }
        }
        return null;
    }

    static boolean isGregLeap(int y){
        if(y%100==0){
            if(y%400==0){
                return true;
            }
            return false;
        }
        if(y%4==0){
            return true;
        }
        return false;
    }

    static boolean isJulianLeap(int y){
        return  y%4==0;
    }

    static boolean is1918(int year) {
        return year == 1918;
    }

    static String calculateFor1918() {
        return "26.09.1918";
    }

    static String calculateForNonLeap(int y) {
        return "13.09." + y;
    }

    static String calculateForLeap(int y) {
        return "12.09." + y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
