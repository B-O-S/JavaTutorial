package Lesson18_Serialization;

import java.io.Serializable;

class Profile implements Serializable {
    private String name;
    private String surname;

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }
}
