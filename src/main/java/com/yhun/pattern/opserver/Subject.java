package com.yhun.pattern.opserver;

public interface Subject {
     void registerObserver(Observer o);
     void removeObserver(Observer o);
     void notigyObserver();
}
