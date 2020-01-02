package com.manhchuc.patterns.behaviours.observer.observers;

import com.manhchuc.patterns.behaviours.observer.commons.HttpClient;

public class ErrorHandler implements Observer {
    public void update(HttpClient httpClient) {
        if (!httpClient.getHost().matches("[a-z0-9]+[\\.]{1}[a-z0-9]+[\\.]{1}[a-z0-9]+[\\.]{1}[a-z0-9]+")){
            System.out.println("Error while parsing in your host name");
        }
    }
}
