/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deu.cse.team.observer;

/**
 *
 * @author PC
 */
public class TestDrive {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        UserObserver userObserver = new UserObserver(weatherData);

        weatherData.setNotice("Good!");
    }

}
