package com.example.retrofitmodel;

import com.google.gson.annotations.SerializedName;

public class DataModel {
    @SerializedName("albumId")
    private Integer ablbumId;

    @SerializedName("id")
    private Integer id;

    @SerializedName("title")
    private String title;

    @SerializedName("url")
    private String url;

    @SerializedName("thumbnailUrl")
    private String thumbnailUrl;

    public DataModel(Integer ablbumId, Integer id, String title, String url, String thumbnailUrl) {
        this.ablbumId = ablbumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }


    public Integer getAblbumId() {
        return ablbumId;
    }

    public void setAblbumId(Integer ablbumId) {
        this.ablbumId = ablbumId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }
}
