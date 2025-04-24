package Loggers;

import java.time.LocalDateTime;

public abstract  class Logger {
    //  уровни логов чем выше число тем выше опасность
    public static final int DEBUG = 0;
    public static final int INFO = 1;
    public static final int WARNING = 2;
    public static final int ERROR = 3;

    protected int level; // для хранения текущего состояния
    protected Logger nextLogger; // ссылка на след в цепочке логгер

    public void setNextLogger(Logger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level == level) {
            write(formatMessage(level, message));
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected String formatMessage(int level, String message) {
        String levelStr = "";
        switch (level) {
            case DEBUG:
                levelStr = "DEBUG";
                break;
            case INFO:
                levelStr = "INFO";
                break;
            case WARNING:
                levelStr = "WARNING";
                break;
            case ERROR:
                levelStr = "ERROR";
                break;
        }
        return String.format("[%s] %s: %s",
                LocalDateTime.now(), levelStr, message);
    }

    protected abstract void write(String message);
}
