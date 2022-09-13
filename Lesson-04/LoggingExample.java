package Module4;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LoggingExample {

    static Logger logger = Logger.getLogger(LoggingExample.class.getName());
    
    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("src/mylogging.properties"));
        } catch (SecurityException | IOException e1) {
            e1.printStackTrace();
        }
        logger.setLevel(Level.FINE);
        logger.addHandler(new ConsoleHandler());
        //adding custom handler
        logger.addHandler(new MyHandler());
        try {
            //FileHandler file name with max size and number of log files limit
            Handler fileHandler = new FileHandler("/tmp/logger.log", 200000, 5);
            fileHandler.setFormatter(new MyFormatter());
            //setting custom filter for FileHandler
            fileHandler.setFilter(new MyFilter());
            logger.addHandler(fileHandler);
            
            for(int i=0; i<1000; i++){
                //logging messages
                if (i % 7 == 0) {
                	logger.log(Level.SEVERE, "Something wrong-"+i);
                	continue;
                }
                else if (i % 5 == 0) {
                	logger.log(Level.WARNING, "Just a warning message-" + i);
                	continue;
                }
                logger.log(Level.INFO, "Logging message-"+i);
                logger.log(Level.CONFIG, "Config data");
            }
            //logger.log(Level.CONFIG, "Config data");
        } catch (SecurityException | IOException e) {
            e.printStackTrace();
        }
    }

}