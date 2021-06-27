package ru.geekbrains.lesson11.observe;

import ru.geekbrains.lesson11.data.Note;

public interface Observer {
    void updateNote(Note note);
}
