package ru.mirea.korenev.practic4;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Seasons season = Seasons.WINTER;
        System.out.println(season.getCharacteristic());//времена года
        switch(season){
            case AUTUMN:
                System.out.println("Я люблю осень");
                System.out.println("Advantage temperature = " + season.getTemperature());
                System.out.println(season.getDescription());
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                System.out.println("Advantage temperature = " + season.getTemperature());
                System.out.println(season.getDescription());
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                System.out.println("Advantage temperature = " + season.getTemperature());
                System.out.println(season.getDescription());
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                System.out.println("Advantage temperature = " + season.getTemperature());
                System.out.println(season.getDescription());
                break;
        }
    }
}
