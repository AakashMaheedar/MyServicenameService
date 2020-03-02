package com.freshworks.domain;

public class MyServicename {

    private final long id;
    private final String content;

    public MyServicename(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
