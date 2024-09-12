package org.java.day5;

public class Logger {
	
    private static Logger instance;
    private StringBuilder logMessage;
    
    private Logger() {
    	logMessage=new StringBuilder();
    }
    
    public static Logger getInstance() {
    	if(instance==null) {
    		instance=new Logger();
    	}
    	return instance;
    }
    
    public void log(String message) {
    	logMessage.append(message).append("\n");
    }

    // Method to get all log messages
    public String getLog() {
        return logMessage.toString();
    }
    
    public void clearLog() {
    	logMessage.setLength(0);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger logger = Logger.getInstance();
        logger.log("Application started");
        logger.log("User logged in");
        System.out.println("Logs:");
        System.out.println(logger.getLog());

        logger.clearLog();
        System.out.println("Logs after clearing:");
        System.out.println(logger.getLog());
          
	}

}
