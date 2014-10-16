package com.tsystems.projects.logiweb.entities;

import javax.persistence.*;

/**
 * Created by StarKiller on 16.10.2014.
 */
@Entity
@Table(name="capacity")
public class Capacity {
    @Id @GeneratedValue
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="description")
    private String description;

    public Capacity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
