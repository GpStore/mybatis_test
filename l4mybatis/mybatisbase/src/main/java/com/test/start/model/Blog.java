package com.test.start.model;

public class Blog {

    int id;
    String name;
    BlogType type;

//    Blog(int id, String name, BlogType type) {
//        this.id = id;
//        this.name = name;
//        this.type = type;
//    }
    public void setType(BlogType type) {
        this.type = type;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Blog {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                "}";
    }

}
