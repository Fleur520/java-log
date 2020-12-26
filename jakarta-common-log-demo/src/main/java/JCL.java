
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Calendar;


public class JCL {

    public static Log log = LogFactory.getLog(JCL.class);


    public static void main(String[] args) {

        long start = Calendar.getInstance().getTime().getTime();
        log.warn(String.valueOf(start));

        for (int i = 0; i < 10; i++) {
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
