package ru.javawebinar.topjava.util;

import java.time.LocalTime;

/**
 * Created by hanaria on 5/17/17.
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime)
    {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}