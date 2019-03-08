package at.fhj.iit;

public class LoggerService {

    private boolean isDebugMode = false;

    public void setDebug(boolean enable){
        isDebugMode = enable;
    }

    public void log(String msg){
        // TODO add file handler -> write to *.log file
        if(isDebugMode == true)
            System.out.println(msg);
    }

    public LoggerService(boolean isDebugMode) {
        this.isDebugMode = isDebugMode;
    }
}
