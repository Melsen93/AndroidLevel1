package ru.geekbrains.lesson10.observe;

import ru.geekbrains.lesson10.data.Note;

public interface Observer {
    void updateNote(Note note);
}
