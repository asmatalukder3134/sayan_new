package macys;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Log {
	Logger log;
	public void logger() {
	 log=LogManager.getLogger(Log.class);
		
	}

}
