package org.aks.coding.rivigo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        CabService cabService = new CabService();
        System.out.println(cabService.book("2022-02-01", "Delhi"));
        System.out.println(cabService.book("2022-01-01", "Delhi"));
        System.out.println(cabService.book("2022-01-01", "Delhi"));
        System.out.println(cabService.book("2022-01-01", "Delhi"));
        System.out.println(cabService.book("2022-01-02", "Jaipur"));
        System.out.println(cabService.book("2022-01-02", "Jaipur"));
        System.out.println(cabService.book("2022-01-02", "Jaipur"));
        System.out.println(cabService.book("2022-01-02", "Jaipur"));
        System.out.println(cabService.book("2022-01-02", "Jaipur"));
    }
}

class CabService {
    Map<String, Integer> cabCountMapDelhi = new HashMap<>();
    Map<String, Integer> cabCountMapJaipur = new HashMap<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate localDate;
    int delhiInitialCabCount = 2;
    int jaipurInitialCabCount = 2;

    public CabService() {
        localDate = LocalDate.from(formatter.parse("2022-01-01")).plusDays(30);
        cabCountMapDelhi.put("2022-01-01", delhiInitialCabCount);
        cabCountMapJaipur.put("2022-01-01", jaipurInitialCabCount);
    }

    public boolean book(String date, String from_city) {
        LocalDate bookingDate = LocalDate.from(formatter.parse(date));
        if (localDate.isBefore(bookingDate)) {
            return false;
        }
        if ("delhi".equalsIgnoreCase(from_city)) {
            Integer availableCount = cabCountMapDelhi.get(date);
            if (availableCount == null) {
                cabCountMapDelhi.put(date, 9);
                return true;
            }
            if (availableCount > 0) {
                cabCountMapDelhi.put(date, availableCount - 1);
                String nextDayDate = bookingDate.plusDays(1).format(formatter);
                System.out.println("nextDayDate : " + nextDayDate);
                Integer nextDayCount = cabCountMapJaipur.get(nextDayDate);
                cabCountMapJaipur.put(nextDayDate, nextDayCount == null ? jaipurInitialCabCount + 1 : nextDayCount + 1);
                return true;
            }
        }
        if ("jaipur".equalsIgnoreCase(from_city)) {
            Integer availableCount = cabCountMapJaipur.get(date);
            if (availableCount == null) {
                cabCountMapJaipur.put(date, 9);
                return true;
            }
            if (availableCount > 0) {
                cabCountMapJaipur.put(date, availableCount - 1);
                String nextDayDate = bookingDate.plusDays(1).format(formatter);
                System.out.println("nextDayDate : " + nextDayDate);
                Integer nextDayCount = cabCountMapDelhi.get(nextDayDate);
                cabCountMapDelhi.put(nextDayDate, nextDayCount == null ? delhiInitialCabCount + 1 : nextDayCount + 1);
                return true;
            }
        }
        return false;
    }
}