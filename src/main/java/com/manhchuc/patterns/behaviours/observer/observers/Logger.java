package com.manhchuc.patterns.behaviours.observer.observers;

import com.manhchuc.patterns.behaviours.observer.commons.HttpClient;

public class Logger implements Observer{
    public void update(HttpClient httpClient) {
        System.out.println("Updating http client");
    }
}
