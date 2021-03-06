package ru.geekbrains.lesson10.observe;

import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.lesson10.data.Note;


public class Publisher {
    private List<Observer> observers;

    public Publisher() {
        observers = new ArrayList<>();
    }

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifySingle(Note note) {
        for (Observer observer : observers) {
            observer.updateNote(note);
            unsubscribe(observer);
        }
    }
}
