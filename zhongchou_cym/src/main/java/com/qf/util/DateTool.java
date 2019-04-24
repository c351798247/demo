package com.qf.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTool {
    static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public static String dateToStr(Date date) {
        return format.format(date);
    }
}
