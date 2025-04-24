import Loggers.Logger;
import Loggers.LoggerChain;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = LoggerChain.getChainOfLoggers();

        loggerChain.logMessage(Logger.DEBUG, "This is a debug message");
        loggerChain.logMessage(Logger.INFO, "This is an info message");
        loggerChain.logMessage(Logger.WARNING, "This is a warning message");
        loggerChain.logMessage(Logger.ERROR, "This is an error message");

    }
}