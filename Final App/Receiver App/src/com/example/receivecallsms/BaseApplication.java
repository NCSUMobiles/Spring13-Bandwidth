package com.example.receivecallsms;


import android.app.Application;

public class BaseApplication extends Application {

    private StringBuffer sb;
    
    public BaseApplication() {
    	sb = new StringBuffer();
    }

    public StringBuffer getLogText() {
        return sb;
    }

    public void addToLogText(String log) {
        sb.append(log);
        sb.append("\n----------------------------------");
    }
}
