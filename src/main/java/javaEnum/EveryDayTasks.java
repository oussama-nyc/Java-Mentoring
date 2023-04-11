/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaEnum;


/**
 *
 * @author newuser
 */
public class EveryDayTasks {

    private Week day;

    public Week getDay() {
        return day;
    }

    public void setDay(Week day) {
        this.day = day;
    }

    public EveryDayTasks() {
    }

    public EveryDayTasks(Week day) {
        this.day = day;
    }

    public void tasks(Week day) {

        switch (day) {
            case MONDAY:
                System.out.println("go school");
                break;
            case TUESDAY:
                System.out.println("review java");
                break;
            case WEDNESDAY:
                System.out.println("do codelabs");
                break;
            case THURSDAY:
                System.out.println("do assignment");
                break;
            case FRIDAY:
                System.out.println("go gym");
                break;
            case SATURDAY:
                System.out.println("exercise java");
                break;
            case SUNDAY:
                System.out.println("submit assigmnent");
                break;
        }
    }

}
