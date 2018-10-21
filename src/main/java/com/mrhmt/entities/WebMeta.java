package com.mrhmt.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "web_meta")
public class WebMeta {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "meta")
    private String meta;

    @Column(name = "description")
    private String description;

    public WebMeta() {
    }

    public WebMeta(int id, String meta, String description) {
        this.id = id;
        this.meta = meta;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMeta() {
        return meta;
    }

    public void setMeta(String meta) {
        this.meta = meta;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
