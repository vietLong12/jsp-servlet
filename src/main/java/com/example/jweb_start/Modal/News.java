package com.example.jweb_start.Modal;

import java.time.Instant;

public class News {
    private int id;
    private String title,content,desc,authorName;
    private Instant createdDate;

    public News() {}

    public News(int id, String title, String content, String desc, String authorName, Instant createdDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.desc = desc;
        this.authorName = authorName;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", desc='" + desc + '\'' +
                ", authorName='" + authorName + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
