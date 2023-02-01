package shop.mtcoding.goldd.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {

    public static String format(Timestamp stamp){
        LocalDateTime nowTime = stamp.toLocalDateTime();
        String nowStr = nowTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return nowStr;
    }

}
