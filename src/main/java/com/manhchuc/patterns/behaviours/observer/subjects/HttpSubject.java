package com.manhchuc.patterns.behaviours.observer.subjects;

import com.manhchuc.patterns.behaviours.observer.observers.Observer;

public interface HttpSubject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyAllObserve();
}
