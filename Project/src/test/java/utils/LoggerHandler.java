package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Author : Vignesh
 * 
 * The LoggerHandler class manages logging with customizable formats and
 * dynamic log file creation, utilizing Log4j.
 */
public class LoggerHandler {

    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
        setupLoggers();
    }

    /**
     * Author : Vignesh
     * Sets up the logger configuration, including dynamic log file creation
     * with a unique timestamp in the file name.
     */
    private static void setupLoggers() {
        try {
            String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
            String logFileName = String.format("logs/logfile_%s.log", timestamp);
            PatternLayout layout = new PatternLayout("%d{ISO8601} %-5p %c - %m%n");

            FileAppender timestampedAppender = createFileAppender(logFileName, layout);

            logger.addAppender(timestampedAppender);
        } catch (Exception e) {
            logger.error("Failed to initialize logger file appender", e);
        }
    }

    /**
     * Author : Vignesh
     * Creates and returns a FileAppender instance for writing logs to a specified
     * file with the given layout.
     * 
     * @param fileName The name of the log file.
     * @param layout   The layout format for log messages.
     * @return FileAppender The created FileAppender instance.
     * @throws Exception If any error occurs during creation.
     */
    private static FileAppender createFileAppender(String fileName, PatternLayout layout) throws Exception {
        return new FileAppender(layout, fileName, true);
    }

    /**
     * Author : Vignesh
     * Logs a trace-level message.
     * 
     * @param message The message to be logged.
     */
    public static void trace(String message) {
        logger.trace(message);
    }

    /**
     * Author : Vignesh
     * Logs a debug-level message.
     * 
     * @param message The message to be logged.
     */
    public static void debug(String message) {
        logger.debug(message);
    }

    /**
     * Author : Vignesh
     * Logs an info-level message.
     * 
     * @param message The message to be logged.
     */
    public static void info(String message) {
        logger.info(message);
    }

    /**
     * Author : Vignesh
     * Logs a warn-level message.
     * 
     * @param message The message to be logged.
     */
    public static void warn(String message) {
        logger.warn(message);
    }

    /**
     * Author : Vignesh
     * Logs an error-level message.
     * 
     * @param message The message to be logged.
     */
    public static void error(String message) {
        logger.error(message);
    }

    /**
     * Author : Vignesh
     * Logs a fatal-level message.
     * 
     * @param message The message to be logged.
     */
    public static void fatal(String message) {
        logger.fatal(message);
    }
}
