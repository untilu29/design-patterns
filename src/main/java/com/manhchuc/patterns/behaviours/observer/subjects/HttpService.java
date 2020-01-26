package com.manhchuc.patterns.behaviours.observer.subjects;

import com.manhchuc.patterns.behaviours.observer.commons.HttpMethod;
import com.manhchuc.patterns.behaviours.observer.observers.Observer;
import com.manhchuc.patterns.behaviours.observer.commons.HttpClient;

import java.util.LinkedList;
import java.util.List;

public class HttpService implements HttpSubject {
    private HttpClient httpClient;
    private List<Observer> observerList = new LinkedList();

    public HttpService(String host, Long port, String path, HttpMethod method) {
        httpClient = new HttpClient();
        httpClient.setHost(host);
        httpClient.setPort(port);
        httpClient.setMethod(method);
        httpClient.setPath(path);
    }

    public void attach(Observer observer) {
        if (!observerList.contains(observer)) observerList.add(observer);
    }

    public void detach(Observer observer) {
        if (observerList.contains(observer)) observerList.remove(observer);
    }

    public void notifyAllObserve() {
        for (Observer o : observerList) {
            o.update(httpClient);
        }
    }

    public void makeRequest() {
        System.out.println("Making request....");
        notifyAllObserve();
    }
}
