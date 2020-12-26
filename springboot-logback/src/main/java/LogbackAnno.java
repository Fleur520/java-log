

import java.util.Calendar;


@lombok.extern.slf4j.Slf4j
public class LogbackAnno {


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
