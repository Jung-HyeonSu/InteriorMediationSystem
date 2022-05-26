/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deu.cse.team.observer;

/**
 *
 * @author 정현수
 */
public class UserObserver implements Observer{
    private String notice;
    private WeatherData weatherData;
    
    public UserObserver(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update(String notice) {
        this.notice = notice;
        display(notice);
    }
    public String display(String notice) {
       return notice;
    }
    
}
