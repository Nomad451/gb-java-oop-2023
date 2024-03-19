package ru.gb.lessons.lesson_02.Ex006.Interface;

import ru.gb.lessons.lesson_02.Ex006.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}
