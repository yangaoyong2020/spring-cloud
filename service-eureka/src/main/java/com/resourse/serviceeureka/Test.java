package com.resourse.serviceeureka;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        /*String start="202110";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMM");//格式化为2017-10
        Calendar calendar = Calendar.getInstance();//得到Calendar实例
        calendar.add(Calendar.MONTH, -3);//把月份减三个月
        Date starDate = calendar.getTime();//得到时间赋给Data
        String st = formatter.format(starDate);//使用格式化Data
        System.out.println(st);*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
        String currentMonth = "202009";
        Date currentDate = sdf.parse(currentMonth);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH) - 3);
        String st=sdf.format(calendar.getTime());
        System.out.println(st);
    }
}
