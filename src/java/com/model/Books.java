package com.model;

public class Books {

    private int id;
    private String name;
    private String writer;
    private String category;
    private String size;
    private String length;
    private String fileType;
    private String description;
    private String mediaFireLink;
    private String googleDrivrLink;
    private String imgLink;

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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMediaFireLink() {
        return mediaFireLink;
    }

    public void setMediaFireLink(String mediaFireLink) {
        this.mediaFireLink = mediaFireLink;
    }

    public String getGoogleDrivrLink() {
        return googleDrivrLink;
    }

    public void setGoogleDrivrLink(String googleDrivrLink) {
        this.googleDrivrLink = googleDrivrLink;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    @Override
    public String toString() {
        return "Books{" + "id=" + id + ", name=" + name + ", writer=" + writer + ", category=" + category + ", size=" + size + ", length=" + length + ", fileType=" + fileType + ", description=" + description + ", mediaFireLink=" + mediaFireLink + ", googleDrivrLink=" + googleDrivrLink + ", imgLink=" + imgLink + '}';
    }
    
    
    
}
