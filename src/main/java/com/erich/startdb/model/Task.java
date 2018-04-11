//This is defining where the classes are locatied
package com.erich.startdb.model;

//This import all files that need to be supported
import javax.persistence.*;

//This makes a db
@Entity
public  class Task{

//    This creates a id for stuff in the db
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    These are the parts of a object
    private Long id;

    private String text;

    private boolean urgent;

    public Task() {}// empty constructor, it is needed

//    These are a setters, getters, and construtors
    public Task(String text, boolean urgent) {
        this.text = text;
        this.urgent = urgent;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", urgent=" + urgent +
                '}';
    }
}
