package org.example.testable;

public class LoggerImpl implements Logger {
    boolean logIsCalled = false;

    @Override
    public void log(LogLevel logLevel, String logText) {
        logIsCalled = true;

    }
}
