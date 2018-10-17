package com.heima.util;

import java.util.Calendar;
import java.util.Date;

public class GetTime {
    public void getTime(){
        Calendar caltime = Calendar.getInstance();
        caltime.setTime(new Date());
        Integer year = caltime.get(Calendar.YEAR);
        Integer month = caltime.get(Calendar.MONTH)+1;
        Integer day = caltime.get(Calendar.DAY_OF_MONTH);
        Integer hour = caltime.get(Calendar.HOUR_OF_DAY);
        Integer minute = caltime.get(Calendar.MINUTE);
        Integer second = caltime.get(Calendar.SECOND);
        Integer millsecond = caltime.get(Calendar.MILLISECOND);
    }
}
