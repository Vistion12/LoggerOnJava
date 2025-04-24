package Loggers;

public class LoggerChain {
    public static Logger getChainOfLoggers() {
        Logger errorLogger = new FileLogger(Logger.ERROR, "error.log");
        Logger warningLogger = new FileLogger(Logger.WARNING, "warning.log");
        Logger infoLogger = new ConsoleLogger(Logger.INFO);
        Logger debugLogger = new ConsoleLogger(Logger.DEBUG);

        errorLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(debugLogger);

        return errorLogger;
    }
}
