package Task8;

import java.util.Objects;

public class Author {
    private String surname;
    private String nationality;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(surname, author.surname) && Objects.equals(nationality, author.nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, nationality);
    }

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Author{" +
                "surname='" + surname + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public String getSurname() {
        return surname;
    }
}
