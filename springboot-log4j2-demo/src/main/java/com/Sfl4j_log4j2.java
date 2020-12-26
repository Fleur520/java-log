package com;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class Sfl4j_log4j2 {



    private static Logger log = LoggerFactory.getLogger(Sfl4j_log4j2.class);



    public static void main(String[] args) {

        long start = Calendar.getInstance().getTime().getTime();
        log.warn(String.valueOf(start));

        for (int i = 0; i < 100000; i++) {
            log.trace("======trace:{}",i);
            log.debug("======debug:{}",i);
            log.info("======info:{}",i);
            log.warn("======warn:{}",i);
            log.error("======error:{}",i);
        }
        long end =Calendar.getInstance().getTime().getTime();

        log.warn(String.valueOf(end));

        log.warn("fininsh"+String.valueOf(end -start));
        System.out.println("fininshabc"+String.valueOf(end -start));

    }

}
