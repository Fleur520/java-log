package com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Calendar;

public class Slf4j {


    /**
     * 日志对象
     */
    private static final Logger log = LoggerFactory.getLogger(Slf4j.class);


    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        long start = Calendar.getInstance().getTime().getTime();
        log.warn(String.valueOf(start));

        for (int i = 0; i < 10000; i++) {
            log.trace("======trace"+i);
            log.debug("======debug"+i);
            log.info("======info"+i);
            log.warn("======warn"+i);
            log.error("======error"+i);
        }
        long end =Calendar.getInstance().getTime().getTime();
        log.warn(String.valueOf(end));

        log.warn("fininsh"+String.valueOf(end -start));
        System.out.println("fininshabc"+String.valueOf(end -start));
    }
}
