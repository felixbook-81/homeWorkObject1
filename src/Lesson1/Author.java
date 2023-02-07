package Lesson1;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {

        return this.name;

    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {     // Добавляем метод toString()
        return "Имя -" + " " + this.name + "     " + "Фамилия -" + this.surname;

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name == author.surname && Objects.equals(surname, author.name);


    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
}
