/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.observer;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class WeatherData implements Subject {

    private String notice;
    private ArrayList mObserver;

    public WeatherData() {
        mObserver = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        mObserver.add(o);
    }

    public void removeObserver(Observer o) {
        int i = mObserver.indexOf(o);
        if (i >= 0) {
            mObserver.remove(i);
        }
    }
    public void notifyObservers() {
        for (int i = 0; i < mObserver.size(); i++) {
            Observer observer = (Observer) mObserver.get(i);
            observer.update(notice);
        }
    }
    
    public void noticeChanged() {
        notifyObservers();
    }

    public void setNotice(String notice) {
        this.notice = notice;
        noticeChanged();
    }
    
    public String getNotice(){
        return notice;
    }
}
