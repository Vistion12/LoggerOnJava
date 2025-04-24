How it works:
1) Download [hw7.jar]
2) Add Jar to project:
   - Go to File → Project Structure → Modules → Dependencies
   - Click + → JARs or directories
   - Select the downloaded hw7.jar file
   - Click OK to apply changes
     
Quick Start Example:

import Loggers.Logger;
import Loggers.LoggerChain;

public class Main {
    public static void main(String[] args) {
        // Get the logger chain
        Logger logger = LoggerChain.getChainOfLoggers();
        
        // Log messages at different levels
        logger.logMessage(Logger.DEBUG, "Debugging information");
        logger.logMessage(Logger.INFO, "User logged in");
        logger.logMessage(Logger.WARNING, "Disk space low");
        logger.logMessage(Logger.ERROR, "Connection failed");
    }
}
Expected Output:
Console: [2023-11-15T10:00:00] INFO: User logged in
Console: [2023-11-15T10:00:00] DEBUG: Debugging information
Files:
error.log will contain ERROR messages
warning.log will contain WARNING messages
