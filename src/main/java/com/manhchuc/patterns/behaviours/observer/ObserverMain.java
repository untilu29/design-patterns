package com.manhchuc.patterns.behaviours.observer;

import com.manhchuc.patterns.behaviours.observer.commons.HttpMethod;
import com.manhchuc.patterns.behaviours.observer.observers.ErrorHandler;
import com.manhchuc.patterns.behaviours.observer.observers.Logger;
import com.manhchuc.patterns.behaviours.observer.subjects.HttpService;

public class ObserverMain {
    public static void main(String[] args) {
        HttpService httpService = new HttpService("manhchuc.com",443L,"/api/client", HttpMethod.POST);
        httpService.attach(new Logger());
        httpService.attach(new ErrorHandler());
        httpService.makeRequest();
    }
}
