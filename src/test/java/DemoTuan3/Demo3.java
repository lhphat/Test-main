package DemoTuan3;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Demo3 {
    static Logger log = LogManager.getLogger(Demo3.class.getName());
    public static void main(String[]args){
        log.debug("debug log");
        log.error("error log");
        log.info("info log");
    }
}
