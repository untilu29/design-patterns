package com.manhchuc.patterns.behaviours.observer.observers;

import com.manhchuc.patterns.behaviours.observer.commons.HttpClient;

public interface Observer {
    void update(HttpClient httpClient);
}
