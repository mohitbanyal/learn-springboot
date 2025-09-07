package com.mb.learn_springboot.sibling;

public class Siblings {
    private long id;
    private String name;
    private String relation;

    public Siblings(long id, String name, String relation) {
        this.id = id;
        this.name = name;
        this.relation = relation;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRelation() {
        return relation;
    }

    @Override
    public String toString() {
        return "Siblings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", relation='" + relation + '\'' +
                '}';
    }
}
