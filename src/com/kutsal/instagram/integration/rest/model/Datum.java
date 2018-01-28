

package com.kutsal.instagram.integration.rest.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Datum {

    @JsonProperty("location")
    private Location location;
    @JsonProperty("comments")
    private Comments comments;
    @JsonProperty("caption")
    private Caption caption;
    @JsonProperty("link")
    private String link;
    @JsonProperty("likes")
    private Likes likes;
    @JsonProperty("created_time")
    private String createdTime;
    @JsonProperty("images")
    private Images images;
    @JsonProperty("type")
    private String type;
    @JsonProperty("users_in_photo")
    private List<Object> usersInPhoto = null;
    @JsonProperty("filter")
    private String filter;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("user")
    private User user;
    @JsonProperty("videos")
    private Videos videos;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("comments")
    public Comments getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    @JsonProperty("caption")
    public Caption getCaption() {
        return caption;
    }

    @JsonProperty("caption")
    public void setCaption(Caption caption) {
        this.caption = caption;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("likes")
    public Likes getLikes() {
        return likes;
    }

    @JsonProperty("likes")
    public void setLikes(Likes likes) {
        this.likes = likes;
    }

    @JsonProperty("created_time")
    public String getCreatedTime() {
        return createdTime;
    }

    @JsonProperty("created_time")
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    @JsonProperty("images")
    public Images getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(Images images) {
        this.images = images;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("users_in_photo")
    public List<Object> getUsersInPhoto() {
        return usersInPhoto;
    }

    @JsonProperty("users_in_photo")
    public void setUsersInPhoto(List<Object> usersInPhoto) {
        this.usersInPhoto = usersInPhoto;
    }

    @JsonProperty("filter")
    public String getFilter() {
        return filter;
    }

    @JsonProperty("filter")
    public void setFilter(String filter) {
        this.filter = filter;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("videos")
    public Videos getVideos() {
        return videos;
    }

    @JsonProperty("videos")
    public void setVideos(Videos videos) {
        this.videos = videos;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
